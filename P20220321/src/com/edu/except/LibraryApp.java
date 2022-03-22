package com.edu.except;

import com.edu.abstracts.LibraryExe;

// 목적 : 필요할 때마다 인스턴스를 만들지 않고 메모리를 적게 쓰기 위해 

public class LibraryApp {
	public static void main(String[] args) {
		LibraryExe exe = LibraryExe.getInstance();
		exe.run();
	}
}


// 호출 방법만 기술, 최종적으로 객체에서 실행
// 인터페이스 메소드는 실행블록 필요없는 추상 메소드로 선언
// 