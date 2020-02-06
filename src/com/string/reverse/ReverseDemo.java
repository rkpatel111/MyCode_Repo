package com.string.reverse;

public class ReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="MOM";
		String reverse="";
		
		int length=s.length()-1;
		
		for(int i=length;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		if(reverse.equals(s)) {
			System.out.println("pelindrom");
		}else {
			System.out.println("Not pelindrom");
		}
		System.out.println(reverse);
	}

}
