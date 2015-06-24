package FactoryPattern;

public class Faculty {
	
	public FacultyMember getFacultyMember(String surname, String qualification){
		if(qualification.equals("Phd"))
			return new Phd(surname,qualification);
		else if(qualification.equals("MSc"))
			return new Phd(surname,qualification);
		else
			return null;
	}

}
