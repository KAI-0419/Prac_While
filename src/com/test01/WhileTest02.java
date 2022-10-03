package com.test01;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
		WhileTest02.testDoWhile();
		WhileTest02.testDoWhile2();
		
	}
	public static void testDoWhile() {
		int i = 11;
		
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
	}
	public static void testDoWhile2() {
		Scanner sc = new Scanner(System.in);
		String letter = null;
		do {
			System.out.print("문자를 입력해 주세요: ");
			letter = sc.next();
			System.out.println("letter: " + letter);
		}while(!letter.equals("exit")); 
	}
}
