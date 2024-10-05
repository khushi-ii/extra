import java.util.*;
public class prog3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ch=sc.next();
        if(ch.equals('a')||ch.equals('e')||ch.equals('i')||ch.equals('o')||ch.equals('u')){
            System.out.print("its a vowel");
        }
        else{
            System.out.print("its a constant");
        }
    }
}