package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("국어 점수 입력 =>");
		int kor= scanner.nextInt();
		System.out.println("수학 점수 입력 =>");
		int math= scanner.nextInt();
		System.out.println("영어 점수 입력 =>");
		int eng= scanner.nextInt();
		
		System.out.println("<<점수 출력>>");
		String result = new StringBuilder()
				.append("국어 점수 :").append(kor + "점\n")
				.append("수학 점수 :").append(math + "점\n")
				.append("영어 점수 :").append(eng + "점\n")
				.append("합계 점수 :").append(kor + math + eng + "점\n")
				.append("평균 점수 :").append(String.format("%.1f", (kor + math + eng) /3.0) + "점\n")
				.toString();
		System.out.println(result);
		scanner.close();

	}

}
