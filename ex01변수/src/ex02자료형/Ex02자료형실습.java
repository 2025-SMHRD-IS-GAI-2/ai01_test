package ex02자료형;

public class Ex02자료형실습 {

	public static void main(String[] args) {
		// static main check 단축키 -> alt + v
		
		// 1. 논리형(boolean type)
		//	- 키워드 : boolean
		//  - 크기 : 1byte
		//	- 범위(저장가능한 데이터) : true, false
		boolean isRainy = false;
		
		
		
		// 2. 문자형(Character Type)
		//  - 키워드 : char
		//  - 크기 : 2byte
		//	- 범위 : 0 ~ 65535(unicode 문자 범위)
		char grade = 'A';
		// * 문자형은 글자 1개만 저장가능하다
		
		// 글자 1개 이상의 문자열은 아래와 같이 저장!
		String name = "신권주";
		// char는 홑따옴표, String은 쌍따옴표!
		
		
		
		//	3. 정수
		//	1) byte
		//	   -키워드 : byte
		//	   -크기 : 1byte
		//     -범위 : -128 ~ 127
		byte age = 21;
		
		//	2) short
		//     -키워드 : short
		//	   -크기 : 2byte
		//     -범위 : -32,768 ~ 32,767
		short lunchMenu = 12000;
		
		//	3) int
		//     -키워드 : int
		//	   -크기 : 4byte
		//     -범위 : (엄청 길다) 약 -21억~21억
		int lotto = 1_631_432_063;
		
		//	4) long
		//     -키워드 : long
		//	   -크기 : 8byte
		//     -범위 : (엄청 길다) 
		long global = 8_000_000_000L;
		//	: Long임을 명시할 수 있는 대문자 L 추가!
		//	  (안해주면 int로 인식해서 오류 발생)
		
		
		//	4. 실수(소수점이 있는 숫자)
		//	 1) float
		//     -키워드 : float
		//	   -크기 : 4byte
		//     -범위 : (+/-)1.4E -45 ~(+/-)3.402823
		float weight = 78.5f;
		//	: 기본형 double에서 float으로 명시할 수 있는 f 추가!
		//	대문자, 소문자 상관 없음
		
		//	 2) double
		//     -키워드 : double
		//	   -크기 : 8byte
		//     -범위 : (+/-)14.9E -324 ~(+/-)
		double pi = 3.141592;
		
		
		
		
		
	}

}
