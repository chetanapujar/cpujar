package FactoryPattern;

public class PhoneFactory {
	public Phone getPhone(String type){
		if(type.equals("SmartPhone"))
			return new SmartPhone("sp");
		else if(type.equals("BasicPhone"))
			return new BasicPhone("bp");
		else
			return null;
	}

}
