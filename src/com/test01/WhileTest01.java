package com.test01;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		WhileTest01.testWhile();
		WhileTest01.testWhile2();
		WhileTest01.testWhile3();
		WhileTest01.testWhile4();
		WhileTest01.testWhile4_2();
	}
	public static void testWhile() {
		int i = 1;
		while(i<=10) {
			System.out.println(i+" 번째 반복문 수행중..");
			i++;
		}
		System.out.println(i);
	}
	
	public static void testWhile2() {
		String str = "ABCDE";
		int index = 0;
		while(index < str.length()) {
			char ch = str.charAt(index);
			System.out.println(index + ":" + ch);
			index++;
		}
	}
	
	public static void testWhile3() {
		int sum = 0;
		
		System.out.print("정수 하나 입력: ");
		int num = new Scanner(System.in).nextInt();
		
		int i = 1;
		while(i<=num) {
			sum += i;
			
			i++;
		}
		System.out.println("sum: " + sum);
	}
	
	public static void testWhile4() {
		int i = 1;
		while(true) {
			System.out.println(i);
			i++;
			
			if(i == 10) {
				break;
			}
		}
	}
	
	public static void testWhile4_2() {
		Scanner sc = new Scanner(System.in);
		int i= 0;
		while(true) {
			System.out.print("정수 하나 입력: ");
			if(i == 4) {
				System.out.println("4!! 종료!!!");
				break;
			}
		}
	}
	
	
	
	
	
}
