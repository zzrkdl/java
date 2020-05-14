package java0508;

public class ex02_char {

	public static void main(String[] args) {
		
		// 문자형 변수타입 char(2byte)
		char ch1;
		ch1 = 'A';
		System.out.println("A");
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 'B';
		System.out.println((int)ch2);
		
		char ch3 = 'a'; //97
		char ch4 = 'b'; //98
		System.out.println((int)ch3);
		System.out.println((int)ch4);
		
		int num1 = 65;
		System.out.println(num1);
		// 숫자를 문자형으로 바꿀때 변수명 앞에 (char)
		// 문제1
		// 본인이름을 숫자로 표시해보시오,
		char ch5 = '김'; // 숫자 몇인지 표시
		
	}
}