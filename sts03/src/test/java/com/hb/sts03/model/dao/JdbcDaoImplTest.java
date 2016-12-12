package com.hb.sts03.model.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hb.sts03.model.dto.GuestVo;

public class JdbcDaoImplTest {
	private static GuestDao guestDao;
	
	@BeforeClass
	public static void testBefore() {
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("test-context.xml");
		guestDao=(GuestDao) context.getBean("guestDao");
	}

	@Test
	public void testSelectOne() {
		
		GuestVo bean=new GuestVo(9999,"test",null,9000);
		guestDao.insertOne(bean);
		assertEquals(bean, guestDao.selectOne(bean.getSabun()));
		bean=new GuestVo(9999,"test2",null,9090);
		guestDao.updateOne(bean);
		assertEquals(bean, guestDao.selectOne(bean.getSabun()));
		int cnt=guestDao.selectAll().size();
		guestDao.deleteOne(bean.getSabun());
		assertSame(cnt-1, guestDao.selectAll().size());
	}
	@Test
	public void testSelectAll(){
		List list=guestDao.selectAll();
		assertTrue(list.size()>0);
	}
}
