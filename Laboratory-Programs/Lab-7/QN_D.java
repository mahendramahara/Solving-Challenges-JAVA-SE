import javax.swing.*;

public class QN_D {
    JFrame frame;
    JLabel lblUser, lblPass, lblSex, lblHobbies, lblCountry, lblComment;
    JTextField txtUser, txtComment;
    JPasswordField jpfPass;
    JRadioButton jrbMale, jrbFemale;
    JCheckBox chk1, chk2, chk3, chk4;
    JComboBox<String> jcbCountry;
    JButton btnSubmit;

    public QN_D() {
        frame = new JFrame("Simple Regestration Form");
        frame.setLayout(null);
        frame.setSize(450, 600);
        frame.setLocationRelativeTo(null);

        // Adding Components
        lblUser = new JLabel("Username: ");
        lblUser.setBounds(50, 50, 150, 30);
        frame.add(lblUser);
        txtUser = new JTextField();
        txtUser.setBounds(150, 50, 150, 30);
        frame.add(txtUser);

        lblPass = new JLabel("Passwpord: ");
        lblPass.setBounds(50, 90, 150, 30);
        frame.add(lblPass);
        jpfPass = new JPasswordField();
        jpfPass.setBounds(150, 90, 150, 30);
        frame.add(jpfPass);

        lblSex = new JLabel("Sex: ");
        lblSex.setBounds(50, 130, 150, 30);
        frame.add(lblSex);
        jrbMale = new JRadioButton("Male");
        jrbMale.setBounds(150, 130, 70, 30);
        frame.add(jrbMale);
        jrbFemale = new JRadioButton("Female");
        jrbFemale.setBounds(230, 130, 70, 30);
        frame.add(jrbFemale);
        ButtonGroup grp = new ButtonGroup();
        grp.add(jrbFemale);
        grp.add(jrbMale);

        lblHobbies = new JLabel("Hobbies:");
        lblHobbies.setBounds(50, 170, 150, 30);
        frame.add(lblHobbies);
        chk1 = new JCheckBox("Playing");
        chk2 = new JCheckBox("Reading");
        chk3 = new JCheckBox("Visiting");
        chk4 = new JCheckBox("Tracking");
        chk1.setBounds(150, 170, 150, 30);
        chk2.setBounds(150, 210, 150, 30);
        chk3.setBounds(150, 250, 150, 30);
        chk4.setBounds(150, 290, 150, 30);
        frame.add(chk1);
        frame.add(chk2);
        frame.add(chk3);
        frame.add(chk4);

        lblCountry = new JLabel("Select Country: ");
        lblCountry.setBounds(50, 330, 150, 30);
        frame.add(lblCountry);
        jcbCountry = new JComboBox<String>();
        jcbCountry.setBounds(150, 330, 150, 30);
        jcbCountry.addItem("Nepal");
        jcbCountry.addItem("India");
        jcbCountry.addItem("China");
        frame.add(jcbCountry);

        lblComment = new JLabel("Comments:");
        lblComment.setBounds(50, 370, 150, 30);
        frame.add(lblComment);
        txtComment = new JTextField();
        txtComment.setBounds(150, 370, 150, 90);
        frame.add(txtComment);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(150, 470, 100, 30);
        frame.add(btnSubmit);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new QN_D();
    }
}