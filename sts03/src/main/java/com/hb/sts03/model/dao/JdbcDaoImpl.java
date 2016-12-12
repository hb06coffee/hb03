package com.hb.sts03.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;

import com.hb.sts03.model.dto.GuestVo;

public class JdbcDaoImpl implements GuestDao {
	private JdbcOperations jdbcOperations;
	
	public void setJdbcOperations(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;
	}
	
	private RowMapper rowMapper=new RowMapper<GuestVo>(){

		@Override
		public GuestVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new GuestVo(
					rs.getInt("sabun")
					,rs.getString("name")
					,rs.getDate("nalja")
					,rs.getInt("pay")
					);
		}};
	
	@Override
	public List selectAll() {
		String sql = "select * from guest";
		return jdbcOperations.query(sql, rowMapper);
	}

	@Override
	public void insertOne(GuestVo bean) {
		String sql="insert into guest values (?,?,sysdate,?)";
		Object[] obj={bean.getSabun(),bean.getName(),bean.getPay()};
		jdbcOperations.update(sql, obj);
	}

	@Override
	public GuestVo selectOne(int sabun) {
		String sql="select * from guest where sabun=?";
		return (GuestVo)jdbcOperations.queryForObject(
				sql, new Object[]{sabun}, rowMapper);
	}

	@Override
	public void updateOne(GuestVo bean) {
		String sql="update guest set name=?, pay=? where sabun=?";
		Object[] obj={bean.getName(),bean.getPay(),bean.getSabun()};
		jdbcOperations.update(sql, obj);
	}

	@Override
	public void deleteOne(int sabun) {
		String sql="delete from guest where sabun=?";
		jdbcOperations.update(sql, new Object[]{sabun});
	}

}
