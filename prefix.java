public class prefix {
    public static void main(String args[]){
    int nos[]={2,4,6,8,10};
    int sum=0,ms=Integer.MIN_VALUE;
    int prefix[]=new int[nos.length];
    prefix[0]=nos[0];
    for(int i=1;i<prefix.length;i++){
prefix[i]=prefix[i-1]+nos[i];
    }
    for(int i=0;i<nos.length;i++){
        int start=i;
        for(int j=i+1;j<nos.length;j++){
int end=j;
sum=start==0 ?prefix[end]:prefix[end]-prefix[start-1];
System.out.println(sum);

if(ms<sum){
    ms=sum;
} 
  }
    }
    System.out.println("max sum is"+ms);
}
}

