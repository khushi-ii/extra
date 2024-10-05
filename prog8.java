import java.applet.*;
import java.awt.*;
public class prog8 {
    public static void main(String[] args) {
Button b;
TextField t1;
int i;
public void init(){
    t1=new TextField(10);
    b=new Button("click me");
    b.add Activelistner(this);
}
public void actionperfomed(ActionEvent e){
if(e.getsource()==b){
    i++;
    t1.setText("Clicked"+i);
}
}
    }
}
