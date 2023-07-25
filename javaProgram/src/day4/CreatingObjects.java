package day4;
import java.util.Scanner;
import day3.Person;

public class CreatingObjects {
	public static void main(String args[])
	{
	Person p1=new Person(); //default constructor invoked
	Scanner sc=new Scanner(System.in);
	String name, city;
	int age;
	System.out.println("Enter Person details :Name, age and city");
	name=sc.nextLine();
	age=sc.nextInt();
	city=sc.nextLine();
	//p1.personName=name private member can't accessible
	p1.setName(name);p1.setAge(age);((Person) p1).setPersonCity(city);
	System.out.println("Person Details Name :"+p1.getName()+"\tAge :"+p1.getAge()+"\tCity :"+p1.getPersonCity());
	System.out.println("Enter Person details :Name, age and city");
	name=sc.nextLine();
	age=sc.nextInt();
	city=sc.nextLine();
	p1=new Person();
	//parameterized constructor invoked);
	System.out.println("Person Details Name :"+p1.getName()+"\tAge :"+p1.getAge()+"\tCity :"+p1.getPersonCity());
	sc.close();
	}

}
