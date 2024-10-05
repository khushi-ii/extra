public class subarrays {
    public static void main(String args[]){
    int nos[]={2,4,6,8,10};
    int sum=0,max=0;
    for(int i=0;i<nos.length;i++){
        int start=i;
        for(int j=i+1;j<nos.length;j++){
int end=j;
for(int k=start;k<=end;k++){
    sum=sum+nos[k];
}    System.out.println(sum);//123
    if(max<sum){
        max=sum;
    }
sum=0;
        }
    }
 System.out.println("max is "+max);
}
}