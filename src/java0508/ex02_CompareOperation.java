package java0508;

public class ex02_CompareOperation {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		
		boolean result;
		result = num1 > num2;
		System.out.println("num1 > num2 : "+result);
		System.out.println(num1 + " > " + num2 + " :" + result);
		result = num1 < num2;
		System.out.println("num1 < num2 : "+result);
		System.out.println(num1 + " < " + num2 + " :" + result);

		// num1과 num2가 같다.
		
		result = num1 == num2;
		System.out.println("num1 = num2 : "+result);
		System.out.println(num1 + " = " + num2 + " : " + result);
		
		// num1과 num2가 다르다.
		result = num1 != num2;
		System.out.println("num1 != num2 :" + result);
		System.out.println(num1 +" ! = " + num2 + " : " +result);
		
		// 중요!!
		// 문자열 같은지 비교
		
		
		String str1 = "Java";
		String str2 = "Java";
		String str3 = "자바";
		
		result = str1.equals(str2);
		System.out.println("str1과 str2의 문자비교 : " + result);
		
		result = str1.equals(str3);
		System.out.println("str1과 str3의 문자비교 :" + result);
	}

}
