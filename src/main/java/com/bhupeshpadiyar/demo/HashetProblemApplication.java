package com.bhupeshpadiyar.demo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bhupeshpadiyar.demo.bean.DemoBean;
import com.bhupeshpadiyar.demo.service.BeanService;

@SpringBootApplication
public class HashetProblemApplication implements CommandLineRunner{
	
	@Autowired
	private BeanService beanService;

	public static void main(String[] args) {
		SpringApplication.run(HashetProblemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DemoBean bean1 =  new DemoBean();
		bean1.setId(1);
		List<Integer> list1 =  new LinkedList<Integer>();
		list1.add(2);
		list1.add(3);
		list1.add(5);
		bean1.setIntegerList(list1);
		
		DemoBean bean2 =  new DemoBean();
		bean2.setId(2);
		List<Integer> list2 =  new LinkedList<Integer>();
		list2.add(3);
		list2.add(7);
		list2.add(8);
		bean2.setIntegerList(list2);
		
		DemoBean bean3 =  new DemoBean();
		bean3.setId(6);
		List<Integer> list3 =  new LinkedList<Integer>();
		list3.add(11);
		list3.add(5);
		bean3.setIntegerList(list3);
		
		DemoBean [] demobeanArray = {bean1, bean2, bean3};
		HashSet<Integer> finalHashSet =  beanService.convertToHashSet(demobeanArray);
		
		System.out.println(finalHashSet.toString());
	}

}
