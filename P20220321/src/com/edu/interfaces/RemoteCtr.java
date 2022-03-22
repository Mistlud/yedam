package com.edu.interfaces;

// 필드, 생성자 X
// implements(명령된 값을 넣을 수 없음 - 상수값(final)만 입력 가능)

public interface RemoteCtr { // 구현 클래스, 구현 객체

	public static final int MAXVOL = 10;
	//public final int MAXVOL = 10; 정적 키워드가 없으면 maxvol는 현재 클래스의 인스턴스 변수?
	//모든 RemoteCtr Object가 자체적으로 maxvol의 사본을 가져야 함
	public static final int MINVOL = 0;


	public void powerON();

	public void powerOFF();

}
