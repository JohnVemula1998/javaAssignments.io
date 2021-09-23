package com.geekster;

public class Student_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Class IronMan = new Student_Class();
		IronMan.SetStudentId(1);
		IronMan.SetStudentAge(16);
		IronMan.SetStudentName("Tony Stark");
		IronMan.SetStudentBranch("Marvel Institutions of Electronics");
		IronMan.SetStudentYear("2015-2020");
		IronMan.SetStudentCollege("Stark Industrial College");
		
		Student_Class Hulk = new Student_Class();
		Hulk.SetStudentId(2);
		Hulk.SetStudentName("Bruse Banner");
		Hulk.SetStudentAge(21);
		Hulk.SetStudentYear("2015-2018");
		Hulk.SetStudentBranch("Artificial Intelligence");
		Hulk.SetStudentCollege("Marvel Institutions of IT");
		
		
		Student_Class CaptainAmerica = new Student_Class();
		CaptainAmerica.SetStudentName("Steve Rodgers");
		CaptainAmerica.SetStudentAge(24);
		CaptainAmerica.SetStudentBranch("Physics in Metallurgy");
		CaptainAmerica.SetStudentYear("2019");
		CaptainAmerica.SetStudentCollege("Marvel Intstitutions of Physical Sciences");
		CaptainAmerica.SetStudentId(3);
		Student_Class Thor = new Student_Class();
		Thor.SetStudentId(4);
		Thor.SetStudentName("God of Thunders");
		Thor.SetStudentAge(23);
		Thor.SetStudentBranch("AeroSpace Technologies");
		Thor.SetStudentYear("2015");
		Thor.SetStudentCollege("Asgaurd Institute");
		Student_Class Natasha = new Student_Class();
		Natasha.SetStudentName("Natasha Romnov");
		Natasha.SetStudentId(5);
		Natasha.SetStudentAge(22);
		Natasha.SetStudentBranch("Information Technology");
		Natasha.SetStudentYear("2021");
		Natasha.SetStudentCollege("Marvel Comic Institutions");
		
		
		
		System.out.println(IronMan.GetStudentId());
		System.out.println(IronMan.GetStudentName());
		System.out.println(IronMan.GetStudentAge());
		System.out.println(IronMan.GetStudentBranch());
		System.out.println(IronMan.GetStudentYear());
		System.out.println(IronMan.GetStudenCollege());
		
		
		System.out.println(Hulk.GetStudentId());
		System.out.println(Hulk.GetStudentName());
		System.out.println(Hulk.GetStudentAge());
		System.out.println(Hulk.GetStudentBranch());
		System.out.println(Hulk.GetStudentYear());
		System.out.println(Hulk.GetStudenCollege());
		
		
		System.out.println(CaptainAmerica.GetStudentId());
		System.out.println(CaptainAmerica.GetStudentName());
		System.out.println(CaptainAmerica.GetStudentAge());
		System.out.println(CaptainAmerica.GetStudentBranch());
		System.out.println(CaptainAmerica.GetStudentYear());
		System.out.println(CaptainAmerica.GetStudenCollege());
		
		
		System.out.println(Thor.GetStudentId());
		System.out.println(Thor.GetStudentName());
		System.out.println(Thor.GetStudentAge());
		System.out.println(Thor.GetStudentBranch());
		System.out.println(Thor.GetStudentYear());
		System.out.println(Thor.GetStudenCollege());
		
		
		System.out.println(Natasha.GetStudentId());
		System.out.println(Natasha.GetStudentName());
		System.out.println(Natasha.GetStudentAge());
		System.out.println(Natasha.GetStudentBranch());
		System.out.println(Natasha.GetStudentYear());
		System.out.println(Natasha.GetStudenCollege());

	}

}
