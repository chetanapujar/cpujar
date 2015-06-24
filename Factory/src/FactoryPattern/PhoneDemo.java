package FactoryPattern;

public class PhoneDemo {
	public static void main(String[] args){
		PhoneFactory pf = new PhoneFactory();
		Phone p = pf.getPhone("SmartPhone");
		System.out.println("Name:" + p.getName() + "  " + "Type:" +  p.getType());
		
		p = pf.getPhone("BasicPhone");
		System.out.println("Name:" + p.getName() + "  " + "Type:" + p.getType());
	}

}
