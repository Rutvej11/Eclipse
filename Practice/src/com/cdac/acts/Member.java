package com.cdac.acts;

public class Member extends Person {
	private String memberId;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Member(String memberId,String name,Integer age) {
		super(name,age);
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + super.toString()+"]";
	}
	

}
