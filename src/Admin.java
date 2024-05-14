package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Admin extends JFrame {

    public Admin() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Admin | UniQuiz");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./assets/logo1.png");
        this.setIconImage(img.getImage());
    
        ImageIcon BackgroundImg = new ImageIcon("./assets/2.png");
        ImageIcon logoImg = new ImageIcon("./assets/admin.png");

        JLabel background = new JLabel(BackgroundImg);

        JLabel logo = new JLabel();
        logo.setIcon(logoImg);
        logo.setBounds(237, 57, 500, 500);

        JLabel navbar = new JLabel(new ImageIcon("./assets/navbar-light.png"));
        navbar.setBounds(20, 17, 966, 63);
        

        JLabel navbarBtn2 = new JLabel(new ImageIcon("./assets/navbar-btn.png"));
        navbarBtn2.setBounds(790, 30, 170, 37);

        JButton logoutBtn = new JButton("LogOut");
        logoutBtn.setOpaque(false);
		logoutBtn.setFocusable(false);
        logoutBtn.setFont(new Font("Verdana", Font.BOLD, 24));
        logoutBtn.setForeground(new Color(0x050E30));
		logoutBtn.setBackground(Color.white);
		logoutBtn.setBounds(790, 30, 170, 37);
		logoutBtn.setBorderPainted(false);
        logoutBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Welcome o = new Welcome();
                o.setVisible(true);
            }
        });

        JButton backBtn = new JButton();
        backBtn.setOpaque(false);
		backBtn.setFocusable(false);
		backBtn.setBackground(Color.white);
		backBtn.setBounds(35,20,56,56);
		backBtn.setBorderPainted(false);

        JLabel backBtnImg = new JLabel(new ImageIcon("./assets/backBtn-light.png"));
        backBtnImg.setBounds(35,20,56,56);

        JButton FacultyBtn = new JButton("Faculty Info");
        FacultyBtn.setFont(new Font("Verdana",Font.PLAIN,32));
        FacultyBtn.setForeground(Color.WHITE);
		FacultyBtn.setFocusable(false);
		FacultyBtn.setBackground(new Color(0x050E30));
		FacultyBtn.setBounds(169,537,289,74);
		FacultyBtn.setBorderPainted(false);
        FacultyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                FacultyData o = new FacultyData();
                o.setVisible(true);
            }
        });


        JButton Studentinfo = new JButton("Student Info");
        Studentinfo.setFont(new Font("Verdana",Font.PLAIN,32));
        Studentinfo.setForeground(Color.WHITE);
		Studentinfo.setFocusable(false);
		Studentinfo.setBackground(new Color(0x050E30));
		Studentinfo.setBounds(632,537,289,74);
		Studentinfo.setBorderPainted(false);
        Studentinfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                UserData o = new UserData();
                o.setVisible(true);
            }
        });

       this.add(Studentinfo);
       this.add(FacultyBtn);
       this.add(backBtn);
       this.add(backBtnImg);
       this.add(logoutBtn);
       this.add(navbarBtn2);
       this.add(navbar);
       this.add(logo);
       this.add(background);
       this.setVisible(true);
    }

    public static void main(String[] args) {
        Admin s = new Admin();
        s.setVisible(true);
    }
}