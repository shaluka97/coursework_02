import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Switch extends JFrame implements ActionListener {
    //ImageIcon img = new ImageIcon("img/icon.png");
    private timespin ts1;
    private JButton btnon;
    private JButton btnset;

    private Controller defcontrol;

    Switch() {
        setSize(400, 180);
        setTitle("Switch");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1));
        //setIconImage(img.getImage());
        setResizable(false);

        JPanel combpanel = new JPanel(new FlowLayout());

        btnon = new JButton("ON");
        Font defaultfont = new Font("", 1, 18);
        btnon.setFont(defaultfont);
        btnon.setSize(300, 50);
        btnon.addActionListener(this);

        btnset = new JButton("Settings");
        btnset.setFont(defaultfont);
        btnset.setSize(300, 50);
        btnset.addActionListener(this);

        ts1 = new timespin();
        combpanel.add(ts1.getCombpanel());

        add(btnon);
        add(btnset);
        add(combpanel);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnon) {
            btnon.setText("OFF");
        }
        if (e.getSource() == btnset) {
            defcontrol = new Controller();
            setVisible(false);
            defcontrol.setVisible(true);
        }
    }
}

class Controller extends JFrame implements ActionListener {
    private JButton btnTV_liv;
    private JButton btnspeaker;
    private JButton btnWindow;
    private JButton btnTV_dine;

    Controller() {
        setSize(400, 500);
        setTitle("Controller");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        Font defaultfont = new Font("", 1, 18);
        getContentPane().setBackground(Color.white);
        setResizable(false);

        JPanel toppanel = new JPanel(new GridLayout(4, 1));

        btnTV_liv = new JButton("TV Living Room");
        btnTV_liv.setHorizontalAlignment(SwingConstants.LEFT);
        btnTV_liv.setFont(defaultfont);
        btnTV_liv.setBackground(Color.white);
        btnTV_liv.setBorderPainted(false);
        btnTV_liv.addActionListener(this);

        btnspeaker = new JButton("Speaker Living Room");
        btnspeaker.setHorizontalAlignment(SwingConstants.LEFT);
        btnspeaker.setFont(defaultfont);
        btnspeaker.setBackground(Color.white);
        btnspeaker.setBorderPainted(false);
        btnspeaker.addActionListener(this);

        btnWindow = new JButton("Window Living Room");
        btnWindow.setHorizontalAlignment(SwingConstants.LEFT);
        btnWindow.setFont(defaultfont);
        btnWindow.setBackground(Color.white);
        btnWindow.setBorderPainted(false);
        btnWindow.addActionListener(this);

        btnTV_dine = new JButton("TV Dining Room");
        btnTV_dine.setHorizontalAlignment(SwingConstants.LEFT);
        btnTV_dine.setFont(defaultfont);
        btnTV_dine.setBackground(Color.white);
        btnTV_dine.setBorderPainted(false);
        btnTV_dine.addActionListener(this);

        toppanel.add(btnTV_liv);
        toppanel.add(btnspeaker);
        toppanel.add(btnWindow);
        toppanel.add(btnTV_dine);

        add("North", toppanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTV_liv) {
            Switchsetting setTV_liv = new TV_liv_set();
            setVisible(false);
            setTV_liv.setVisible(true);
        }
        if (e.getSource() == btnspeaker) {
            Switchsetting setSpeaker = new Speaker_set();
            setVisible(false);
            setSpeaker.setVisible(true);
        }
        if (e.getSource() == btnWindow) {
            Switchsetting setWindow = new Window_set();
            setVisible(false);
            setWindow.setVisible(true);
        }
        if (e.getSource() == btnTV_dine) {
            Switchsetting setTV_dine = new TV_din_set();
            setVisible(false);
            setTV_dine.setVisible(true);
        }

    }
}

public class smarthomesystem {
    public static void operator() {
        Switch switch1 = new Switch();
        switch1.setVisible(true);
    }

    public static void main(String args[]) {
        operator();
    }
}
