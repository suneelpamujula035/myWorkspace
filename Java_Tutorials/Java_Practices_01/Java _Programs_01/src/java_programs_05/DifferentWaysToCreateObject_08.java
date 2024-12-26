package java_programs_05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Student implements Cloneable, Serializable
{
	public int clgId = 101;
	public Student() {
		System.out.println("Inside student constructor");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class DifferentWaysToCreateObject_08 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException {

		//creating object using new keyword
		Student s1 = new Student();
		//printing the object reference
		System.out.println(s1);
		//calling student class properties
		System.out.println(s1.clgId);
		s1.clgId = 205;
		System.out.println(s1.clgId);
		
		System.out.println("*******************************");
		//creating object using newInstance method of class Class
		Student s2 = (Student) Class.forName("java_programs_05.Student").newInstance();//newInstance method is used to create object
		//print the object ref to the console
		System.out.println(s2);
		//calling the student class property
		s2.clgId = 144;
		System.out.println(s2.clgId);
		
		System.out.println("********************************");
		//creating object using newInstance method of Constructor class
		Constructor<Student> constructor = Student.class.getConstructor();
		Student s3 = constructor.newInstance();
		//print the object ref to the console
		System.out.println(s3);
		//calling the student class property
		s3.clgId = 322;
		System.out.println(s3.clgId);
		
		System.out.println("********************************");
		//creating object using  object class clone()
		Student s4 = (Student) s3.clone();//Student class constructor not called when we use clone method
		//print the object ref to the console
		System.out.println(s4);
		//calling the student class property
		s4.clgId = 682;
		System.out.println(s4.clgId);
		
		System.out.println("********************************");
		//Serialization
		FileOutputStream fos = new FileOutputStream("anc.text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student s = new Student();
		oos.writeObject(s);
		
		//Deserialization
		FileInputStream fis = new FileInputStream("abc.text");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//creating/getting the studnet class object
		Student s5 = (Student) ois.readObject();
		//printing to the console
		System.out.println(s5);
		//calling the student class property
		s5.clgId = 650;
		System.out.println(s5.clgId);

	}

}
