import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class timespin extends JFrame {
    private JPanel combpanel;
    private JSpinner hourspn;
    private JSpinner minspn;

    public int gethrvalue() {
        return hrvalue;
    }

    public int getminvalue() {
        return minvalue;
    }

    public JPanel getCombpanel() {
        return combpanel;
    }

    private int hrvalue;
    private int minvalue;

    timespin() {
        JPanel hrpanel = new JPanel(new FlowLayout());
        JPanel minpanel = new JPanel(new FlowLayout());
        combpanel = new JPanel(new FlowLayout());

        JLabel hourlbl = new JLabel("Hour:");
        hourlbl.setFont(new Font("", 1, 18));

        JLabel minlbl = new JLabel("Minute:");
        minlbl.setFont(new Font("", 1, 18));

        SpinnerModel hourmodel = new SpinnerNumberModel(0, 0, 23, 1);
        hourspn = new JSpinner(hourmodel);
        hourspn.setFont(new Font("", 1, 18));
        hourspn.setEditor(new JSpinner.NumberEditor(hourspn, "00"));
        hourspn.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                hrvalue = (int) hourspn.getValue();
            }
        });

        SpinnerModel minmodel = new SpinnerNumberModel(0, 0, 59, 1);
        minspn = new JSpinner(minmodel);
        minspn.setFont(new Font("", 1, 18));
        minspn.setEditor(new JSpinner.NumberEditor(minspn, "00"));
        minspn.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                minvalue = (int) minspn.getValue();
            }
        });

        hrpanel.add(hourlbl, BorderLayout.CENTER);
        hrpanel.add(hourspn, BorderLayout.CENTER);

        minpanel.add(minlbl, BorderLayout.CENTER);
        minpanel.add(minspn, BorderLayout.CENTER);

        combpanel.add(hrpanel);
        combpanel.add(minpanel);
    }
}

class Switchsetting extends JFrame implements ActionListener {
    public void Open(){

    }
    private JButton btnset;
    private JTextArea outputTextArea;
    private timespin starttime;
    private timespin endtime;

    public int starthr(){
        return starttime.gethrvalue();
    }

    public int startmin(){
        return starttime.getminvalue();
    }

    public int endhr(){
        return endtime.gethrvalue();
    }

    public int endmin(){
        return endtime.getminvalue();
    }

    Switchsetting() {
        setSize(750, 380);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setResizable(false);

        JPanel toppanel = new JPanel();
        JPanel bottompanel = new JPanel();
        bottompanel.setSize(750,50);

        JPanel panelstart = new JPanel(new FlowLayout());
        JLabel lblstart;
        panelstart.add(lblstart = new JLabel("Start:"));
        Font btnFont = new Font("", 1, 18);
        lblstart.setFont(btnFont);
        starttime = new timespin();
        panelstart.add(starttime.getCombpanel());

        JPanel panelend = new JPanel(new FlowLayout());
        JLabel lblend;
        panelend.add(lblend = new JLabel("End:"));
        lblend.setFont(btnFont);
        endtime = new timespin();
        panelend.add(endtime.getCombpanel());

        btnset = new JButton("Set");
        btnset.setSize(50,25);
        btnset.setFont(btnFont);
        btnset.addActionListener(this);

        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setFont(btnFont);
        outputTextArea.setBackground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        scrollPane.setPreferredSize(new Dimension(720,250));

        toppanel.add(scrollPane);

        bottompanel.add(panelstart);
        bottompanel.add(panelend);
        bottompanel.add(btnset);

        add(toppanel);
        add(bottompanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnset){
            outputTextArea.append("Start at: "+String.format("%02d",starthr())+":"+String.format("%02d",startmin())+" Ends at: "+String.format("%02d",endhr())+":"+String.format("%02d",endmin()));
            outputTextArea.append("\n");
        }
    }
}

class Speaker_set extends Switchsetting {
    Speaker_set() {
        setTitle("Speaker Living Room");
    }
    public void Open() {
    }
}

class Window_set extends Switchsetting {
    Window_set() {
        setTitle("Window Living Room");
    }
    public void Open() {

    }
}

class TV_liv_set extends Switchsetting {
    TV_liv_set() {
        setTitle("TV Living Room");
    }

    public void Open() {
    }
}

class TV_din_set extends Switchsetting {
    TV_din_set() {
        setTitle("TV Dining Room");
    }

    public void Open() {
    }
}
