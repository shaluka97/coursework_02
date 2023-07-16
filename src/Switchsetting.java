import javax.swing.*;
import java.awt.*;

abstract class Switchsetting extends JFrame {
    abstract void Open();

    private JPanel Toppanel;
    private JPanel Bottompanel;

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;

    private JLabel lbl1;

    private Font btnFont = new Font("",1,10) ;

    Switchsetting(){
        setSize(600,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2,1));

        Toppanel=new JPanel();
        Toppanel.setBackground(Color.white);
        Toppanel.setFont(new Font("",1,20));
        Toppanel.setSize(600,250);

        Bottompanel=new JPanel();
        Bottompanel.setFont(new Font("",1,20));
        Bottompanel.setSize(600,50);

        lbl1 = new JLabel("Print Here");


        btn1=new JButton("SET");
        btn1.setFont(btnFont);
        btn1.setSize(10,20);

        btn2=new JButton("SET");
        btn2.setFont(btnFont);
        btn2.setSize(10,20);

        btn3=new JButton("SET");
        btn3.setFont(btnFont);
        btn3.setSize(10,20);

        Toppanel.add(lbl1);

        Bottompanel.add(btn1);
        Bottompanel.add(btn2);
        Bottompanel.add(btn3);

        add(Toppanel);
        add(Bottompanel);



    }
}

class Speaker_set extends Switchsetting {
    public void Open(){
        setTitle("Speaker Living Room");

    }
}

class Window_set extends Switchsetting {
    public void Open(){
        setTitle("Window Living Room");

    }
}

class TV_liv_set extends Switchsetting {
    public void Open(){
        setTitle("TV Living Room");

    }
}

class TV_din_set extends Switchsetting {
    public void Open(){
        setTitle("TV Dining Room");

    }
}
