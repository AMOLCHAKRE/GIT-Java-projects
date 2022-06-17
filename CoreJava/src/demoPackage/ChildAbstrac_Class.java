package demoPackage;

import javaOOPS.ParentAbstrac_Class;

public class ChildAbstrac_Class extends ParentAbstrac_Class {

	public static void main (String[] args) {
		
		ChildAbstrac_Class CP = new ChildAbstrac_Class();
		CP.Enginesetup();
		CP.SafetyGuidelines();
		CP.planecolour();
		
	}

	@Override
	public void planecolour() {
		// TODO Auto-generated method stub
		
		System.out.println("Follow red colour");
		
	}
	

}
