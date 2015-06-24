package FactoryPattern;

public class Msc extends FacultyMember {

	public Msc(String surname,String qualification){
		this.surname=surname;
		this.qualification=qualification;
		this.designation="Mr.";
	}
	public String getDesignation(){
		return(designation);
}
}
