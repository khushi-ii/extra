public class v21p18 {
    public static int pow(int x,int n){
if(n==0)
return 1;

    //    int xnm1 =pow(x,n-1);
       int xn=x*xnm1;
       return  x*pow(x,n-1);
    }
    public static void main(String args[]){
   int x=2,n=10;
    }
} 