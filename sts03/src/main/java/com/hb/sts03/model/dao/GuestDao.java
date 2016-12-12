package com.hb.sts03.model.dao;

import java.util.List;

import com.hb.sts03.model.dto.GuestVo;

public interface GuestDao {
	
	List selectAll();
	void insertOne(GuestVo bean);
	GuestVo selectOne(int sabun);
	void updateOne(GuestVo bean);
	void deleteOne(int sabun);
}
