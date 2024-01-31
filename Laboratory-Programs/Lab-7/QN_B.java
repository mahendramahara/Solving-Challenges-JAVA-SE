import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QN_B {
    QN_B() {
        JFrame jf = new JFrame("Simple Calculator", null);
        jf.setSize(500, 400);
        jf.setLayout(null);

        JLabel lblText1, lblText2, lblResult, lblOutput;
        JTextArea jtaText1, jtaText2;
        JButton btnSum, btnMul, btnDiv, btnSub;

        lblText1 = new JLabel();
        lblText1.setText("Enter First Number:");
        lblText1.setBounds(10, 10, 200, 20);
        jf.add(lblText1);
        jtaText1 = new JTextArea();
        jtaText1.setBounds(220, 10, 180, 20);
        jf.add(jtaText1);

        lblText2 = new JLabel();
        lblText2.setText("Enter Second Number:");
        lblText2.setBounds(10, 50, 200, 20);
        jf.add(lblText2);
        jtaText2 = new JTextArea();
        jtaText2.setBounds(220, 50, 180, 20);
        jf.add(jtaText2);

        btnSub = new JButton();
        btnSub.setText("Sub -");
        btnSub.setBounds(90, 120, 100, 40);
        jf.add(btnSub);

        btnSum = new JButton();
        btnSum.setText("ADD +");
        btnSum.setBounds(300, 120, 100, 40);
        jf.add(btnSum);

        btnMul = new JButton();
        btnMul.setText("Mul *");
        btnMul.setBounds(90, 200, 100, 40);
        jf.add(btnMul);

        btnDiv = new JButton();
        btnDiv.setText("Div /");
        btnDiv.setBounds(300, 200, 100, 40);
        jf.add(btnDiv);

        lblResult = new JLabel();
        lblResult.setText("The output is:");
        lblResult.setBounds(10, 300, 130, 20);
        jf.add(lblResult);

        lblOutput = new JLabel();
        lblOutput.setBounds(150, 300, 200, 20);
        jf.add(lblOutput);

        btnSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double sumNum1 = Double.parseDouble(jtaText1.getText());
                double sumNum2 = Double.parseDouble(jtaText2.getText());
                double sumResult = sumNum1 + sumNum2;
                lblOutput.setText(" " + sumResult);
            }
        });

        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double subNum1 = Double.parseDouble(jtaText1.getText());
                double subNum2 = Double.parseDouble(jtaText2.getText());
                double subResult = subNum1 - subNum2;
                lblOutput.setText(" " + subResult);
            }
        });

        btnMul.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double mulNum1 = Double.parseDouble(jtaText1.getText());
                double mulNum2 = Double.parseDouble(jtaText2.getText());
                double mulResult = mulNum1 * mulNum2;
                lblOutput.setText(" " + mulResult);
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double divNum1 = Double.parseDouble(jtaText1.getText());
                double divNum2 = Double.parseDouble(jtaText2.getText());
                double divResult = divNum1 / divNum2;
                lblOutput.setText(" " + divResult);
            }
        });

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        QN_B obj = new QN_B();
    }
}
