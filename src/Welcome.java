package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame{

    public Welcome () {

        // Frame Information
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("UniQuiz");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./assets/logo1.png");
        this.setIconImage(img.getImage());

        ImageIcon logoImg = new ImageIcon("./assets/logo1.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/1.png");

        JLabel background = new JLabel(BackgroundImg);

        JLabel logo = new JLabel();
        logo.setIcon(logoImg);
        logo.setBounds(444, 14, 135, 135);

        JLabel txt1 = new JLabel("Welcome to");
        txt1.setFont(new Font("Verdana", Font.BOLD, 30));
        txt1.setForeground(new Color(0x071330));
        txt1.setVerticalTextPosition(JLabel.CENTER);
        txt1.setHorizontalTextPosition(JLabel.CENTER);
        txt1.setBounds(410, 154, 210, 43);

        //jLabel for Uniquize
        JLabel txt2 = new JLabel("UniQuiz");
        txt2.setFont(new Font("Verdana", Font.BOLD, 60));
        txt2.setForeground(new Color(0x071330));
        txt2.setVerticalTextPosition(JLabel.CENTER);
        txt2.setHorizontalTextPosition(JLabel.CENTER);
        txt2.setBounds(375, 189, 306, 85);

        //Log In
        JButton loginbtn = new JButton("Log In");
        loginbtn.setBounds(272, 287, 226, 56);
        loginbtn.setFont(new Font("Verdana", Font.BOLD, 30));
        loginbtn.setBackground(new Color(0x071330));
        loginbtn.setForeground(new Color(0xD0E7F7));
        loginbtn.setFocusPainted(false);

        JButton registerbtn = new JButton("Sign Up");
        registerbtn.setBounds(525, 287, 226, 56);
        registerbtn.setFont(new Font("Verdana", Font.BOLD, 30));
        registerbtn.setBackground(new Color(0x071330));
        registerbtn.setForeground(new Color(0xD0E7F7));
        registerbtn.setFocusPainted(false);

        JButton teambtn = new JButton("Admin");
        teambtn.setBounds(525, 358, 226, 56);
        teambtn.setFont(new Font("Verdana", Font.BOLD, 30));
        teambtn.setBackground(new Color(0x071330));
        teambtn.setForeground(new Color(0xD0E7F7));
        teambtn.setFocusPainted(false);
        teambtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                AdminLogin frame = new AdminLogin();
                frame.setVisible(true);
            }
        });
        JButton FacultyBtn = new JButton("Faculty");
        FacultyBtn.setBounds(272, 358, 226, 56);
        FacultyBtn.setFont(new Font("Verdana", Font.BOLD, 30));
        FacultyBtn.setBackground(new Color(0x071330));
        FacultyBtn.setForeground(new Color(0xD0E7F7));
        FacultyBtn.setFocusPainted(false);
        FacultyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                FacultyLogin frame = new FacultyLogin();
                frame.setVisible(true);
            }
         });

        this.add(FacultyBtn);
        this.add(teambtn);
        this.add(registerbtn);
        this.add(loginbtn);
        this.add(txt2);
        this.add(txt1);
        this.add(logo);
        this.add(background);
        this.setVisible(true);

        

        // Sign In Button
       loginbtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae) {

             setVisible(false);
              Login frame = new Login();
             frame.setVisible(true);
         }
      });

        // Sign Up Button
        registerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Registration frame = new Registration();
                frame.setVisible(true);
            }
        });
    }

}