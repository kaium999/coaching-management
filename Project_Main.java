
package project_main;
import java.util.ArrayList;
import java.util.Scanner;


public class Project_Main {

  
    public static void main(String[] args) {
        
        Junior_admin Jadmin = new Junior_admin(23,"x",4);
        Senior_admin Sadmin = new Senior_admin(23,"x",4);
        Permanent_Teacher PerT = new Permanent_Teacher("34","XC",34);
        PartTime_Teacher ParT = new PartTime_Teacher("34","DS",3);
        Local_guardian Lgrd = new Local_guardian("01731610244","Shathi Akter","Rajbari");
        Foreign_guardian Fgrd = new Foreign_guardian("01734020514","Jack Carver","USA");
        clg_Student Cstd = new clg_Student("11","d","Ideal");
        scl_Student Sstd = new scl_Student("22","wew","junior lab");
        
        System.out.println("             COACHING MANAGEMENT SYSTEM       ");
        
        System.out.println("------------   Juniour Admin  -----------------");
        System.out.println("------------   Adding School Student ----------");
        Jadmin.addStudent(Sstd);
        System.out.println("-------------  School Students  ---------------");
        Jadmin.printAllName(Sstd.alsS);
        System.out.println("Guardian details :");
        PerT.view_G_info(Fgrd);
        PerT.view_G_info(Lgrd);

        System.out.println("------------   Senior Admin  ------------------");
        System.out.println("------------   Adding College Student ---------");
        Sadmin.addStudent(Cstd,Cstd.alcS);
        System.out.println("-------------  College Students  ---------------");
        Sadmin.printAllCName(Cstd.alcS);
        
        
        
        System.out.println("-------------  Permanenet Teacher Details :-");
        Jadmin.addteacher(PerT);
        System.out.println("-------------  Permanent Teachers  --------------"); 
        Jadmin.printAllTName(PerT.alPt);
         System.out.println("------------  Part Time Teacher Details :-");
        Sadmin.addteacher(ParT);
        System.out.println("-------------  Part Time Teachers  --------------");  
        Sadmin.printAllTName(ParT.alPart);
        
                
        gurdian_view(Lgrd,Fgrd,PerT,ParT);
        
        
               
        
    }
    
    static void gurdian_view(Local_guardian Lgrd, Foreign_guardian Fgrd,  Permanent_Teacher PerT, PartTime_Teacher ParT)
    {
       System.out.println("-------------  Guardian View Teacher Information  --------------");
        System.out.println("For Local Guardian press L");
        System.out.println("OR");
        System.out.println("For Foreign Guardian press F");
        System.out.print(">>>>>>>: ");
        String G;
        Scanner Sc = new Scanner(System.in);
        G = Sc.nextLine();
        if(G.equals("l")|| G.equals("L")|| G.equals("f")|| G.equals("F"))
        {
         if(G.equals("l")|| G.equals("L"))
         {
           System.out.println("-------------  Local Guardian View PartTime Teacher Information  --------------");
           Lgrd.view_Teacher_Details(PerT.alPt, ParT.alPart);
           Fgrd.Teacher_pay(ParT);
         }
         if(G.equals("f")|| G.equals("F"))
         {
          System.out.println("-------------  Foreign Guardian View Permanent Teacher Information  --------------");
          Fgrd.view_Teacher_Details(PerT.alPt, ParT.alPart);
          Lgrd.Teacher_pay(PerT.alPt);
         }
        }
        else
        {
            System.out.println("You Press Invalid Key Try With right Key");
            gurdian_view(Lgrd,Fgrd,PerT,ParT);
        } 
    }
}
