package com.test01;

public class WhileTest03 {
	public static void main(String[] args) {
		WhileTest03.prn01();
		WhileTest03.prn02();
		WhileTest03.prn03();
	}
	
	public static void prn01() {
		int i = 100;
		while(i>0){
			System.out.println(i);
			i--;
		}
	}
	
	public static void prn02() {
		int i = 1;
		while(i<=100) {
			i++;
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void prn03() {
		int count = 0;
		int sum = 0;
		
		int i = 1;
		while(i<=100) {
			if(i%7==0) {
				count++;
				sum += i;
			}
			i++;
		}
				System.out.println("7의 배수의 개수: " + count + ", 7의 배수의 총합: " + sum);
	}
}