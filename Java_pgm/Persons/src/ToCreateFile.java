import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ToCreateFile
{
	private static ToCreateFile ObjFile=null;
    private static File file;
    private ToCreateFile()
    {
    	 file = new File("log.txt");
    }
    public static ToCreateFile getInstance()
    {
        if(ObjFile == null)
        {
        	synchronized(ToCreateFile.class)
        	{
        		if(ObjFile==null)
        		{
        			ObjFile=new ToCreateFile();
                    //System.out.println("LogFile Created");
                    try
                    {
                    	file.createNewFile();
                    }catch (Exception e) {
						System.out.println("Error:"+e);
					}
        		}
            }
        }
        return ObjFile;
    } 
    public void appendToFile(String str)
	{
		try 
		{         
            Files.write(Paths.get("log.txt"), str.getBytes(), StandardOpenOption.APPEND);

        }catch (IOException e) 
		{
            System.out.println(e);
        }
	}
   
}
