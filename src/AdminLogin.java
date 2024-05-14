package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AdminLogin extends JFrame {
    Person user;
    
    public AdminLogin(){
        // Frame Information
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Admin Login | UniQuiz");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./assets/logo1.png");
        this.setIconImage(img.getImage());

        ImageIcon blur = new ImageIcon("./assets/Rectangle 2.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/2.png");
        ImageIcon image = new ImageIcon("./assets/adminLoginDark2.png");
        ImageIcon logoImg = new ImageIcon("./assets/log2.png");

        JLabel background = new JLabel(BackgroundImg);

        // Logo Image
        JLabel logo = new JLabel();
        logo.setIcon(logoImg);
        logo.setBounds(668, 127, 137, 137);

        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(image);
        imageLabel.setBounds(12, 158, 500, 500);

        // Blur Image
        JLabel blurLabel = new JLabel();
        blurLabel.setIcon(blur);
        blurLabel.setBounds(512, 50, 450, 620);

        JLabel text1 = new JLabel("Admin Log In", JLabel.CENTER);
        text1.setFont(new Font("Verdana", Font.BOLD, 30));
        text1.setForeground(new Color(0x071330));
        text1.setBounds(637, 281, 240, 49);


        // Full Name
        RoundedJTextField textField1 = new RoundedJTextField(10);
        textField1.setBounds(553, 360, 378, 52);
        textField1.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField1.setBackground(new Color(0xB8E4FA));
        textField1.setForeground(Color.black);
        textField1.setText("Username");
        textField1.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField1.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField1.setHorizontalAlignment(RoundedJTextField.CENTER);

        // Student ID
        RoundedJTextField textField2 = new RoundedJTextField(10);
        textField2.setBounds(553, 438, 378, 52);
        textField2.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField2.setBackground(new Color(0xB8E4FA));
        textField2.setForeground(Color.black);
        textField2.setText("Password");
        textField2.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField2.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField2.setHorizontalAlignment(RoundedJTextField.CENTER);

        
        // Log IN Button
        JButton submit = new JButton("Log In");
        submit.setBounds(756, 520, 175, 47);
        submit.setFont(new Font("Verdana", Font.BOLD, 25));
        submit.setBackground(new Color(0xB8E4FA));
        submit.setForeground(Color.black);
        submit.setFocusPainted(false);

        // Back Button
        JButton Back = new JButton("Back");
        Back.setBounds(557, 520, 175, 47);
        Back.setFont(new Font("Verdana", Font.BOLD, 25));
        Back.setBackground(new Color(0xB8E4FA));
        Back.setForeground(Color.black);
        Back.setFocusPainted(false);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Welcome o = new Welcome();
                o.setVisible(true);
            }
        });

        // Login Button
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String tf1 = textField1.getText(); // Student ID 
                String tf2 = textField2.getText(); // Password
                if (tf1.isEmpty() || tf2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
			 	        if(tf1.equals("admin") && tf2.equals("admin"))
                        {
                            JOptionPane.showMessageDialog(null,"Admin Login Successful");
                            Admin f = new Admin();
                            setVisible(false);
                            f.setVisible(true);
            
                        } else{JOptionPane.showMessageDialog(null, "Check UserName/Password");}
                    
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        this.add(logo);
        this.add(text1);
        this.add(textField1);
        this.add(textField2);
        this.add(Back);
        this.add(submit);
        this.add(blurLabel);
        this.add(imageLabel);
        this.add(background);
    }

}
