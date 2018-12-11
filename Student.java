
package project_main;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
     private String S_id;
     String S_name;
     
     
    public Student(String S_id,String S_name)
     {
         this.S_id=S_id;
         this.S_name=S_name;    
     }
     
    public String get_id()
    {
       return S_id; 
    }
     public void setS_id(String id)
     {
         S_id = id;
     } 
}


