package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeDark extends JFrame{


    public WelcomeDark () {

        // Frame Information
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("UniQuiz");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./assets/logo1.png");
        this.setIconImage(img.getImage());

        ImageIcon logoImg = new ImageIcon("./assets/logo1.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/3.png");

        JLabel background = new JLabel(BackgroundImg);

        JLabel logo = new JLabel();
        logo.setIcon(logoImg);
        logo.setBounds(444, 29, 135, 135);

        JLabel txt1 = new JLabel("Welcome to");
        txt1.setFont(new Font("Verdana", Font.PLAIN, 30));
        txt1.setForeground(new Color(0xD0E7F7));
        txt1.setVerticalTextPosition(JLabel.CENTER);
        txt1.setHorizontalTextPosition(JLabel.CENTER);
        txt1.setBounds(416, 176, 204, 42);


        JLabel txt2 = new JLabel("UniQuiz");
        txt2.setFont(new Font("Verdana", Font.BOLD, 60));
        txt2.setForeground(new Color(0xD0E7F7));
        txt2.setVerticalTextPosition(JLabel.CENTER);
        txt2.setHorizontalTextPosition(JLabel.CENTER);
        txt2.setBounds(383, 218, 269, 85);

        // Login Button
        JButton loginbtn = new JButton("Sign In");
        loginbtn.setBounds(129, 327, 226, 56);
        loginbtn.setFont(new Font("Verdana", Font.BOLD, 30));
        loginbtn.setBackground(new Color(0xD0E7F7));
        loginbtn.setForeground(new Color(0x071330));
        loginbtn.setFocusPainted(false);
        loginbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
   
                setVisible(false);
                 Login frame = new Login();
                frame.setVisible(true);
            }
         });

         
        // Sign Up Button
        JButton registerbtn = new JButton("Sign Up");
        registerbtn.setBounds(399, 329, 226, 56);
        registerbtn.setFont(new Font("Verdana", Font.BOLD, 30));
        registerbtn.setBackground(new Color(0xD0E7F7));
        registerbtn.setForeground(new Color(0x071330));
        registerbtn.setFocusPainted(false);
        registerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Registration frame = new Registration();
                frame.setVisible(true);
            }
        });


        // Admin Button
        JButton teambtn = new JButton("Admin");
        teambtn.setBounds(669, 325, 226, 56);
        teambtn.setFont(new Font("Verdana", Font.BOLD, 30));
        teambtn.setBackground(new Color(0xD0E7F7));
        teambtn.setForeground(new Color(0x071330));
        teambtn.setFocusPainted(false);
        teambtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                AdminLogin frame = new AdminLogin();
                frame.setVisible(true);
            }
        });

        this.add(teambtn);
        this.add(registerbtn);
        this.add(loginbtn);
        this.add(txt2);
        this.add(txt1);
        this.add(logo);
        this.add(background);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        
        WelcomeDark frame = new WelcomeDark();
        frame.setVisible(true);
    }
}