package com.code.Lambdas_and_Streams;
import java.util.*;
import java.util.stream.IntStream; 

public class PalindromList {
	static List<String> palindrome(List<String> list)
    {
		List<String> l2=new ArrayList<String>();
		for(String i:list){
		String t = i.replaceAll("\\s+", "").toLowerCase();
		if(IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
		l2.add(i);}
		return l2;
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    List<String> arr = new ArrayList<String>(n);
	    for(int i = 0; i < n; i++) {
	      	String z = sc.next();
	      	arr.add(z);
	    }
	    arr=palindrome(arr);
		System.out.println("The palindromes in the string list are: ");
		
		for(String Palindromes:arr)
			System.out.println(Palindromes);
	    sc.close();      
		}
}
