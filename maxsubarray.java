public class maxsubarray {
    public static void main(String args[]){
    int nos[]={2,4,6,8,10};
    int sum=0,ms=0;
    
    for(int i=0;i<nos.length;i++){
        int start=i;
        for(int j=i+1;j<nos.length;j++){
int end=j;
sum=0;
for(int k=start;k<=end;k++){
    sum=sum+nos[k];
}

System.out.println(sum);
if(ms<sum){
    ms=sum;
} 
    }
    }
    System.out.println("max sum is"+ms);
}

}











