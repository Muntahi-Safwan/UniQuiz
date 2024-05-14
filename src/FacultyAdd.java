package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FacultyAdd extends JFrame {
    
    public FacultyAdd(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Add Faculty | UniQuiz");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./assets/logo1.png");
        this.setIconImage(img.getImage());

        ImageIcon blur = new ImageIcon("./assets/Rectangle 2.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/Light1.png");
        ImageIcon image = new ImageIcon("./assets/register-2.png");
        ImageIcon logoImg = new ImageIcon("./assets/log2.png");

        JLabel background = new JLabel(BackgroundImg);
        JLabel logo = new JLabel();
        logo.setIcon(logoImg);
        logo.setBounds(218, 66, 137, 137);

        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(image);
        imageLabel.setBounds(504, 122, 520, 520);

        JLabel blurLabel = new JLabel();
        blurLabel.setIcon(blur);
        blurLabel.setBounds(62, 50, 450, 620);

        JLabel text1 = new JLabel("Add Faculty", JLabel.CENTER);
        text1.setFont(new Font("Verdana", Font.BOLD, 30));
        text1.setForeground(new Color(0x071330));
        text1.setBounds(180, 203, 230, 54);


        // Student ID
        RoundedJTextField textField1 = new RoundedJTextField(10);
        textField1.setBounds(96, 267, 378, 41);
        textField1.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField1.setBackground(new Color(0xB8E4FA));
        textField1.setForeground(Color.black);
        textField1.setText("Full Name");
        textField1.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField1.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField1.setHorizontalAlignment(RoundedJTextField.CENTER);

        // Password
        RoundedJTextField textField2 = new RoundedJTextField(10);
        textField2.setBounds(96, 317, 378, 41);
        textField2.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField2.setBackground(new Color(0xB8E4FA));
        textField2.setForeground(Color.black);
        textField2.setText("Faculty ID");
        textField2.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField2.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField2.setHorizontalAlignment(RoundedJTextField.CENTER);

        //Full Name
        RoundedJTextField textField3 = new RoundedJTextField(10);
        textField3.setBounds(96, 370, 378, 41);
        textField3.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField3.setBackground(new Color(0xB8E4FA));
        textField3.setForeground(Color.black);
        textField3.setText("Email");
        textField3.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField3.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField3.setHorizontalAlignment(RoundedJTextField.CENTER);

        //Password
        RoundedJTextField textField4 = new RoundedJTextField(10);
        textField4.setBounds(96, 424, 378, 41);
        textField4.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField4.setBackground(new Color(0xB8E4FA));
        textField4.setForeground(Color.black);
        textField4.setText("Password");
        textField4.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField4.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField4.setHorizontalAlignment(RoundedJTextField.CENTER);

        //Department
        RoundedJTextField textField5 = new RoundedJTextField(10);
        textField5.setBounds(96, 476, 378, 41);
        textField5.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField5.setBackground(new Color(0xB8E4FA));
        textField5.setForeground(Color.black);
        textField5.setText("Mobile Number");
        textField5.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField5.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField5.setHorizontalAlignment(RoundedJTextField.CENTER);


        JButton submit = new JButton("Add");
        submit.setBounds(302, 550, 175, 47);
        submit.setFont(new Font("Verdana", Font.BOLD, 25));
        submit.setBackground(new Color(0xB8E4FA));
        submit.setForeground(Color.black);
        submit.setFocusPainted(false);

        JButton Back = new JButton("Back");
        Back.setBounds(103, 550, 175, 47);
        Back.setFont(new Font("Roboto", Font.BOLD, 25));
        Back.setBackground(new Color(0xB8E4FA));
        Back.setForeground(Color.black);
        Back.setFocusPainted(false);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                UserData o = new UserData();
                o.setVisible(true);
            }
        });

        // Register Button
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String tf1 = textField2.getText(); // Student ID
                String tf2 = textField4.getText(); // Password
                String tf3 = textField1.getText(); // Full Name
                String tf4 = textField3.getText(); // Email
                String tf5 = textField5.getText(); // Department

                if (tf1.isEmpty() || tf2.isEmpty() || tf3.isEmpty() || tf4.isEmpty()
                        || tf5.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    Faculty user = new Faculty(tf1, tf2, tf3, tf4, tf5);
                    user.addAccount();
                    
                    JOptionPane.showMessageDialog(null, "Registration Successfully Completed.",
                            "User Added Successfully", JOptionPane.WARNING_MESSAGE);
                    setVisible(false);
                    FacultyData o = new FacultyData();
                    o.setVisible(true);
                }
            }
        });

        this.add(Back);
        this.add(logo);
        this.add(text1);
        this.add(textField1);
        this.add(textField2);
        this.add(textField3);
        this.add(textField4);
        this.add(textField5);
        this.add(submit);
        this.add(blurLabel);
        this.add(imageLabel);
        this.add(background);

    }
    public static void main(String[] args) {
        FacultyAdd frame = new FacultyAdd();
        frame.setVisible(true);
    }
}
