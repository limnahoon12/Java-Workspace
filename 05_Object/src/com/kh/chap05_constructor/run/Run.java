package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.*;

public class Run {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setUserId("User01");
		user1.setUserPwd("1234");
		user1.setUserUseName("임나훈");
		
		User user2 = new User("user01", "pass01", "김철수"); //id, pdw, name
	
	}

}
