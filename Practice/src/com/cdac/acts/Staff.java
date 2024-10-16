package com.cdac.acts;

public class Staff extends Person {
	private String staffId;

	public String getMemberId() {
		return staffId;
	}

	public void setMemberId(String memberId) {
		this.staffId = memberId;
	}

	public Staff(String memberId,String name,Integer age) {
		super(name,age);
		this.staffId = memberId;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + staffId + super.toString()+"]";
	}
	

}
