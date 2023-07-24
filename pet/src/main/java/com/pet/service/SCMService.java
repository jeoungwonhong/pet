package com.pet.service;

import java.util.List;

import com.pet.model.ReservationVO;
import com.pet.model.ReviewVO;

public interface SCMService {

	//예약
	public void reservation(ReservationVO reservation) throws Exception;
	
	//order 페이지 목록
	public int reservationOrder(String businesscode) throws Exception;
	
	//check 페이지 목록
	public int reservationCheck(String businesscode) throws Exception;
				
	//completion 페이지 목록
	public int reservationCompletion(String businesscode) throws Exception;
		
	
    public List<ReviewVO> getList();

}
