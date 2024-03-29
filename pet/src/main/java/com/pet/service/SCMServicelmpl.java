package com.pet.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pet.mapper.ReviewMapper;

import com.pet.mapper.ScmCalculateMapper;
import com.pet.model.PayVO;

import com.pet.model.ReservationVO;
import com.pet.model.ReviewVO;
import com.pet.model.ScmCalculate;

@Service
public class SCMServicelmpl implements SCMService {
	
	private static final Logger log = LoggerFactory.getLogger(SCMServicelmpl.class);
	
	@Autowired
	SCMService scmservice;
	
	@Autowired
	ReviewMapper reMapper;
	
	//예약
	@Override
	public void reservation(ReservationVO reservation) throws Exception{
		scmservice.reservation(reservation);
	}
	
	//예약 order condition변경
	@Override
	public int reservationOrder(String businesscode) throws Exception{
		return scmservice.reservationOrder(businesscode);
	}
	
	//예약 check condition변경
	@Override
	public int reservationCheck(String businesscode) throws Exception{
		return scmservice.reservationCheck(businesscode);
	}
	
	//예약 completion condition변경
	@Override

	public int reservationCompletion(String businesscode) throws Exception{
		return scmservice.reservationCompletion(businesscode);
	}

	// 리뷰 목록
	@Override
	public List<ReviewVO> getList() {
		return reMapper.getList();
	}
	
	// 정산관리 리스트
	public List<PayVO> scmCalGetList(ScmCalculate cal) throws Exception{
		log.info("(service)scmCalGetlist()....." + cal);
		
		return ScmCalculateMapper.scmCalGetList(cal);
	}
    

}
