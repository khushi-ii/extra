
//        String str="hello my name is khushi";
//        str=str.trim();
//        int count=1;
  
// for(int i=0;i<str.length()-1;i++){
//     if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
//         count++;
//     }
// }
// System.out.println(count);

//     }
// }
//  import java.util.*;
// public class javainterview {
 
//         public static  void main(String[] args) {
//           Scanner sc=new Scanner(System.in);
//           System.out.println("enter no");
//           int n=sc.nextInt();
//           if(n<1 ||n>999){
//             System.out.println("invalid");
//           }
//           else{
//             int ld=n%10;//last digit
//             int b=n/10;
//             int tenth=b%10;
//             int h=n/100;
//             String[] numbers = {"",
//             "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
//             "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
//         };
//         String[] numberst = {"",
//             "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
//         };
//         String hu="hundred";
//         if(n<20){
//           System.out.println(numbers[n]);
//         }
//         else if(n>=20 && n<=100){
//           System.out.println(numberst[tenth]+" "+numbers[ld]);
//         }  
//         else{
//           System.out.println(numbers[h]+" "+hu+" "+ numberst[tenth]+" "+numbers[ld]);
//         }
//           }
//         }
    
// }

// import java.util.Scanner;

// public class javainterview {
//     public static void main(String[] args) {
//         // Create a Scanner object for user input
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter a number
//         System.out.print("Enter a number: ");
//         String numberStr = scanner.nextLine();

//         // Close the scanner
//         scanner.close();

//         // Convert the number to a char array
//         char[] charArray = numberStr.toCharArray();

//         // Create an array to hold the digits
//         int[] digitArray = new int[charArray.length];

//         // Convert each character to an integer and store in the array
//         for (int i = 0; i < charArray.length; i++) {
//             // Convert char to int by subtracting '0'
//             digitArray[i] = charArray[i] ;
//         }

//         // Print the resulting array
//         System.out.print("Array of digits: ");
//         for (int i=0;i<digitArray.length;i++) {
//             System.out.print(digitArray[i] + " ");
//         }
//     }
// }





// public class javainterview {
//     public static void main(String[] args) {
//         // The input string
//         String input = "Thank you for the order. Your order is ABC12345.";

//         // Define variables to hold the extracted ID
//         StringBuilder idBuilder = new StringBuilder();
//         boolean isIdFound = false;

//         // Iterate over each character in the input string
//         for (char c : input.toCharArray()) {
//             // Check if the character is a letter or a digit
//             if (Character.isLetter(c) || Character.isDigit(c)) {
//                 // Start building the ID if it starts with a letter
//                 if (!isIdFound && Character.isLetter(c)) {
//                     isIdFound = true;
//                 }
//                 // Add the character to the ID if an ID has started
//                 if (isIdFound) {
//                     idBuilder.append(c);
//                 }
//             } else {
//                 // Stop building the ID if we hit a non-letter, non-digit character
//                 if (isIdFound) {
//                     break;
//                 }
//             }
//         }

//         // Convert the StringBuilder to a String
//         String id = idBuilder.toString();

//         // Print the extracted ID
//         System.out.println("Extracted ID: " + id);
//     }
// }




// public class javainterview  {
//     public static void main(String[] args) {
//         String mainString = "Hello World from Java"; // The main string
//         String substring = "World"; // The substring to search for

//         int index = findSubstring(mainString, substring);
        
//         if (index != -1) {
//             System.out.println("Substring found at index: " + index);
//         } else {
//             System.out.println("Substring not found.");
//         }
//     }

//     public static int findSubstring(String str, String sub) {
//         int strLength = str.length(); // Length of the main string
//         int subLength = sub.length(); // Length of the substring
        
//         // If the substring is longer than the main string, return -1
//         if (subLength > strLength) {
//             return -1;
//         }

//         // Loop through each character in the main string
//         for (int i = 0; i <= strLength - subLength; i++) {
//             int j;
//             // Check if substring matches starting at position i
//             for (j = 0; j < subLength; j++) {
//                 // If characters do not match, break the inner loop
//                 if (str.charAt(i + j) != sub.charAt(j)) {
//                     break; // No match, exit inner loop
//                 }
//             }
//             // If we completed the inner loop, a match was found
//             if (j == subLength) {
//                 return i; // Return the starting index of the match
//             }
//         }

//         // If no match was found, return -1
//         return -1;
//     }
// }




// class ParkingLot {
//     private int totalSpots; // Total number of parking spots
//     private int availableSpots; // Available parking spots
//     private String[] parkedVehicles; // Array to store parked vehicles

//     // Constructor
//     public ParkingLot(int totalSpots) {
//         this.totalSpots = totalSpots;
//         this.availableSpots = totalSpots;
//         parkedVehicles = new String[totalSpots]; // Initialize the parked vehicles array
//     }

//     // Method to add a vehicle
//     public boolean addVehicle(String vehicleNumber) {
//         if (availableSpots > 0) {
//             // Find the first available parking spot
//             for (int i = 0; i < totalSpots; i++) {
//                 if (parkedVehicles[i] == null) { // Check if the spot is empty
//                     parkedVehicles[i] = vehicleNumber; // Park the vehicle
//                     availableSpots--; // Decrement the count of available spots
//                     System.out.println("Vehicle " + vehicleNumber + " parked at spot number " + (i + 1));
//                     return true;
//                 }
//             }
//         } else {
//             System.out.println("Parking Lot is Full!");
//         }
//         return false; // No available spots
//     }

//     // Method to remove a vehicle
//     public boolean removeVehicle(String vehicleNumber) {
//         for (int i = 0; i < totalSpots; i++) {
//             if (parkedVehicles[i] != null && parkedVehicles[i].equals(vehicleNumber)) { // Check if the vehicle is parked
//                 parkedVehicles[i] = null; // Remove the vehicle
//                 availableSpots++; // Increment the count of available spots
//                 System.out.println("Vehicle " + vehicleNumber + " removed from spot number " + (i + 1));
//                 return true;
//             }
//         }
//         System.out.println("Vehicle " + vehicleNumber + " not found!");
//         return false; // Vehicle not found
//     }

//     // Method to check available parking spots
//     public int checkAvailableSpots() {
//         return availableSpots;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         ParkingLot parkingLot = new ParkingLot(5); // Create a parking lot with 5 spots

//         // Adding vehicles
//         parkingLot.addVehicle("ABC123");
//         parkingLot.addVehicle("XYZ456");
//         parkingLot.addVehicle("LMN789");

//         // Checking available spots
//         System.out.println("Available spots: " + parkingLot.checkAvailableSpots());

//         // Removing a vehicle
//         parkingLot.removeVehicle("XYZ456");

//         // Checking available spots again
//         System.out.println("Available spots: " + parkingLot.checkAvailableSpots());

//         // Trying to remove a vehicle that does not exist
//         parkingLot.removeVehicle("NOTFOUND");
//     }
// }
