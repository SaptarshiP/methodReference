package com.psja.check;

interface TEST{
	public String apply(String a, String b);
}


public class CheckObjectMethodReference {

	public static void main(String args[]) {
		CheckObjectMethodReference ch1 = new CheckObjectMethodReference();
		test("HII", "PSJA", ch1::mergeString);
	}
	
	public String mergeString( String a, String b ) {
		return a+b;
	}
	
	public static void test(String a, String b, TEST t1) {
		System.out.println( t1.apply(a, b));
	}
}
