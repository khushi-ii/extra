public class v13p19 {
    public static int tilling(int n){
if(n==0 || n==1)
return 1;
        // int vertical=tilling(n-1);
        // int horizontal=tilling(n-2);
         System.out.println(tilling(n-1));
            //  System.out.println(tilling(n-2));
        int total=tilling(n-1)+tilling(n-2);
        return 0;
    }
public static void main(String args[]){
    int n=4 ;
  tilling(n);
}
}
