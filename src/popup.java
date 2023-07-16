import javax.swing.*;
import java.awt.*;

abstract class popup extends JFrame {
    public JLabel lbl;
    popup(){
        setSize(400,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        lbl=new JLabel();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        lbl.setFont(new Font("",1,20));
        add(lbl);
    }
    abstract void display(boolean status);
}

class speaker extends popup {
    public void display(boolean status){
        setTitle("Speaker");
        lbl.setText(status?"ON":"OFF");
    }
}
class TV_living extends popup {
    public void display(boolean status){
        setTitle("TV Living Room");
        lbl.setText(status?"ON":"OFF");
    }
}
class Window extends popup {
    public void display(boolean status){
        setTitle("Window");
        lbl.setText(status?"ON":"OFF");
    }
}
class TV_dining extends popup {
    public void display(boolean status){
        setTitle("TV Dining Room");
        lbl.setText(status?"ON":"OFF");
    }
}

