package com.pet.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pet.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {

		@Autowired
		private MemberMapper membermapper;			//MemberMapper.java 인터페이스 의존성 주입
		
		/*
		 * //회원가입 쿼리 테스트 메서드
		 * 
		 * @Test public void memberJoin() throws Exception{ MemberVO member = new
		 * MemberVO();
		 * 
		 * member.setUserid("test"); //회원 id member.setUserpass("test"); //회원 비밀번호
		 * member.setUsername("test"); //회원 이름 member.setUseremail("test"); //회원 메일
		 * member.setTel("test"); //회원 휴대폰 member.setLevel(0);
		 * membermapper.memberJoin(member); //쿼리 메서드 실행
		 * 
		 * }
		 */
		
		// 아이디 중복검사
		@Test
		public void memberIdChk() throws Exception{
			String id = "test";	// 존재하는 아이디
			String id2 = "test123";	// 존재하지 않는 아이디
			membermapper.idCheck(id);
			membermapper.idCheck(id2);
		}
		
		
		
	}

