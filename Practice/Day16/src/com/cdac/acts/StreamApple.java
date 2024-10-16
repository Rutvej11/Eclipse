package com.cdac.acts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApple {
	public static void main(String[] args) {


		List<Apple> applelist=new ArrayList<Apple>();
		applelist.add(new Apple(200.0,"Green","sweet"));
		applelist.add(new Apple(205.0,"Black","sour"));
		applelist.add(new Apple(250.0,"Red","sweet"));
		applelist.add(new Apple(350.0,"DarkRed","sweet"));
		applelist.add(new Apple(10.0,"White","sour"));
		System.out.println(applelist);	

		//filter by Weight 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Weight of Apple which you want to Remove ");
		Double weight =sc.nextDouble();
		Set<Apple> applestream = applelist.stream()
				.filter((a)->a.getWeight().equals(weight))
				.collect(Collectors.toSet());
		System.out.println(applestream);


		//filter by color
		System.out.println("Enter Color by which you want to Remove Apple");
		sc.nextLine();
		String color =sc.nextLine();
		Set<Apple> applestream1 = applelist.stream()
				.filter((a)-> a.getColor().startsWith(color))
				.collect(Collectors.toSet());
		System.out.println(applestream1);

		//filter by color and Weight
		System.out.println("Enter Color ");
		String color1 =sc.nextLine();
		System.out.println("Enter Wight ");
		Double weight1=sc.nextDouble();
		Set<Apple> applestream2 = applelist.stream()
				.filter((a)-> !a.getColor().startsWith(color1))
				.filter((a)-> !a.getWeight().equals(weight1))
				.collect(Collectors.toSet());
		System.out.println(applestream2);

		//filter by color and Weight and taste

		System.out.println("Enter Color ");
		sc.next();
		String color2 =sc.nextLine();
		System.out.println("Enter Taste ");
		String taste =sc.nextLine();
		System.out.println("Enter Wight ");
		Double weight2=sc.nextDouble();

		Set<Apple> applestream3 = applelist.stream()
				.filter((a)-> !a.getColor().startsWith(color1))
				.filter((a)-> !a.getWeight().equals(weight1))
				.filter((a)-> !a.getTaste().startsWith(taste))
				.collect(Collectors.toSet());
		System.out.println(applestream3);


		//sort by Weight
		Stream<Apple> apl = applelist.stream()
				.sorted((a1,a2)->a1.getWeight().compareTo(a2.getWeight()));

		apl.forEach(System.out::println);
		//sort by color
		Stream<Apple> apl1 = applelist.stream()
				.sorted((a1,a2)->a1.getColor().compareTo(a2.getColor()));

		apl1.forEach(System.out::println);

		//remove red apple
		Set<Apple> applestream4 = applelist.stream()
				.filter((a)-> a.getColor().startsWith("Red"))
				.collect(Collectors.toSet());
		System.out.println(applestream4);

		//remove red apple
		Set<Apple> applestream5 = applelist.stream()
				.filter((a)-> a.getColor().startsWith("Green"))
				.collect(Collectors.toSet());
		System.out.println(applestream5);
	}

}
