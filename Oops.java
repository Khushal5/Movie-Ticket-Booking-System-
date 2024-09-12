class Student {

    String name;
    int age;

public void printInfo(){
	System.out.println(this.name);
    System.out.println(this.age);

}
}

public class Oops{
	public static void main(String args[]){
		Student s1 = new Student ();
		s1.name ="Khushal";
		s1.age=19;
		s1.printInfo();


	}
}