public class java7 {
    public static void reverse(int no[]){
int first=0,last=no.length-1;
while(first<last){
    int temp=no[last];
    no[last]=no[first];
    no[first]=temp;
    first++;
    last--;

}
    }
    public static void main(String args[]){
        int no[]={2,4,6,8,10};
        reverse(no);
        for(int i=0;i<no.length;i++){
            System.out.print(no[i]+"  ");
        }
        System.out.println();
    }
}




