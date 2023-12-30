package com.psja.check;


interface FuncInterface{
	public String customConcat( String str );
}

public class TestInstanceMethodReference {

	public void test() {
		String st = new String("Hii_");
		callConcat( st::concat );
	}
	
	public void callConcat( FuncInterface f1 ) {
		System.out.println(f1.customConcat("test"));
	}
	
}
