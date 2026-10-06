import javax.swing.*;
import java.awt.event.*;
import java.awt.LayoutManager;

public class KTM extends JFrame implements ActionListener {

    JLabel l1 = new JLabel("Enter Kilometers:");
    JLabel l2;
    JTextField t1;
    JButton b1;

    KTM() {
        this.l1.setBounds(30, 30, 120, 30);

        this.t1 = new JTextField();
        this.t1.setBounds(160, 30, 100, 30);

        this.b1 = new JButton("Convert");
        this.b1.setBounds(90, 80, 100, 30);

        this.l2 = new JLabel("Result:");
        this.l2.setBounds(30, 130, 250, 30);

        this.b1.addActionListener(this);

        this.add(this.l1);
        this.add(this.t1);
        this.add(this.b1);
        this.add(this.l2);

        this.setTitle("KM to Meter Converter");
        this.setSize(320, 220);
        this.setLayout((LayoutManager) null);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double km = Double.parseDouble(this.t1.getText());
            double meter = km * 1000.0;
            this.l2.setText("Result: " + meter + " Meter");
        } catch (NumberFormatException var6) {
            this.l2.setText("Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        new KTM();
    }
}
