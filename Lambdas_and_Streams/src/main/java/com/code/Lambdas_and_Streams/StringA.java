package com.code.Lambdas_and_Streams;
import java.util.*;
import java.util.stream.Collectors;

public class StringA {
	public static List<String> find(List<String> str){
		List<String> resultStr = str.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
		return resultStr;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> arr = new ArrayList<String>(n);
		for(int i = 0; i < n; i++) {
			String z = sc.next();
			arr.add(z);
        }
        List<String> finalstr = new ArrayList<String>();
       	finalstr = find(arr); 
       	for(String i : finalstr)  
       		System.out.println(i);  
       	sc.close();
	}
}
