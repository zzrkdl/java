/*
 Date : 2020.05.08
 Author : KIM SUNG JIN
 Description : ex02_String
 version : 1.0
 */
package java0508;

public class ex02_String {
	public static void main(String[] args) {
		String str1 = "자바공부는";
		String str2 = "재미있어";
		String str3 = "너무 어려워";
		String result;					//변수선언
		
		result = str1 + str2;			//변수초기화
		System.out.println(result);
		
		result = str1 + str2 + str3;    //변수초기화
		System.out.println(result);
		
		result = str1 + 8.0;
		System.out.println(result);
		
		System.out.println(str1 + str2);
		System.out.println(str1 + "너무"+ str2);
		
	}
}