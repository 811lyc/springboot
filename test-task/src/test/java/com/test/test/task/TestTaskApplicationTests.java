package com.test.test.task;

import com.test.test.task.entity.Address;
import com.test.test.task.service.impl.TaddressServiceImpl;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class TestTaskApplicationTests {
	@Autowired
	private  TaddressServiceImpl taddressService;
	@Test
	void contextLoads() {
		Address address = new Address(1,"河南","濮阳","18739307758","李小哥",new Date(),new Date());
		boolean save = taddressService.save(address);
		System.out.println(save);
	}

}
