package com.hb.sts03.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.hb.sts03.model.dto.GuestVo;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapSession;

public class IbatisDaoImpl implements GuestDao {
	private SqlMapClient sqlMapClient;
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}
	@Override
	public List selectAll() {
		try {
			return sqlMapClient.queryForList("selectAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insertOne(GuestVo bean) {
		SqlMapSession session;
		Connection conn=null;
		try {
//1.			sqlMapClient.startTransaction();
//1.			sqlMapClient.getCurrentConnection().setAutoCommit(false);
//1.			sqlMapClient.insert("insertOne", bean);
//1.			sqlMapClient.insert("insertOne", bean);
//1.			sqlMapClient.commitTransaction();
			conn=sqlMapClient.getDataSource().getConnection();
			conn.setAutoCommit(false);
			session = sqlMapClient.openSession(conn);
			session.insert("insertOne", bean);
			session.insert("insertOne", bean);
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
//1.				sqlMapClient.getCurrentConnection().rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			try {
				conn.setAutoCommit(true);
//1.				sqlMapClient.endTransaction();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}			
		}
	}

	@Override
	public GuestVo selectOne(int sabun) {
		
		try {
			return (GuestVo) sqlMapClient.queryForObject("selectOne",sabun);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateOne(GuestVo bean) {
		try {
			sqlMapClient.update("updateOne", bean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteOne(int sabun) {
		try {
			sqlMapClient.delete("deleteOne", sabun);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
