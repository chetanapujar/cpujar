package FactoryPattern;

public class Phd extends FacultyMember {
	
	public Phd(String surname,String qualification){
		this.surname=surname;
		this.qualification=qualification;
		this.designation="Dr.";
	}
	
	public String getDesignation(){
		return(designation);
	}

}
