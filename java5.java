public class java5 {
    public static void main(String args[]){
    int arr[]={2,-4,6,-8,10,4};
    int newarr[]=new int[arr.length];
    int sum=0,ms=0;
    newarr[0]=arr[0];
    for(int i=1;i<newarr.length;i++){
       newarr[i]=newarr[i-1]+arr[i];
    }
    for(int i=0;i<arr.length;i++){
        int start=i;
        for(int j=i;j<arr.length;j++){
int end=j;
sum=start==0 ? newarr[end] : newarr[end]-newarr[start-1];
System.out.println(sum);
if(sum>ms)
ms=sum;
sum=0;
        }
    }
    // for(int i=0;i<=newarr.length;i++)
    // System.out.print(newarr[i]+" ");
    // }
     System.out.println("ms is- "+ms);
}
} 