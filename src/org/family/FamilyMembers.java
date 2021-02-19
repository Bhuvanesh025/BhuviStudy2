package org.family;

public class FamilyMembers {
	public void phoneName() {
		System.out.println("Phone Name: Samsung");
	}
	public void phoneMieiNum() {
		System.out.println("Phone IMEI: 123456");
	}
	public void family2() {
		System.out.println("Family-Mother");
	}
	public void family3() {
		System.out.println("Family-Brother");
	}
	public static void main(String[] args) {
		FamilyMembers a = new FamilyMembers();
		FamilyMembers b = new FamilyMembers();
		FamilyMembers c = new FamilyMembers();
		FamilyMembers d = new FamilyMembers();
		a.phoneName();
		b.family2();
		c.family3();
		d.phoneMieiNum();
		
		
	}
	
	
}
