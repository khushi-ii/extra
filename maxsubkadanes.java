public class maxsubkadanes {
    public static void kadanes(int nos[]){
int cs=0,maxsum=Integer.MIN_VALUE;
for(int i=0;i<nos.length;i++){
    cs=cs+nos[i];
if(cs<0)
cs=0;

maxsum=Math.max(cs,maxsum);
}
System.out.println(maxsum);
    }
    public static void main(String args[]){
    int nos[]={-2,-3,4,-1,-2,1,5,-3};
    kadanes(nos);
   
}
}
























