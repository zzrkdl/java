/*
		Date  :  2020.05.11
		Author  :  김성진
		Description  :  입력(Scanner)
		Version  :  1.0
*/
package java0511;

import java.util.Scanner;
// 두번째
// Scanner 클래스는 java.util 패키지에 있는 입력 클래스
public class ex_08입력 {

	public static void main(String[] args) {
		// 첫번째
		// 스캐너를 사용하기 위해 스캐너 객체 선언
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		String address;
		
		// String 여러 문자 저장
		// System.out.println("println");
		// System.out.print("print");
		// System.out.println("두개 차이점 확인하기");
		// ln : 줄바꿈
		
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		// 세번째
		// 변수에 입력한 값을 담는다.
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
		sc.nextLine().trim();
		
		System.out.println("주소를 입력하세요.");
		address = sc.nextLine();
		//trim() : 앞뒤 공백을 제거한다.
		// 띄어쓰기 하고싶은 경우  sc.next ----> sc.nextLine
		
		System.out.println();
		System.out.println("====== 출력내용 =======");
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 나이 : " + age);
		System.out.println("입력한 주소 : " + address);
	}

}
