import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SingletonFile {
     
    private static SingletonFile myObj;
    FileWriter fw=null;
    private SingletonFile(){
         
    }
    public static SingletonFile getInstance(){
        if(myObj == null){
            myObj = new SingletonFile();
        }
        return myObj;
    }
     
    public void getSomeThing(){
        // do something here
        System.out.println("I am here....");
    }
     
    public static void main(String a[]){
    	SingletonFile st = SingletonFile.getInstance();
        st.getSomeThing();
    }
}