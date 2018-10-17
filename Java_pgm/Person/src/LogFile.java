import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LogFile
{
	private static LogFile Logging=null;
    private static File file;
    private LogFile()
    {
    	 file = new File("log.txt");
    }
    public static LogFile getInstance()
    {
        if(Logging == null)
        {
        	synchronized(LogFile.class)
        	{
        		if(Logging==null)
        		{
        			Logging=new LogFile();
                    System.out.println("LogFile Created");
                    try
                    {
                    	file.createNewFile();
                    }catch (Exception e) {
						System.out.println("Error:"+e);
					}
        		}
            }
        }
        return Logging;
    } 
    public void appendToFile(TestDemo td)
	{
		try 
		{   
            String str = "["+td.Id+", "+td.Fname+", "+td.Lname+"]";
            Files.write(Paths.get("log.txt"), str.getBytes(), StandardOpenOption.APPEND);

        }catch (IOException e) 
		{
            System.out.println(e);
        }
	}
}
