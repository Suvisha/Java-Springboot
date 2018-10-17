class Person
{
	private int Id;
	private String Fname,Lname;
    public Person(int id,String fName,String lName)
	{
    	Id = id;
		Fname = fName;
		Lname = lName;
		fileOperations();
	}
	public void fileOperations()
	{
		ToCreateFile l = ToCreateFile.getInstance();
		l.appendToFile("["+Id+", "+Fname+", "+Lname+"]");
	}
	/*public void SetValues(int id,String fName,String lName) 
	{
		Id = id;
		Fname = fName;
		Lname = lName;
		fileOperations();
	}*/
}