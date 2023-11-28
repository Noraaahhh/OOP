package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.student;
import id.ac.undiksha.ais.people.Lecturer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		student student1 = new student();
		
		student1.setStudentId("2215101084");
		student1.setName("Idalia");
		student1.setBirthDate("15 Desember 2004");
		student1.setGender(false);
		student1.setAddress("Kaliuntu");
		student1.setSmtr(6);
		
		student1.printAll();
		
		Lecturer lecturer1 = new Lecturer();
		
		
		lecturer1.setName("I Nyoman");
		lecturer1.setLecturerId("12345667");
		lecturer1.setAddress("Jln.Udayana");
		lecturer1.setBirthDate("1995-01-15");
		lecturer1.setGender(true);
		lecturer1.setFaculty("FHIS");
		lecturer1.setDepartmen("Hukum");
		lecturer1.setStudyProgram("	Hukum");
		lecturer1.printAll();

		
		
	

	}

}