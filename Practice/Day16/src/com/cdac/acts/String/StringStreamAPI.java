package com.cdac.acts.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cdac.acts.Apple;

public class StringStreamAPI {
	public static void main(String[] args) {

		//creating list of String 
		List<String> stringlist=new ArrayList<String>(Arrays.asList("Hello","Hello","Hello","How","are","You","?"));
		System.out.println(stringlist);

		//distinct()
		List<String> str = stringlist.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(str);

		//print all with uppercase
		stringlist.stream()
		.forEach(str1-> System.out.println( str1.toUpperCase()));


		//print with spcific letter
		List<String> str1=stringlist.stream()
				.filter(str2->str2.startsWith("H"))
				.collect(Collectors.toList());
		
		System.out.println(str1);
		
		//concat all strings in list
		String str3 =stringlist.stream().collect(Collectors.joining()) ;
		System.out.println(str3);
			
		//ends with something
		List<String> str4=stringlist.stream()
				.filter(str2->str2.endsWith("o"))
				.collect(Collectors.toList());
		
		System.out.println(str4);
	}
}
