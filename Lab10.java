import java.util.ArrayList;
import java.util.Scanner;

class Student { 
private String name;
private ArrayList<Integer> marks;
public Student(String name, ArrayList<Integer> marks) { 
this.name = name;
this.marks = marks;

}
public int totalMarks() { 
int total = 0;
for (int i = 0; i < marks.size(); i++) 
{ total += marks.get(i);
}

return total;

}
public int pcmMarks() {

return marks.get(0) + marks.get(1) + marks.get(2);
}
public static void main(String[] args) 
{ Scanner scanner = new Scanner (System.in);
System.out.print("Enter the student's name: "); 
String name = scanner.nextLine();
ArrayList<Integer> marks = new ArrayList<Integer>(5); 
System.out.print("Enter the marks for Physics: "); 
marks.add(scanner.nextInt()); 
System.out.print("Enter the marks for Chemistry: "); 
marks.add(scanner.nextInt()); 
System.out.print("Enter the marks for Maths: "); 
marks.add(scanner.nextInt()); 
System.out.print("Enter the marks for Drawing: "); 
marks.add(scanner.nextInt()); 
System.out.print("Enter the marks for Mechanics: ");
marks.add(scanner.nextInt());
Student student = new Student(name, marks); 
System.out.println("Total marks: " + student.totalMarks()); 
System.out.println("PCM marks: " + student.pcmMarks());
}

}
