import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QN_C {
    QN_C() {
        JFrame jf = new JFrame("Simple Interest Calculator", null);
        jf.setSize(500, 400);
        jf.setLayout(null);

        JLabel lblText1, lblText2, lblText3, lblResult1, lblResult2, lblOutput1, lblOutput2;
        JTextArea jtaText1, jtaText2, jtaText3;
        JButton btnCalculate;

        lblText1 = new JLabel();
        lblText1.setText("Enter the principal amount:");
        lblText1.setBounds(10, 10, 200, 20);
        jf.add(lblText1);
        jtaText1 = new JTextArea();
        jtaText1.setBounds(220, 10, 180, 20);
        jf.add(jtaText1);

        lblText2 = new JLabel();
        lblText2.setText("Enter the time (years):");
        lblText2.setBounds(10, 50, 200, 20);
        jf.add(lblText2);
        jtaText2 = new JTextArea();
        jtaText2.setBounds(220, 50, 180, 20);
        jf.add(jtaText2);

        lblText3 = new JLabel();
        lblText3.setText("Enter the interest rate (%):");
        lblText3.setBounds(10, 90, 200, 20);
        jf.add(lblText3);
        jtaText3 = new JTextArea();
        jtaText3.setBounds(220, 90, 180, 20);
        jf.add(jtaText3);

        btnCalculate = new JButton();
        btnCalculate.setText("CALCULATE");
        btnCalculate.setBounds(150, 180, 200, 40);
        jf.add(btnCalculate);

        lblResult1 = new JLabel();
        lblResult1.setText("The interest is:");
        lblResult1.setBounds(40, 250, 90, 20);
        jf.add(lblResult1);

        lblOutput1 = new JLabel();
        lblOutput1.setBounds(135, 250, 150, 20);
        jf.add(lblOutput1);

        lblResult2 = new JLabel();
        lblResult2.setText("Principal after adding interest:");
        lblResult2.setBounds(40, 290, 180, 20);
        jf.add(lblResult2);

        lblOutput2 = new JLabel();
        lblOutput2.setBounds(225, 290, 150, 20);
        jf.add(lblOutput2);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double P = Double.parseDouble(jtaText1.getText());
                double T = Double.parseDouble(jtaText2.getText());
                double R = Double.parseDouble(jtaText3.getText());
                double SI = (P * T * R) / 100;
                lblOutput1.setText(" " + SI);
                double Amount = P + SI;
                lblOutput2.setText(" " + Amount);
            }
        });

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        QN_C obj = new QN_C();
    }
}
