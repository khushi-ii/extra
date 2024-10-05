import java.util.*;

public class prog6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter operator");
        String ch=sc.next();
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        switch (ch) {
            case ("+"):
                System.out.println("addition :"+ (no1+no2));
                break;
            case ("-"):
                System.out.println("subtraction :"+ (no1-no2));
                break;  
            case ("%"):
                System.out.println("mod :"+ (no1%no2));
                break;      
            case ("/"):
                System.out.println("div :"+ (no1/no2));
                break;    
            default:
                 System.out.println("invalid");
                break;    
        }


    }
}
