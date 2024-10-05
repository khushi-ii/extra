
public class java2{
public static void bintodec(int binno){
    int pow=0;
    int decNo=0;
while(binno>0){
    int ld=binno%10;
    decNo=decNo +(ld*(int)Math.pow(2,pow));
pow++;
binno=binno/10;

}
System.out.println(decNo);
}

public static void main(String args[]){
    bintodec(101);
    }
 
}