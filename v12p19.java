public class v12p19 {
public static int optimizedpow(int x,int n)
{
if(n==0)
return 1;
int half=optimizedpow(x,n/2);
int halfsq=half*half;
if(n%2!=0)
halfsq=x*halfsq;
return halfsq;
}
    public static void main(String args[]){
        int a=2,n=11;
        System.out.println(optimizedpow(a,n));
    }
}