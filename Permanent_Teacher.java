
package project_main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author walid
 */
class Permanent_Teacher extends Teacher implements I_TWork //child class - 1
{
   ArrayList<Permanent_Teacher> alPt = new ArrayList<>();
   private int work_hour;
   Permanent_Teacher(String T_id,String T_name,int work_hour)
    {
        super(T_id,T_name);
        this.work_hour=work_hour;           
    }
   
   public int getWork_hour()
   {
       return work_hour;
   }
   public void setWork_hour(int work_hour)
   {
      this.work_hour=work_hour;
   }
   
    Scanner scT = new Scanner(System.in);
    
   @Override
    public void working()
    {
        System.out.println("How many  hours does he/she work per day :-");
        work_hour=scT.nextInt();
        if(work_hour>24)
        {
            System.out.println("Input invalid,Try again :-");
            working();
        }
        
    }
    void view_G_info( Local_guardian Lgrd )
    {
        System.out.println("-------------  Local Guardian  -------------");
        System.out.println("Guardian's Name :"+Lgrd.G_name);
        System.out.println("Guardian's Phone Nummber : "+Lgrd.G_phn);
         System.out.println("Guardian's Address"+Lgrd.Address);
        
    }
     void view_G_info( Foreign_guardian Fgrd )
    {
        System.out.println("------------- Foreign Guardian  -------------");
        System.out.println("Guardian's Name :"+Fgrd.G_name);
        System.out.println("Guardian's Phone Nummber: "+Fgrd.G_phn);
        System.out.println("Guardian's Address: "+Fgrd.country);
        
    }
    
    
  
}