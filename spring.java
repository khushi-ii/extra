public class spring {
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int startr=0,startc=0,endr=arr.length-1,endc=arr[0].length-1;
while(startr<=endr && startc<=endc){
    for(int j=startc;j<=endc;j++){
System.out.print(arr[startr][j]+" ");
    }
    for(int i=startr+1;1<=endr;i++){
System.out.print(arr[i][endc]+" ");
    }
    for(int j=endc-1;j>=startc;j--){
System.out.print(arr[startr][j]+" ");
    }
    for(int i=endr-1;i>=startr+1;i--){
System.out.print(arr[i][startc]+" ");
    } 
    endc--;
}
    }
}
