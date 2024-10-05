public class stocks {
    public static int buyandsell(int prices[]){
      int buy=Integer.MAX_VALUE;
      int maxp=0;
      for(int i=0;i<prices.length;i++){
        if(buy<prices[i]){
        int profit=prices[i]-buy;
        maxp=Math.max(maxp,profit);
        }
        else{
            buy=prices[i];
        }
      }
        return maxp;
    }
    public static void main(String args[]){
int prices[]={7,1,5,3,6,4};
System.out.println(buyandsell(prices));
    }
}
