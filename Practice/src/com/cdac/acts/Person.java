package com.cdac.acts;

public class Person {
private String name;
private Integer age;


public Person() {
	super();
	this.name = "";
	this.age = 0;
}

public Person(String name, Integer age) {
	super();
	this.name = name;
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}


}
