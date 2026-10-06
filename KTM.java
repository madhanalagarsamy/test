import javax.swing.*;
import java.awt.event.*;
import java.awt.LayoutManager;

public class KTM extends JFrame implements ActionListener {

    JLabel l1 = new JLabel("Enter Kilometers:");
    JLabel l2;
    JTextField t1;
    JButton b1;

    KTM() {
        l1.setBounds(30, 30, 120, 30);

        t1 = new JTextField();
        t1.setBounds(160, 30, 100, 30);

        b1 = new JButton("Convert");
        b1.setBounds(90, 80, 100, 30);

        l2 = new JLabel("Result:");
        l2.setBounds(30, 130, 250, 30);

        b1.addActionListener(this);

        add(l1);
        add(t1);
        add(b1);
        add(l2);

        setTitle("KM to Meter Converter");
        setSize(320, 220);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double km = Double.parseDouble(t1.getText());
            double meter = km * 1000.0;
            l2.setText("Result: " + meter + " Meter");
        } catch (NumberFormatException ex) {
            l2.setText("Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        new KTM();
    }
}
