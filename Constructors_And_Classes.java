package ArunSir_Assignment;
import java.util.Scanner;
public class Constructors_And_Classes {

	public static void main(String[] args) {
		//parameterized constructor
		Students std1 = new Students("Amit","Male","Hyderabad",525,23,1234569870,12341);
		  System.out.println(std1.Name);
		  System.out.println(std1.Gender);
		  System.out.println(std1.Address);
		  System.out.println(std1.Total_Marks);
		  System.out.println(std1.Age);
		  System.out.println(std1.Phone_No);
		  System.out.println(std1.Roll_No);
		 //default constructor
		Students std2 = new Students();
		  System.out.println(std2.Name);
		  System.out.println(std2.Gender);
		  System.out.println(std2.Address);
		  System.out.println(std2.Total_Marks);
		  System.out.println(std2.Age);
		  System.out.println(std2.Phone_No);
		  System.out.println(std2.Roll_No);
		Scanner s = new Scanner(System.in);
		Students std3= new Students(s.nextInt());
		//constructor using dynamic user defined values
		s.close();
		   System.out.println(std3.Name);
		   System.out.println(std3.Gender);
		   System.out.println(std3.Address);
		   System.out.println(std3.Total_Marks);
		   System.out.println(std3.Age);
		   System.out.println(std3.Phone_No);
		   System.out.println(std3.Roll_No);
		Students std4 = new Students("Rani","Female","Banglore",520,21,215467890,12344);
		   System.out.println(std4.Name);
	       System.out.println(std4.Gender);
	       System.out.println(std4.Address);
	       System.out.println(std4.Total_Marks);
	       System.out.println(std4.Age);
	       System.out.println(std4.Phone_No);
		   System.out.println(std4.Roll_No);
		Students std5 = new Students(std2,std4);//using copy constructor
		     std5.Name="Hari";
		     std5.Phone_No=225467891;
		     std5.Roll_No=12345;
		       System.out.println(std5.Name);
		       System.out.println(std5.Gender);
		       System.out.println(std5.Address);
		       System.out.println(std5.Total_Marks);
		       System.out.println(std5.Age);
		       System.out.println(std5.Phone_No);
			   System.out.println(std5.Roll_No);
			int max =0;
			//finding Maximum Marks 
	int[] arr = {std1.Total_Marks,std2.Total_Marks,std3.Total_Marks,std4.Total_Marks};
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}if(max ==std1.Total_Marks) {
			System.out.println(std1.Name+" is topper of class");
		}else if(max ==std2.Total_Marks) {
			System.out.println(std2.Name+" is topper of class");
		}else if(max == std3.Total_Marks) {
			System.out.println(std3.Name+" is topper of class");
		}else {
			System.out.println(std1.Name+" is topper of class");
		}
	}
	

}

class Students{
	String Name,Gender,Address;
	int Age,Total_Marks,Phone_No;
	 int Roll_No;
	
	public Students() {
		this.Name="John";
		this.Gender="Male";
		this.Address="Vizag";
		this.Total_Marks=510;
		this.Age= 24;
		this.Phone_No= 1784563210;
		this.Roll_No=12342;
		
	}
	public Students(final int rno){
		Scanner str = new Scanner(System.in);
		this.Name=str.nextLine();
		this.Gender=str.nextLine();
		this.Address=str.next();
		this.Total_Marks=str.nextInt();
		this.Age= str.nextInt();
		this.Phone_No= str.nextInt();
	    this.Roll_No= rno;
		str.close();
		
	}
	public Students(String nam,String gen,String add,int marks,int age,int phno,final int rno) {
		Name = nam;
		Gender = gen;
		Address = add;
		Total_Marks= marks;
		Age = age;
		Phone_No=phno;
		Roll_No= rno;
	}
	//copy constructor
	public Students(Students std2,Students std4) {
		// TODO Auto-generated constructor stub
		Gender=std2.Gender;
		Total_Marks=std2.Total_Marks;
		Address=std2.Address;
		Age = std4.Age;
	}
	 
}
