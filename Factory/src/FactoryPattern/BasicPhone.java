package FactoryPattern;

public class BasicPhone extends Phone {
	public BasicPhone(String name){
		this.name=name;
		type="BasicPhone";
	}
	
	public String getType(){
		return type;
	}

}
