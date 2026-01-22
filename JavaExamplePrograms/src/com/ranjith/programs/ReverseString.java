package com.ranjith.programs;

public class ReverseString {

	public static void main(String[] args) {
		String str = "MADAM";
		  String rev = "";
		//StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i >= 0;i--) {
			rev += str.charAt(i);
		}
		
		System.out.println(rev);
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		String revStream = new StringBuilder(str).reverse().toString();
		System.out.println(revStream);
		//check polindrom
		System.out.println(str.equals(rev));
		System.out.println(checkIntPolindrom(101));
	}
	
	static boolean checkIntPolindrom(int n) {
		int rev = 0, temp = n ;
		
		while(n > 0) {
			 rev = rev * 10 + n % 10;
		        n /= 10;
		}
		return rev == temp;
	}
	
	
}
