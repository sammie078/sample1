import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable //Employee is a Serializable class
{
	private static final long serialVersionUID = 1L;
	int empid;
	int salary;
	String name;
	public Employee(int empid, int salary, String name) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
}


public class Program01
{
	static Scanner sc=new Scanner(System.in);
	private final static String PATHNAME="MyFile.dat";
	
	
	
	private static void readRecord() throws ClassNotFoundException, IOException 
	{
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(PATHNAME))));)
		{
			Employee emp = (Employee) ois.readObject(); 
			System.out.println(emp);
			
		}
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		readRecord();

	}

}

