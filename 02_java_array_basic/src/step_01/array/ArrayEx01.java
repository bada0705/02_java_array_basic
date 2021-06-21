package step_01.array;
/*
 * 
 * # 배열 ( array ) 
 * 
 *  [ 형식 ]
 *  
 *  1) 자료형[] 배열명 = new 자료형[방의개수];
 *  2) 자료형 배열명[] = new 자료형[방의개수];
 * 
 * 	- '같은 자료형'의 데이터를 '여러개' 저장하기 위한 자료구조
 *  - 인덱스 (index) : 0부터 시작하는 방 번호가 부여된다.
 *  - 배열은 주소변수이다.
 *  - 배열을 크기가 변하지 않는다. 배열을 삭제하여도 배열의 크기는 고정되어있다.
 *  - 배열의 요소를 지우는 것은 배열의 초깃값으로 다시 저장하는 것을 의미한다.
 * 
 * */
public class ArrayEx01 {

	public static void main(String[] args) {
		//1. 일반 변수(값 저장)
		int nVar;  //int nVar = 0;
		nVar = 3;
		System.out.println(nVar);
		
		
		
		
		
		
		
		// 2. 주소변수 (주소 변수 )
		int[] arr ; //int [] arr  = null;   방은 대괄호만 가능하다 null 은 초기화
		
		arr = new int[5] ;
		System.out.println(arr);  //주소 
		
		System.out.println(arr[0] ) ; //배열은 생성시에 초깃값이 셋팅이 되어있다 .
		System.out.println(arr[1] );  //정수혈 배열은 초깃값이 0 , 나머지는 직접 확인
		System.out.println(arr[2]) ;
		System.out.println(arr[3]) ;
		System.out.println(arr[4]) ;
		System.out.println(arr[5])	;
		//java.lang.ArrayIndexOutOfBoundsException: 5
		//배열의 범위를 넘어설 때 발생하는 에러메세지 (해당 에러는 암기 및 스스로 해결 )
		
		
		
		
		
		
	}

}
