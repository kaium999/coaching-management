
package project_main;

import java.util.ArrayList;


class clg_Student  extends Student //Child - 1
{
    ArrayList<clg_Student> alcS = new ArrayList<>();
    String clg_name;
    public clg_Student(String S_id,String S_name,String clg_name) 
    {
        super(S_id,S_name);
        this.clg_name=clg_name;
    }  

}
