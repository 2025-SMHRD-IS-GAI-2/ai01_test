package ex01변수;

import java.util.Scanner;

public class Ex01변수클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// - 주석 : 실행하는 코드가 아닌 메모 작성용
		// 궈어어어어언 주우우웅우ㅜ우우우니이이이이이임
		
		// - Java에서의 영역
		// : 중괄호 한쌍 중에서 열리는 중괄호 부터 
		//	 닫히는 중괄호를 만나기 전까지의 부분
		
		// - 클래스 생성시, 첫번째 체크박스 = main
		//   메인 안쪽{}에 코드를 작성한다.
		
		// - 저장하는 단축키는 ctrl s(언제나 저장하는 습관)
		// - 실행하는 단축키는 ctrl f11
		// - 글자 키우는 단축키 : ctrl +
		// - 글자 줄이는 단축키 : ctrl -
		// - 코드 한줄 작성이 끝나면 세미콜론;
		// - 결과창 : 콘솔창
		// - 출력하고 싶은 텍스트는 () 안에 넣어준다.
		
		System.out.print("Hello world!");
		// print : 해당 코드 실행 후, 개행x
		// println : 해당 코드 실행 후, 개행o
		
		System.out.println("자동완성 단축키");
		// - syso 작성후, ctrl space
		System.out.println("이번에는 될까?"); 
		
		// 입력을 해보자(콘솔창을 통해서 입력 받기)
		
		
		Scanner sc = new Scanner(System.in);
		// 1. 입력받게 해주는 도구 Scanner 가져오기
		//	  S대문자 주의!!, ctrl space해서 import 생성
		
		System.out.print("나이를 입력해 주세요 >>");
		// 출력문 println 다음에 입력 받으면 개행돼서 입력됨
		// 바로 옆에 출력은 print
		
		int box = sc.nextInt();
		// 2. 우리가 붙여준 이름 sc를 호출해서 입력받기!
		// sc.next() : 문자를 입력받는 기능(행위)
		// sc.nextInt(): 정수를 입력 받는 기능(행위)
		// = 더이상 같다라는 의미 x,
		// =을 기준으로 오른쪽의 데이터를 왼쪽에 넣는다
		// 정수를 영어로 integer 라고 한다.
		
		System.out.println(box);
		
		
		
		
		
		
		
	}

}
