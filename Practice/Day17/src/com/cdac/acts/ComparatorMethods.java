package com.cdac.acts;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorMethods implements Comparable<ComparatorMethods>{

	private Double weight;
	private String color;
	private String taste;



	public ComparatorMethods(Double weight, String color, String taste) {
		super();
		this.weight = weight;
		this.color = color;
		this.taste = taste;
	}




	public Double getWeight() {
		return weight;
	}




	public void setWeight(Double weight) {
		this.weight = weight;
	}



	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public String getTaste() {
		return taste;
	}



	public void setTaste(String taste) {
		this.taste = taste;
	}





	@Override
	public String toString() {
		return "ComparatorMethods [weight=" + weight + ", color=" + color + ", taste=" + taste + "]";
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}



	@Override
	public int compareTo(ComparatorMethods o) {
		// TODO Auto-generated method stub
		return this.getWeight().compareTo(o.getWeight());
	}
	

	public static void main(String[] args) {
		List<ComparatorMethods> ls=new ArrayList<>();
		ls.add(new ComparatorMethods(200.0,"Green","sweet"));
		ls.add(new ComparatorMethods(205.0,"Black","sour"));
		ls.add(new ComparatorMethods(250.0,"Red","sweet"));
		ls.add(new ComparatorMethods(350.0,"DarkRed","sweet"));
		ls.add(new ComparatorMethods(10.0,"White","sour"));

		System.out.println(ls);

		List<ComparatorMethods> cs=ls.stream()
				.sorted(Comparator.comparing(ComparatorMethods::getTaste))
				.collect(Collectors.toList());
		System.out.println(cs);

	}




}
