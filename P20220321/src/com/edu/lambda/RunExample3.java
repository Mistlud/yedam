package com.edu.lambda;

interface Runnable3 {
	public int run(String str);
}

public class RunExample3 {
	public static void main(String[] args) {
		Runnable3 run = (String str) -> {
			return str.length();

		};
		int lnth = run.run("hello, world");
		System.out.println(lnth);
	}

}
