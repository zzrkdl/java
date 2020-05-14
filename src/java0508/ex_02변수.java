package java0508;

public class ex_02변수 {

	public static void main(String[] args) {
		
		// 변수 : 프로그램 실행에 필요한 데이터를 저장하기
		// 위해 메모리 공간을 할당하고, 이름을 부여한것
		
		// var num = 0;
		// [변수타입] [변수명] = [변수값];
		
		int age = 35;
		
		int age1;	// 변수선언 
		age1 = 35;	// 변수초기화
		int age2=11,age3=12,age4=13;
				
		
						//위에 똑같은 변수 값이 있어 중복 저장 x 오류
		age= 10;  		//age1에 10을 넣어준다.

		// 변수타입	1byte	2byte	4byte	8byte
		// 1. 정수형   	byte	int		long
		// 2. 실수형    float   double
		// 3. 문자형    char
		// 4. 논리형    boolean
		
		// 1byte = 8bit
		// 1byte = -2^7 ~ (2^7)-1
		byte bNum1 = 120;
		byte bNum2 = 127;
		
		// 4byte = 32bit
		// 4byte = -2^31 ~ (2^31)-1
		// int : -2,147,483,648 ~ 2,147,483,647
		int bNum3 = -129;
		int bNum4 = 128;
		
		// long : 매우크다
		// 8byte = 64bit
		
		int iNum1 =-2147483648;
		int iNum2 = 2147483647;
		
		// int iNum3 = -13221474000083648;
		// int iNum4 = 21231000047483648;
		
		long iNum3 = -13221474000083648L;
		// 변수값에는 L을 썻지만 출력은 되지 않는다.
		long iNum4 = 21231000047483648L;
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		// 실수형
		// float(4byte), double(8byte)
		// double > float
		
		float pi1 = 3.14F;
		double pi2 = 3.14;
		
		float pi3 = 3.1234567890123456789f;
		double pi4 = 3.143217189704512345678132;
		
		System.out.println(pi3);
		System.out.println(pi4);
		
		
		// long은 L 추가
		// float f 추가
	}

}
