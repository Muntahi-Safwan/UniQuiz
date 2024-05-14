package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SelectCourseDark extends JFrame {

    public SelectCourseDark(Person user) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("AIUB QuizHub");
        this.setSize(1024, 720); 
        this.setResizable(false);
        
        ImageIcon selectImg = new ImageIcon("./assets/select.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/4.png");
        ImageIcon blur = new ImageIcon("./assets/Rectangle-21.png");
        ImageIcon logoImg = new ImageIcon("./assets/log2.png");

        JLabel background = new JLabel(BackgroundImg);

        JLabel logo = new JLabel();
        logo.setIcon(logoImg);
        logo.setBounds(443, 92, 137, 137);


        JLabel blurLabel = new JLabel();
        blurLabel.setIcon(blur);
        blurLabel.setBounds(30, 50, 940, 580);

        JLabel navbar = new JLabel(new ImageIcon("./assets/navbar-dark.png"));
        navbar.setBounds(20, 17, 966, 63);
        

        JLabel navbarBtn1 = new JLabel(new ImageIcon("./assets/navbar-btn-dark.png"));
        navbarBtn1.setBounds(304, 29, 170, 37);

        JButton profileBtn = new JButton("Profile");
        profileBtn.setOpaque(false);
		profileBtn.setFocusable(false);
        profileBtn.setForeground(new Color(0xB8E4FA));
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

        JLabel navbarBtn2 = new JLabel(new ImageIcon("./assets/navbar-btn-dark.png"));
        navbarBtn2.setBounds(525, 29, 170, 37);

        JButton logoutBtn = new JButton("LogOut");
        logoutBtn.setOpaque(false);
		logoutBtn.setFocusable(false);
        logoutBtn.setFont(new Font("Roboto", Font.BOLD, 24));
        logoutBtn.setForeground(new Color(0xB8E4FA));
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

        JLabel backBtnImg = new JLabel(new ImageIcon("./assets/backBtn-dark.png"));
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
                SelectCourse o = new SelectCourse(user);
                o.setVisible(true);
            }
        });

        JLabel darkBtnImg = new JLabel(new ImageIcon("./assets/lightBtn.png"));
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
                IPDark o = new IPDark(user);
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
                OOPDark o = new OOPDark(user);
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
                // new CSE110();
                System.out.println("CSE 110");
                setVisible(false);
                DSDark o = new DSDark(user);
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
                AlgoDark o = new AlgoDark(user);
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

        // JLabel text1 = new JLabel("Hello Name");
        // text1.setFont(new Font("Roboto", Font.BOLD, 30));
        // text1.setBounds(365, 200, 250, 250);
        // https://colors.muz.li/palette/B8E4FA/81a6af/eefcff/ddf9ff/ffffff 

        JLabel text2 = new JLabel("Select Course");
        text2.setFont(new Font("Roboto", Font.BOLD, 44));
        text2.setBounds(365, 245, 333, 61);
        text2.setBackground(new Color(0xB8E4FA));
        text2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        text2.setForeground(new Color(0xB8E4FA));


        // JLabel text3 = new JLabel("Name: " + user.name);
        // text3.setFont(new Font("Roboto", Font.BOLD, 30));
        // text3.setBounds(100, 200, 300, 100);
        // text3.setBackground(new Color(0xB8E4FA));
        // text3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        // text3.setForeground(Color.black);
        
        JButton button1 = new JButton("Introduction to Programming");
        button1.setBounds(20, 360, 454, 81);
        button1.setFont(new Font("Roboto", Font.BOLD, 20));
        button1.setBackground(new Color(0xB8E4FA));
        button1.setForeground(Color.black);
        button1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button1.setAlignmentY(JButton.CENTER_ALIGNMENT);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE110();
                System.out.println("CSE 110");
                setVisible(false);
                IPDark o = new IPDark(user);
                o.setVisible(true);
            }
        });

        JButton button2 = new JButton("Object Oriented Programming 1");
        button2.setBounds(20, 511, 454, 81);
        button2.setFont(new Font("Roboto", Font.BOLD, 20));
        button2.setBackground(new Color(0xB8E4FA));
        button2.setForeground(Color.black);
        button2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button2.setAlignmentY(JButton.CENTER_ALIGNMENT);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE111();
                setVisible(false);
                OOPDark o = new OOPDark(user);
                o.setVisible(true);
            }
        });

        JButton button3 = new JButton("Data Structure");
        button3.setBounds(542, 360, 454, 81);
        button3.setFont(new Font("Roboto", Font.BOLD, 20));
        button3.setBackground(new Color(0xB8E4FA));
        button3.setForeground(Color.black);
        button3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button3.setAlignmentY(JButton.CENTER_ALIGNMENT);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE112();
                setVisible(false);
                DSDark ds = new DSDark(user);
                ds.setVisible(true);
                System.out.println("CSE 112");
            }
        });

        JButton button4 = new JButton("Algorithms");
        button4.setBounds(542, 511, 454, 81);
        button4.setFont(new Font("Roboto", Font.BOLD, 20));
        button4.setBackground(new Color(0xB8E4FA));
        button4.setForeground(Color.black);
        button4.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button4.setAlignmentY(JButton.CENTER_ALIGNMENT);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE113();
                setVisible(false);
                AlgoDark al = new AlgoDark(user);
                al.setVisible(true);
                System.out.println("CSE 113");
            }
        });

        // JButton button5 = new JButton("CSE 114");
        // button5.setBounds(365, 500, 250, 40);
        // button5.setFont(new Font("Roboto", Font.BOLD, 20));
        // button5.setBackground(new Color(0xB8E4FA));
        // button5.setForeground(Color.black);
        // button5.setAlignmentX(JButton.CENTER_ALIGNMENT);
        // button5.setAlignmentY(JButton.CENTER_ALIGNMENT);
        // button5.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         // new CSE114();
        //         System.out.println("CSE 114");
        //     }
        // });

        // JButton button6 = new JButton("Exit");
        // button6.setBounds(365, 500, 250, 40);
        // button6.setFont(new Font("Roboto", Font.BOLD, 20));
        // button6.setBackground(new Color(0xB8E4FA));
        // button6.setForeground(Color.black);
        // button6.setAlignmentX(JButton.CENTER_ALIGNMENT);
        // button6.setAlignmentY(JButton.CENTER_ALIGNMENT);
        // button6.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         System.exit(0);
        //     }
        // });


        //this.add(button6);
        // this.add(button4);
        // this.add(button3);
        // this.add(button2);
        // this.add(button1);
        this.add(course4Btn);
        this.add(course4BtnImg);
        this.add(course3Btn);
        this.add(course3BtnImg);
        this.add(course2Btn);
        this.add(course2BtnImg);
        this.add(course1Btn);
        this.add(course1BtnImg);
        this.add(text2);
        // this.add(text1);
        //this.add(select);
       //this.add(blurLabel);
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
        SelectCourseDark s = new SelectCourseDark(new Person("23-53117-3"));
        s.setVisible(true);
    }
}
