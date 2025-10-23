package ex02자료형;

import java.util.Scanner;

public class Ex03붕어빵출력 {

	public static void main(String[] args) {
		//1. 입력 받는 도구 가져오기
		//2. "구매 희망하는 팥붕 개수" 출력
		//3. 팥붕 개수를 입력받아서 변수 num에 저장
		//4. num 출력!
		
		
		Scanner sc = new Scanner(System.in);
		//	Scanner까지 쓰고 ctrl + space bar + Enter
		
		System.out.print("구매 희망하는 팥붕 개수 : ");
		int num = sc.nextInt();
		//	sc.next()는 문자열 받음
		
		System.out.println("붕어빵의 개수는 " + num + "개 입니다");
		
		
		
	}

}
