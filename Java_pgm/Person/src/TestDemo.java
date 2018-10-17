
public class TestDemo
{
	int Id;
	String Fname,Lname;
	TestDemo(int Id,String Fname,String LName)
	{
		this.Id=Id;
		this.Fname=Fname;
		this.Lname=LName;
	}	
	public static void main(String[] args) 
	{
		TestDemo td=new TestDemo(1,"suvi","kv");
		LogFile l = LogFile.getInstance();
		l.appendToFile(td);
	}
}