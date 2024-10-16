package com.cdac.acts;

public class Apple {
private Double weight;
private String color;
private String taste;

public Apple(Double weight, String color, String taste) {
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
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(obj instanceof Apple) {
	Apple obj1=(Apple) obj;
	return this.getWeight().equals(obj1.getColor());
	}
	return false;
}

@Override
public String toString() {
	return "Apple [weight=" + weight + ", color=" + color + ", taste=" + taste + "]";
}



}
