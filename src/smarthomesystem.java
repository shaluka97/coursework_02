import javax.swing.*;
import java.awt.*;

class Switch extends JFrame{
    private JButton btnon;
    private JButton btnstg;
    private JLabel hourlbl;

    private JPanel hrpanel;
    private JPanel minpanel;

    Switch(){
        setSize(400,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

class Controller{

}

public class smarthomesystem {
    public static void main  (String args[]){
        popup test = new TV_dining();
        Switchsetting test2 = new Speaker_set();
//        test.display(true);
//        test.setVisible(true);
        test2.setVisible(true);
        test2.Open();
    }
}
