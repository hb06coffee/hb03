package com.hb.sts03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.sts03.model.dao.GuestDao;
import com.hb.sts03.model.dto.GuestVo;

@Controller
public class AddController {
	@Autowired
	private GuestDao guestDao;

	@RequestMapping("guest/form")
	public String addform() {
		return "addform";
	}
	@RequestMapping(value="/guest",method=RequestMethod.POST)
	public String insert(GuestVo bean) {
		guestDao.insertOne(bean);
		return "redirect:/guest";
	}
}
