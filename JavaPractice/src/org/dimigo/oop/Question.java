package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나의 학년은?");
		String answer= scanner.nextLine();
		if("2".equals(answer)){
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
		}
		System.out.println("나의 반은?");
		answer= scanner.nextLine();
		if("4".equals(answer)){
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
		}
		System.out.println("나의 번호는?");
		 answer= scanner.nextLine();
		if("24".equals(answer)){
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
		}
		scanner.close();
	}

}
