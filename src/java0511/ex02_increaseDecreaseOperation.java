/*
		Date  :  2020.05.11
		Author  :  김성진
		Description  :  증감연산자(increaseDecreaseOperation)
		Version  :  1.0
*/
package java0511;

public class ex02_increaseDecreaseOperation {

	public static void main(String[] args) {
		// 단항연산자
		// 증가 감소 연산자 (++ , --)
		
		// ++num : num이 가지고 있는 값에
		// 1을 증가한 뒤에 연산에 적용
		// num++ : num이 가지고 있는 값을
		// 연산에 적용한 뒤 1을 증가
		
		int num = 5;
		System.out.println("num 값 : " + num);
		
		++num;
		System.out.println("++num 값 :" + num);
		
		num++;
		System.out.println("num++ 값 :" + num);
		
		int num1 = 5;
		int result1; 
		
		result1 = ++num1;
		System.out.println("++num1 result1 :"+result1);             //6
		// result1 = ++num1;
		// num1 = num1 + 1;
		// result1 = num1;
		
		result1 = num1++;
		System.out.println("num1++ result1 : " + result1);          //7
		// result1 = num1++;
		// result1 = num1;
		// num1 = num1 + 1;
		
		// example
		
		int num2 = 10;
		--num2;
		System.out.println(num2); //  예상결과값 적기 ( 1 )   9
		// num2= num2 -1;
		// num2= 10 -1;
		// num2= 9;
		
		
		int result2 = --num2;
		System.out.println(result2); //  예상결과값 적기 ( 0 )   8  
		// result2 = --num2;
		// num2 = num2 -1;
		// num2 = 9 -1;
		// result2 = num2;
		// result2 = 8;
		
		result2 = num2--;
		System.out.println("result2: " + result2 + ", num2 : " + num2); //  예상결과값 적기 ( 0 )   8
		// result2 = num2--;
		// result2 = num2;
		// result2 = 8;
		// num2 = num2 -1;
		// num2 = 8 - 1;
		
		// example
		int result3;
		System.out.println("num1 :: " + num1);
		System.out.println("num2 :: " + num2);
		result3 = ++num1 + ++num2;  //16
		System.out.println("num1");			// 예상값     7   8
		System.out.println("num2");			// 예상값     7   8 
		System.out.println("result");       // 예상값     14  16
		
		
		result3 = num1++ + num2++;          //   16 / 9 9
		System.out.println(result3);
		result3 = num1++ + ++num2;			//   19 / 10 10
		result3 = ++num1 + num2++;			//   20 / 11 10
		System.out.println(result3);
		
		
		int num3 = 5;
		int num4 = 11;
		int result4;
		
		result4 = ++num3 + --num4; // (6)  + (10)   = (16)     
		result4 = num4++ - num3--; // (4) = (10)11 - (6) 5   
		result4 = num3++ - ++num4; // (-7) =   (5) -  (12)   
		System.out.println(result4);
		
		
	}

}
