package com.biz.exec.service;

public class AddService {

	//num1과 num2는 호출하는 곳에서
	// 전달한 2개의 정수값을 받는 바구니 역할
	public int add(int num1, int num2) {
		System.out.print("num1 :" + num1);
		System.out.print("\tnum2 :" + num2);
		System.out.println();
		
		return num1+num2;
	}
	
	public void add() {
		System.out.println("나는 아무일도 하지않는다네");
	}

	public void add(int num1, int num2, int num3) {
		
		int sum = num1 + num2 + num3;
		System.out.println("sum : " + sum );
	}
}
