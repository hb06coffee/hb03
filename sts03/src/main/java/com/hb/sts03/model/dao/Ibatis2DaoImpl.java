package com.hb.sts03.model.dao;

import java.util.List;




import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hb.sts03.model.dto.GuestVo;

public class Ibatis2DaoImpl extends SqlMapClientDaoSupport implements GuestDao {

	private SqlMapClientTemplate template;

	public Ibatis2DaoImpl() {
		template=getSqlMapClientTemplate();
	}
	
	@Override
	public List selectAll() {
		return template.queryForList("selectAll");
	}

	@Override
	public void insertOne(GuestVo bean) {
		template.insert("insertOne",bean);
	}

	@Override
	public GuestVo selectOne(int sabun) {
		return (GuestVo) template.queryForObject("selectOne",sabun);
	}

	@Override
	public void updateOne(GuestVo bean) {
		template.update("updateOne",bean);
	}

	@Override
	public void deleteOne(int sabun) {
		template.delete("deleteOne",sabun);
	}

}
