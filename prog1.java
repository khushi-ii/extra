import java.util.*;
public class prog1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name\n");

        String name=sc.next();
        System.out.println("enter your Id\n DA \n HRA\n SALARY\n");
        int id=sc.nextInt();
        float hra=sc.nextFloat();
        float da=sc.nextFloat();
        float salary=sc.nextFloat();
        float gross_sal=hra+da+salary;
         System.out.print("\nmy name is "+name+"\nmy id is "+id+"\nmy gross salary is "+gross_sal);
    }
}