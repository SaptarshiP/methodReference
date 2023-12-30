package com.psja.check;

interface TESTONE{
	public String apply( String s1, String s2 );
}

public class TestStaticMethodReference {

	public void testMerge() {
		check("HII", "PSJA2", TestStaticMethodReference::merge);
	}
	
	public static String merge( String a, String b ) {
		return a+b;
	}
	
	public void check( String a, String b, TESTONE t1 ) {
		System.out.println( t1.apply(a, b) );
	}
	
}
