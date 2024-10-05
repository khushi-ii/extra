public class jaba8{
    public static void main(String args[] ){
        int nos[]={2,4,6,8,10};
        for(int turn=0;turn<nos.length-1;turn++){
for(int j=0;j<nos.length-1-turn;j++){
    if(nos[j]>nos[j+1])
    {
        int temp=j+1;
        
nos[j+1]=nos[j];
j=temp;
    }
}
        }
        for(int i=0;i<nos.length  ;i++){

            System.out.print(nos[i]+" ");
        }
        System.out.println();
    }
}
