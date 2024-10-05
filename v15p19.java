public class v15p19{
    public static void remove(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
        System.out.print(newstr);
        return;
        }
        char curr=str.charAt(idx);
         if(map[curr-'a']==true)
         {
         remove(str,idx+1,newstr,map); 
    }
    else{
        map[curr-'a']=true;
        remove(str,idx+1,newstr.append(curr ),map); 
    }
    }
public static void main(String args[]){
    String str="apnacollege";

    StringBuilder newstr=new StringBuilder("");
   boolean map[]=new boolean[26];
    remove(str,0,newstr,map);

}
}
