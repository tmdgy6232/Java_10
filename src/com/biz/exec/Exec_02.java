package com.biz.exec;

import com.biz.exec.service.AddService;

public class Exec_02 {

	public static void main(String[] args) {

		
		AddService as = new AddService();
		
		for(int i = 0; i< 10; i++) {
			as.add();
		}
		//i값이 0부터 9까지 1씩 증가되면서
		// add(num1, num2)매서드에 보내서
		//num2에 담기게 된다.
		for(int i =0; i<10; i++) {
			as.add(3,i);
		}
		int sum =0;
		for (int i=0; i<10 ; i++) {
			sum += as.add(4, i);
		}
		//sum 변수 값을 console 보이기
		System.out.println("sum : " + sum);
	}

}
