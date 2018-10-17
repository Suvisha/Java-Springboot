import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Logging
{
	int Id;
	String Fname,Lname;
	Logging(){}
	Logging(int Id,String Fname,String LName)
	{
		this.Id=Id;
		this.Fname=Fname;
		this.Lname=LName;
	}
	void appendToFile()
	{
        FileWriter fw=null;
		try {
            File logging = new File("D:\\Dev1\\logging.txt");   
            fw = new FileWriter(logging,true); 
            fw.write("["+Id+","+Fname+","+Lname+"]");
        } catch (IOException e) {
            System.out.println("Problem writing to the file statsTest.txt"+e);
        }finally
        {if(fw!=null)
            try{
                fw.close();
            }catch(Exception e)
            {
        }}
	}
	void DisplayEntries(int n)
	{
		int id;
		String fname,lname;
		Scanner in = new Scanner(System.in);
		while(n>0)
		{
			System.out.println("Enter Id:");
			id=in.nextInt();
			System.out.println("Enter First Name:");
			fname = in.next();
			System.out.println("Enter Last Name:");
			lname = in.next();
			Logging person_details=new Logging(id,fname,lname);
			person_details.appendToFile();
			n--;
		}	
	}
	public static void main(String[] args) 
	{
		int ch,t; 
		char c;
		Logging td=new Logging();
		Scanner in = new Scanner(System.in);
		do 
		{
			System.out.println("1.Person");
			System.out.println("2.Student");
			System.out.println("3.Exit");
			System.out.println("Enter the choice:");
			ch=in.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter number of entries:");
						t=in.nextInt();
						td.DisplayEntries(t);
						break;
				case 2:System.out.println("Enter number of entries:");
		   	   			t=in.nextInt();
		   	   			td.DisplayEntries(t);
		   	   			break;
				case 3:break;
				default:System.out.println("Enter any choice");
			}
			System.out.println("Do you want to continue(y/n)?");
			c=in.next().charAt(0);
		}while(c=='y'||c=='Y');
	}
}
