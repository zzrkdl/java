/*
		Date  :  2020.05.12
		Author  :  김성진
		Description  :(while문 예제)
		Version  :  1.0
*/

package java0513;

public class ex11_whileEx {

	public static void main(String[] args) {
		// while문을 이용해서
		// 주사위를 던졌을 때
		// 5가 나오면 종료하는 프로그램을 만드시오.
		boolean run = true;
		// while(false) 일때 반복문 종료.
		int i = 0;
		int cnt = 0;
		while(run) {
			i = (int)(Math.random() *6) +1;
			cnt++;
			System.out.println("주사위 값은"+i);
			
			if(i==5) {
				run = false;
			}
			
		}
		System.out.println("\n 던진 횟수 : " + cnt);
		System.out.println("프로그램을 종료합니다."+"");
		
		}
		
}