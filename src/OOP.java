package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OOP extends JFrame{
    Person p;
    public OOP(Person user){
        this.p = user;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("OOP | UniQuiz");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./assets/logo1.png");
        this.setIconImage(img.getImage());

        ImageIcon selectImg = new ImageIcon("./assets/quizDetails.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/2.png");
        ImageIcon blur = new ImageIcon("./assets/Rectangle-21.png");

        JLabel background = new JLabel(BackgroundImg);

        JLabel blurLabel = new JLabel();
        blurLabel.setIcon(blur);
        blurLabel.setBounds(35, 45, 940, 580);

        
        JLabel select = new JLabel();
        select.setIcon(selectImg);
        select.setBounds(550, 140, 420, 420);

        JLabel txt1 = new JLabel("Object Oriented Programming Quiz");
        txt1.setFont(new Font("Verdana", Font.BOLD, 25));
        txt1.setBounds(100, 200, 450, 60);
        txt1.setForeground(Color.black);
        txt1.setBackground(new Color(0xB8E4FA));
        txt1.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JLabel txt2 = new JLabel("Time: 5:00");
        txt2.setFont(new Font("Verdana", Font.PLAIN, 18));
        txt2.setBounds(100, 280, 280, 30);
        txt2.setForeground(Color.black);
        txt2.setBackground(new Color(0xB8E4FA));
        txt2.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JLabel txt3 = new JLabel("No. of Questions: 10");
        txt3.setFont(new Font("Verdana", Font.PLAIN, 18));
        txt3.setBounds(100, 310, 280, 30);
        txt3.setForeground(Color.black);
        txt3.setBackground(new Color(0xB8E4FA));
        txt3.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JLabel txt4 = new JLabel("Time for each question: 30 seconds");
        txt4.setFont(new Font("Verdana", Font.PLAIN, 18));
        txt4.setBounds(100, 340, 350, 30);
        txt4.setForeground(Color.black);
        txt4.setBackground(new Color(0xB8E4FA));
        txt4.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JLabel txt5 = new JLabel("Select each answer from the given options");
        txt5.setFont(new Font("Verdana", Font.PLAIN, 18));
        txt5.setBounds(100, 370, 400, 30);
        txt5.setForeground(Color.black);
        txt5.setBackground(new Color(0xB8E4FA));
        txt5.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JLabel txt6 = new JLabel("and click Next");
        txt6.setFont(new Font("Verdana", Font.PLAIN, 18));
        txt6.setBounds(100, 400, 400, 30);
        txt6.setForeground(Color.black);
        txt6.setBackground(new Color(0xB8E4FA));
        txt6.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JButton button1 = new JButton("Start Quiz");
        button1.setBounds(100, 450, 420, 40);
        button1.setFont(new Font("Verdana", Font.BOLD, 18));
        button1.setBackground(new Color(0x050E30));
        button1.setForeground(Color.WHITE);
        button1.setFocusable(false);
        button1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button1.setAlignmentY(JButton.CENTER_ALIGNMENT);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                OOPQuiz oopQuiz = new OOPQuiz(user);
                oopQuiz.setVisible(true);
            }
        });

        JButton button2 = new JButton("Back");
        button2.setBounds(100, 500, 420, 40);
        button2.setFont(new Font("Verdana", Font.BOLD, 18));
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(0x071330));
        button2.setFocusable(false);
        button2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button2.setAlignmentY(JButton.CENTER_ALIGNMENT);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                SelectCourse o = new SelectCourse(user);
                o.setVisible(true);
            }
        });

        this.add(button2);

        this.add(button1);
        this.add(txt6);
        this.add(txt5);
        this.add(txt4);
        this.add(txt3);
        this.add(txt2);
        this.add(txt1);
        this.add(select);
        this.add(blurLabel);
        this.add(background);
        this.setVisible(true);
    }
}
