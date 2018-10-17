import java.util.Scanner;
public class Persons 
{
	void UserEntries(int n,int ch)
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
			switch(ch)
			{
				case 1:
					Person p = new Person(id,fname,lname);
					p.getClass();
					break;
				case 2:
					Student s = new Student(id,fname,lname);
					s.getClass();		
					break;
			}
			n--;
			new Person(2, "fName", "lName");
			new Student(22, "ffName", "llName");
		}
		in.close();
	}
	public static void main(String[] args) 
	{
		int ch,t; 
		char c;	
		Persons person=new Persons();
		Scanner in = new Scanner(System.in);
		do 
		{
			System.out.println("1.Person");
			System.out.println("2.Student");
			System.out.println("Enter the choice:");
			ch=in.nextInt();
			if(ch==1||ch==2)
			{
				System.out.println("Enter number of entries:");
				t=in.nextInt();
				person.UserEntries(t,ch);
			}
			else
			{
				System.out.println("Entered an incorrect Choice");
			}
			System.out.println("Do you want to continue(y/n)?");
			c=in.next().charAt(0);
		}while(c=='y'||c=='Y');
		in.close();
	}
}