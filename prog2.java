import java.util.*;
public class prog2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your id and pass");
        int id=sc.nextInt();
         String pass=sc.next();
         if(id==12345){
            System.out.print("id is correct\n");

            if(pass.equals("khushi"))
            {
                System.out.print("pass is correct");
                
            }
            else
            {
                System.out.print("pass is wrong");
            }
         }
         else{
             System.out.print("id is wrong");
         }


    }
}