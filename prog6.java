import java.util.*;

public class prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator:");
        String ch = sc.next();
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        switch (ch) {
            case "+":
                System.out.println("Addition: " + (no1 + no2));
                break;
            case "-":
                System.out.println("Subtraction: " + (no1 - no2));
                break;
            case "%":
                System.out.println("Mod: " + (no1 % no2));
                break;
            case "/":
                System.out.println("Div: " + (no1 / no2));
                break;
            default:
                System.out.println("Invalid operator");
                
        }
    }
}
