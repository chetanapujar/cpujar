package FactoryPattern;

public class SmartPhone extends Phone{
	public SmartPhone(String name){
		this.name=name;
		type="SmartPhone";
	}
	
	public String getType(){
		return type;
	}
}