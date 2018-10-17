import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class AppendToFile
{
	int Id;
	String Fname,Lname;
	public void appendToFile()
	{
        FileWriter fw=null;
		try {
            File logging = new File("D:\\Dev1\\logging.txt");   
            fw = new FileWriter(logging,true); 
            fw.write("["+Id+","+Fname+","+Lname+"]");
        }catch (IOException e) {
            System.out.println("Problem writing to the file statsTest.txt"+e);
        }finally{
        	if(fw!=null)
            try{
                fw.close();
            }catch(Exception e){}
        }
	}
}
class student extends AppendToFile
{
	student(int Id,String Fname,String LName)
	{
	    this.Id=Id;
		this.Fname=Fname;
		this.Lname=LName;
	}
	public void GetStudent()
	{
		appendToFile();
	}
}
class Person extends AppendToFile
{
	Person(int Id,String Fname,String LName)
	{
		this.Id=Id;
		this.Fname=Fname;
		this.Lname=LName;
	}
	public void GetPerson()
	{
		appendToFile();
	}
}
public class Person_Student 
{
	public static void main(String[] args) 
	{
		int id,n;
		String fname,lname;
		Scanner in = new Scanner(System.in); 
		Person personDetails=new Person(1, "Venu","vc");
        personDetails.GetPerson();
        student studentDetails=new student(3,"Rahul","Rajeevan");
        studentDetails.GetStudent();
	}
}
