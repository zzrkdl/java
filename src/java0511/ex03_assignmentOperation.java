/*
		Date  :  2020.05.11
		Author  :  김성진
		Description  :  대입연산자(assignmentOperation)
		Version  :  1.0
*/
package java0511;

public class ex03_assignmentOperation {

	public static void main(String[] args) {
		int age = 35;
		int num = 1;
		
		// 나이를 의미하는 변수 age에
		// 변수값 35를 대입한다.
		// 왼쪽변수 = 오른쪽변수(또는 상수, 식)
		// lValue(항상 변수) = rValue(상수, 변수, 식)
		
		// 부호연산자 : (+), (-)
		int num1 = 10;
		
		System.out.println(+num1);	// +num1 : 10
		System.out.println(-num1);	// -num1 : -10
		System.out.println(num1);	//	num1 : 10
		
		num1 = -num1;
		// num1= -(10);
		System.out.println(num1);
		
		
		age = num1;
		age = 1+25;
		
		//int 35 = 1+34;
	}

}
