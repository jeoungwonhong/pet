package com.pet.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ReviewServiceTests {
	private static final Logger log = LoggerFactory.getLogger(ReviewServiceTests.class);
	 
	@Autowired
	private SCMService service;
	 
    /* 게시판 목록 테스트 */
    @Test
    public void testGetList() {
        
        service.getList().forEach(list -> log.info("" + list));        
        
    }
}
