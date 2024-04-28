class Student
{
	int id;
	String name;
	int age;
	  Student(int i, String n, int a)
	  {
		  id=i;
		  name=n;
		  age=a;
	  }
	public void display(){
		System.out.println("ID:"+id+"\t"+"Name:"+name+"\t"+"Age:"+age);
	}
}
public class ParameterizedConstructor {

	
	public static void main(String[] args) {
		Student student = new Student(10, "Isha", 1000);
		Student student1 = new Student(11, "Sumina", 1001);
		student.display();
		student.display();
	}

}
