public class insertionsort {
    public static void main(String args[]){
        int arr[]={5,4,1,2,3};
        for(int turn=1;turn<arr.length;turn++){
            int curr=arr[turn];
            int prev=turn-1;//0
            while(arr[prev]>arr[curr]&& prev>=0){//5>3
arr[prev+1]=arr[prev];//1=0 5,3    ,_
prev--;
            }
        arr[prev+1]=curr;
                             
        }
    }    
}
