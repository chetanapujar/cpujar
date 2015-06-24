package FactoryPattern;

public class Demo {
	public static void main(String[] args){
		Faculty ff = new Faculty();
		FacultyMember fm1 = ff.getFacultyMember("Rao","PhD");
		System.out.println(fm1.getDesignation() + " " + fm1.getName());		
		fm1 = ff.getFacultyMember("Karmali","MSc");
		System.out.println(fm1.getDesignation() + " "+ fm1.getName());
	}

}
