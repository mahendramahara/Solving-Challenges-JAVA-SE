import javax.swing.*;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QN_E {

    JMenuBar menuBar;
    JMenu file, edit, format, view, help;
    JMenuItem newItem, open, save, exit, cut, copy, paste, delete;
    JMenuItem font, style, zoom, statusBar, sendFeedBack, aboutNotepad;
    JFrame frame;
    JTextArea jta;

    public QN_E() {
        frame = new JFrame();
        frame.setTitle("Menu-Driven App");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        menuBar = new JMenuBar();

        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        view = new JMenu("View");
        help = new JMenu("Help");

        newItem = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        delete = new JMenuItem("Delete");
        font = new JMenuItem("Font");
        style = new JMenuItem("Style");
        zoom = new JMenuItem("Zoom");
        statusBar = new JMenuItem("Status Bar");
        sendFeedBack = new JMenuItem(" Send Feedback");
        aboutNotepad = new JMenuItem(" About Notepad");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);
        menuBar.add(view);
        menuBar.add(help);

        file.add(newItem);
        file.add(open);
        file.add(save);
        file.add(exit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(delete);

        format.add(font);
        format.add(style);

        view.add(zoom);
        view.add(statusBar);

        help.add(sendFeedBack);
        help.add(aboutNotepad);

        jta = new JTextArea();
        jta.setMargin(new Insets(5, 5, 5, 5));
        frame.add(jta);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(frame, "Do you really want to exit?", "Exit",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        aboutNotepad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "This is a simple Notepad application.", "About Notepad",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        QN_E obj = new QN_E();
    }
}