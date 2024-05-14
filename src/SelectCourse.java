package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SelectCourse extends JFrame {

    public SelectCourse(Person user) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("AIUB QuizHub");
        this.setSize(1024, 720); 
        this.setResizable(false);
        
        ImageIcon selectImg = new ImageIcon("./assets/select.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/2.png");
        ImageIcon blur = new ImageIcon("./assets/Rectangle-21.png");
        ImageIcon logoImg = new ImageIcon("./assets/log2.png");

        JLabel background = new JLabel(BackgroundImg);

        JLabel logo = new JLabel();
        logo.setIcon(logoImg);
        logo.setBounds(443, 92, 137, 137);


        JLabel blurLabel = new JLabel();
        blurLabel.setIcon(blur);
        blurLabel.setBounds(30, 50, 940, 580);

        JLabel navbar = new JLabel(new ImageIcon("./assets/navbar-light.png"));
        navbar.setBounds(20, 17, 966, 63);
        

        JLabel navbarBtn1 = new JLabel(new ImageIcon("./assets/navbar-btn.png"));
        navbarBtn1.setBounds(304, 29, 170, 37);

        JButton profileBtn = new JButton("Profile");
        profileBtn.setOpaque(false);
		profileBtn.setFocusable(false);
        profileBtn.setForeground(new Color(0x050E30));
        profileBtn.setFont(new Font("Roboto", Font.BOLD, 24));
		profileBtn.setBackground(Color.white);
		profileBtn.setBounds(304,29,170,37);
		profileBtn.setBorderPainted(false);
        profileBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE110();
                System.out.println("CSE 110");
                setVisible(false);
                Profile o = new Profile(user);
                o.setVisible(true);
            }
        });

        JLabel navbarBtn2 = new JLabel(new ImageIcon("./assets/navbar-btn.png"));
        navbarBtn2.setBounds(525, 29, 170, 37);

        JButton logoutBtn = new JButton("LogOut");
        logoutBtn.setOpaque(false);
		logoutBtn.setFocusable(false);
        logoutBtn.setFont(new Font("Roboto", Font.BOLD, 24));
        logoutBtn.setForeground(new Color(0x050E30));
		logoutBtn.setBackground(Color.white);
		logoutBtn.setBounds(525, 29, 170, 37);
		logoutBtn.setBorderPainted(false);
        logoutBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE110();
                System.out.println("Log Out");
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
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Login o = new Login();
                o.setVisible(true);
            }
        });
        JLabel backBtnImg = new JLabel(new ImageIcon("./assets/backBtn-light.png"));
        backBtnImg.setBounds(35,20,56,56);


        JButton darkBtn = new JButton();
        darkBtn.setOpaque(false);
		darkBtn.setFocusable(false);
		darkBtn.setBackground(Color.white);
		darkBtn.setBounds(910,23,50,50);
		darkBtn.setBorderPainted(false);
		darkBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE110();
                System.out.println("CSE 110");
                setVisible(false);
                SelectCourseDark o = new SelectCourseDark(user);
                o.setVisible(true);
            }
        });
		
        JLabel darkBtnImg = new JLabel(new ImageIcon("./assets/darkBtn.png"));
        darkBtnImg.setBounds(910,23,50,50);

        JButton course1Btn = new JButton("Introduction to Programming");
        course1Btn.setOpaque(false);
		course1Btn.setFocusable(false);
        course1Btn.setForeground(new Color(0x050E30));
		course1Btn.setBackground(Color.white);
        course1Btn.setFont(new Font("Roboto", Font.BOLD, 26));
		course1Btn.setBounds(20,360,454,81);
		course1Btn.setBorderPainted(false);
        course1Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE110();
                System.out.println("CSE 110");
                setVisible(false);
                IP o = new IP(user);
                o.setVisible(true);
            }
        });

        JButton course2Btn = new JButton("Object Oriented Programming");
        course2Btn.setOpaque(false);
		course2Btn.setFocusable(false);
        course2Btn.setForeground(new Color(0x050E30));
        course2Btn.setFont(new Font("Roboto", Font.BOLD, 26));
		course2Btn.setBackground(Color.white);
		course2Btn.setBounds(542,360,454,81);
		course2Btn.setBorderPainted(false);
        course2Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE111();
                setVisible(false);
                OOP o = new OOP(user);
                o.setVisible(true);
            }
        });

        JButton course3Btn = new JButton("Data Structure");
        course3Btn.setOpaque(false);
		course3Btn.setFocusable(false);
        course3Btn.setFont(new Font("Roboto", Font.BOLD, 26));
        course3Btn.setForeground(new Color(0x050E30));
		course3Btn.setBackground(Color.white);
		course3Btn.setBounds(20,511,454,81);
		course3Btn.setBorderPainted(false);
        course3Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                DS o = new DS(user);
                o.setVisible(true);
            }
        });


        JButton course4Btn = new JButton("Algorithm");
        course4Btn.setOpaque(false);
		course4Btn.setFocusable(false);
        course4Btn.setFont(new Font("Roboto", Font.BOLD, 26));
        course4Btn.setForeground(new Color(0x050E30));
		course4Btn.setBackground(Color.white);
		course4Btn.setBounds(542,511,454,81);
		course4Btn.setBorderPainted(false);
        course4Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE110();
                System.out.println("CSE 110");
                setVisible(false);
                Algo o = new Algo(user);
                o.setVisible(true);
            }
        });


        JLabel course1BtnImg = new JLabel(new ImageIcon("./assets/courseBtn.png"));
        course1BtnImg.setBounds(20,360,454,81);
        JLabel course2BtnImg = new JLabel(new ImageIcon("./assets/courseBtn.png"));
        course2BtnImg.setBounds(542,360,454,81);
        JLabel course3BtnImg = new JLabel(new ImageIcon("./assets/courseBtn.png"));
        course3BtnImg.setBounds(20,511,454,81);
        JLabel course4BtnImg = new JLabel(new ImageIcon("./assets/courseBtn.png"));
        course4BtnImg.setBounds(542,511,454,81);

        JLabel select = new JLabel();
        select.setIcon(selectImg);
        select.setBounds(365, 5, 250, 250);

        JLabel text2 = new JLabel("Select Course");
        text2.setFont(new Font("Roboto", Font.BOLD, 44));
        text2.setBounds(365, 245, 333, 61);
        text2.setBackground(new Color(0xB8E4FA));
        text2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        text2.setForeground(Color.black);


        // Adding to Frame
        this.add(course4Btn);
        this.add(course4BtnImg);
        this.add(course3Btn);
        this.add(course3BtnImg);
        this.add(course2Btn);
        this.add(course2BtnImg);
        this.add(course1Btn);
        this.add(course1BtnImg);
        this.add(text2);
        this.add(darkBtn);
        this.add(darkBtnImg);
        this.add(backBtn);
        this.add(backBtnImg);
        this.add(logoutBtn);
        this.add(navbarBtn2);
        this.add(profileBtn);
        this.add(navbarBtn1);
        this.add(navbar);
        this.add(logo);
        this.add(background);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SelectCourse s = new SelectCourse(new Person("23-53117-3"));
        s.setVisible(true);
    }
}
