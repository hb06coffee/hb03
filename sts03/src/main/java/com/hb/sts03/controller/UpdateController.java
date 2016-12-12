package com.hb.sts03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.sts03.model.dao.GuestDao;
import com.hb.sts03.model.dto.GuestVo;

@Controller
public class UpdateController {
	@Autowired
	private GuestDao guestDao;
	
	@RequestMapping(value="/guest/{idx}/form"
			, method=RequestMethod.GET)
	public String editform(
			@PathVariable("idx")int sabun
			,Model model) {
		model.addAttribute("bean", guestDao.selectOne(sabun));
		return "editform";
	}
	
	@RequestMapping(
			value="/guest/{idx}"
			, method=RequestMethod.PUT)
	public String guestUpdate(
			@PathVariable("idx")int sabun
			,GuestVo bean
			) {
		guestDao.updateOne(bean);
		return "redirect:/guest";
	}

	@RequestMapping(value="/guest/{idx}"
			,method=RequestMethod.DELETE)
	public String guestDelete(@PathVariable("idx")int sabun) {
		guestDao.deleteOne(sabun);
		return "redirect:/guest";
	}
}










