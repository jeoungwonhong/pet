package com.pet.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pet.model.ScmCalculate;
import com.pet.service.SCMService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/scm")
public class SCMController {
	
	private static final Logger logger = LoggerFactory.getLogger(SCMController.class);
	
	@Autowired
	private SCMService scmservice;
	

	//main 페이지 이동
	@RequestMapping(value = "scmJoin", method = RequestMethod.GET)
	public void ScmJoinGET() {
		logger.info("scmJoin");
	}
	
	//main 페이지 이동
	@RequestMapping(value = "adminmain", method = RequestMethod.GET)
	public void MainGET() {
		logger.info("adminmain");
	}
	
	//calculate 페이지 이동
	@RequestMapping(value = "calculate", method = RequestMethod.GET)
	public void CalculateGET(ScmCalculate cal, Model model) throws Exception {
		logger.info("calculate 접속......." + cal);
		
		/* 목록 출력 데이터 */
		List list = SCMService.scmCalGetList(cal);
		
		model.addAttribute("list", list);
	}
	
	//product 페이지 이동
	@RequestMapping(value = "product", method = RequestMethod.GET)
	public void ScmGET() {
		logger.info("scm페이지 진입");
	}
	
	//order 페이지 이동
	@RequestMapping(value = "order", method = RequestMethod.GET)
	public void OrderGET() {
		logger.info("order");
	}
	
	//check 페이지 이동
	@RequestMapping(value = "check", method = RequestMethod.GET)
	public void CheckGET() {
		logger.info("check");
	}
	//completion 페이지 이동
	@RequestMapping(value = "completion", method = RequestMethod.GET)
	public void CompletionGET() {
		logger.info("completion");
	}
	//QnA 페이지 이동
	@RequestMapping(value = "q&a", method = RequestMethod.GET)
	public void QnAGET() {
		logger.info("q&a");
	}
	//QnA Info페이지 이동
	@RequestMapping(value = "q&a2", method = RequestMethod.GET)
	public void QnA2GET() {
		logger.info("q&a2");
	}
	//review 페이지 이동
	@RequestMapping(value = "review", method = RequestMethod.GET)
	public void ReviewGET() {
		logger.info("review");
	}
	//review Info 페이지 이동
	@RequestMapping(value = "review2", method = RequestMethod.GET)
	public void Review2GET() {
		logger.info("review2");
	}
	
	
	
	
}
