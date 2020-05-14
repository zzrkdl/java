/*
		Date  :  2020.05.12
		Author  :  김성진
		Description  :(Do-while문 예제)  (Up&Down 게임)
		Version  :  1.0
*/
package java0514;

import java.util.Scanner;

public class Ex03_DoWhileEx {

	public static void main(String[] args) {
		// 3번 안에 맞추면 통과!
		// 그 이후에 맞추면 벌칙!
		
		int answer = (int)(Math.random()* 45) +1;  //랜덤 숫자의 지정을 한다.
		int input = 0;  // 지정하여 입력한 숫자
		int count = 0;  // 시도한 횟수
		
		boolean run = true;   //  정답을 찾을 시 while문을 종료 하기 위해 만듬
							  //  false
		
		Scanner sc = new Scanner(System.in);        // 개체 만들기
		System.out.println("Up & Down Game 시작!");  // 프린트 하여 주 제목을 보여준다.
	
		do {                           
			System.out.println("1부터 45까지 숫자를 말하세요!");  // 위에만든 랜덤 범위
															   // 안의 숫자를 입력
			input = sc.nextInt();  // 지정하여 입력한 숫자 
			count++; // 지정하여 입력할 때 
					 // 몇번 입력을 했는가 횟수를 지정
			
			if(answer > input) {           // 정답보다 작은 숫자를 입력했을 때
				System.out.println("Up! 더 큰수를 말하세요!");
			} else if(answer < input) {    // 정답보다 큰 수를 입력했을 때 
				System.out.println("Down! 더 작은수를 말하세요!");
			} else {  // 정답을 찾았을때
				System.out.println("정답은" + answer + "입니다.");
				System.out.println("시도한 횟수는" + count + "번 입니다.");
				run = false;  //멈춘다
				
				if(count <=3) {
					System.out.println("통과!~");
				} else {
					System.out.println("벌칙입니다.");
				}
				//break
			}
		}while(run);
	
		
		
	}

}
