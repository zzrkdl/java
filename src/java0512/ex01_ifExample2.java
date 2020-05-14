/*
		Date  :  2020.05.12
		Author  :  김성진
		Description  : 조건연습문제2(ifExample2)
		Version  :  1.0
*/
package java0512;

import java.util.Scanner;

public class ex01_ifExample2 {

	public static void main(String[] args) {
		// 스캐너를 사용해서 국어, 영어 , 수학점수를 
		// 입력받아서 총점, 평균을 구하시오.
		// 평균점수를 이용하여
		// A+ , A , B+ , B , C+ , C , D+ , D , F
		// 프로그램을 만들어보시오.
		Scanner sc = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		int num3=0;
		double num4;
		double num5;
		String grade;
		
		
		
		System.out.println("국어 점수를 입력하세요.");
		num1 = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요.");
		num2 = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		num3 = sc.nextInt();
	
		num4 = num1+num2+num3;
		num5 = num4/3;
		
		
		System.out.println("총점은"+num4+"입니다");
		
		System.out.println("평균은"+num5+"입니다");
		
		
		
		if (num5 <= 100) {
			if(num5 >= 90) {
				
				if(num5 >= 95) {
					grade ="A+";
				}else {
					grade = "A";
				}
			} else if (num5 >= 80) {
				if (num5 >= 85) {
					grade = "B+";
				} else {
					grade = "B";
				}
			} else if (num5 >= 70) {
				if (num5 >= 75) {
					grade = "C+";
				} else {
					grade = "C";
				}
			} else if (num5 >=60) {
				if (num5 >=65) {
					grade = "D+";
				} else {
					grade = "D";
				}
			} else {
				grade = "F";
			}
			System.out.println("당신의 학점은" + grade + "입니다!");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	
		
	}


