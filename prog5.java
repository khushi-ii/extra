// import java.util.*;
// public class prog5{
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int exp=0;
//         String[] name = new String[10];
//         String[] city = new String[10];
//         int[] salary = new int[10];
//       for(int i=0;i<10;i++){
//         System.out.print("Enter your name\n");     
//         name[i] = sc.next();
//         System.out.print("Enter your city\n");
//         city[i]=sc.next();
//         System.out.print("Enter your salary\n");
//         salary[i]=sc.nextInt();
      
//         if(city[i].equals("Banglore") || city[i].equals("banglore") || city[i].equals("BANGLORE")){
//          exp=salary[i]+exp;
//         }
//     }
//     System.out.print(exp);

//     }
// }

import java.util.*;

public class prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exp = 0;
        String[] name = new String[5];
        String[] city = new String[5];
        int[] salary = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your name\n");
            name[i] = sc.next();
            System.out.print("Enter your city\n");
            city[i] = sc.next();
            System.out.print("Enter your salary\n");
            salary[i] = sc.nextInt();

            // Normalize the case of the city name before comparison
            if (city[i].equals("Bangalore") || city[i].equals("bangalore") || city[i].equals("Bangalore") ) { //equalsignoerecase
                exp += salary[i];
            }
        }

        System.out.println("Total salary for Bangalore: " + exp);

        // Close the scanner
        sc.close();
    }
}
