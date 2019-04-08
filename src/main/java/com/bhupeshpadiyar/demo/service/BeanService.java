package com.bhupeshpadiyar.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.bhupeshpadiyar.demo.bean.DemoBean;

@Service
public class BeanService {
	
 	public HashSet<Integer> convertToHashSet(DemoBean [] demobeanArray) {
		System.out.println("Bean Length : " +demobeanArray.length);
		
		HashSet<Integer> finalHashSet =  new HashSet<>();
		
		for(int i=0; i< demobeanArray.length; i ++) {
			
			DemoBean beanOnject  = demobeanArray[i];
			
			Set<Integer> integerSet = new HashSet<Integer>(beanOnject.getIntegerList());
			
			finalHashSet.add(beanOnject.getId());
			finalHashSet.addAll(integerSet);
			
		}
		
		return finalHashSet;
 	}

}
