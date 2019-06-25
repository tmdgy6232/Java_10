package com.biz.exec;

import com.biz.exec.service.AddService;

public class Exec_03 {

	public static void main(String[] args) {

		AddService as = new AddService();
		
		//i가 0~9까지 반복되는 동안
		for (int i=0; i<10; i++) {
			
			//i가 0일때 j는 0~9까지 반복하고
			// i가 1이되면 다시 j는 반복한다.
			for(int j=0; j<10; j++) {
				as.add(i,j);
			}	
		}
		int sum=0;
		for (int i =0; i<10; i++) {
			sum = sum+as.add(0, i+1);
		}
		System.out.println("sum : " + sum);
		
	}

}
