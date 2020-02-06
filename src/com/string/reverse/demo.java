package com.string.reverse;

public class demo {
public static void main(String[] args) {
	String s="?50,000";
	
	String val=s.replaceAll("[^a-zA-Z0-9_-]", "");
	System.out.println(val);
}
}
