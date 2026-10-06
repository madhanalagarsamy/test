import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {

    TextField t = new TextField();
    int a;
    int b;
    String op = "";

    Calculator() {
        t.setFont(new Font("Arial", 1, 30));
        add(t, "North");

        Panel p = new Panel(new GridLayout(4, 4));

        String[] bt = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "C", "0", "=", "/"
        };

        for (String s : bt) {
            Button b = new Button(s);
            b.setFont(new Font("Arial", 1, 28));
            b.addActionListener(this);
            p.add(b);
        }

        add(p);
        setSize(220, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String c = e.getActionCommand();

        if (c.equals("C")) {
            t.setText("");
            op = "";

        } else if (!c.equals("+") && !c.equals("-")
                && !c.equals("*") && !c.equals("/")) {

            if (c.equals("=")) {
                String exp = t.getText();

                b = Integer.parseInt(
                    exp.substring(exp.indexOf(op) + 1)
                );

                int ans = 0;

                if (op.equals("+")) {
                    ans = a + b;
                }

                if (op.equals("-")) {
                    ans = a - b;
                }

                if (op.equals("*")) {
                    ans = a * b;
                }

                if (op.equals("/")) {
                    ans = a / b;
                }

                t.setText(exp + "=" + ans);

            } else {
                t.setText(t.getText() + c);
            }

        } else {
            a = Integer.parseInt(t.getText());
            op = c;
            t.setText(t.getText() + c);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
