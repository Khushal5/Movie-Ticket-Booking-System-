import java.io.*;
import java.util.*;

class Person{
	String name = Khushal;
	Strig address= abc;
	Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;

	}
	public String toString(){
		System.out.println("Name: "+name+"\nAddress: "+address);
		return null;
	}

}
class Student extends Person{
	String program =MBA;
	int year=2020;
	double fee=500000;
	Student(String name,String address,String program,int year,double fee){
		this.name=name;
		this.address=address;
		this.program=program;
		this.year=year;
		this.fee=fee;

	}
	public String getProgram(){
		return program;
	}
	public void setProgram(String program){
		this.program=program;
	}
	public int getYear(){
		return year;

	}
	public void setYear(int year){
		this.year=year;
	}
	public double getFee(){
		return fee;

	}
	public void setFee(double fee){
		this.fee=fee;
	}
	public String toString(){
		System.out.println("Name: "+name+"\nAddress: "+address);
		return null;
	}

	class Staff extends Person{
		
	}


























	
}