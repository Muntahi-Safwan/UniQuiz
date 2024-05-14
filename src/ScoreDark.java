package src;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ScoreDark extends JFrame implements ActionListener {
    Person p;

    public ScoreDark(Person user, int score) {
        this.p = user;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Result | UniQuiz");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./assets/logo1.png");
        this.setIconImage(img.getImage());
        
        ImageIcon selectImg = new ImageIcon("./assets/score.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/4.png");
        ImageIcon blur = new ImageIcon("./assets/Rectangle-21.png");

        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("./assets/logo.png"));
        JLabel background = new JLabel(BackgroundImg);

        JLabel blurLabel = new JLabel();
        blurLabel.setIcon(blur);
        blurLabel.setBounds(35, 45, 940, 580);

        JLabel select = new JLabel();
        select.setIcon(selectImg);
        select.setBounds(362, 70, 300, 300);
        
        JLabel heading = new JLabel("Submitted Successfully!!!");
        heading.setBounds(337, 360, 400, 28);
        heading.setFont(new Font("Verdana", Font.BOLD, 30));
        heading.setVerticalTextPosition(JLabel.CENTER);
        heading.setHorizontalTextPosition(JLabel.CENTER);
        heading.setForeground(new Color(0xB8E4FA));
        add(heading);

        JLabel l1 = new JLabel("Name: " + user.name);
        l1.setBounds(351, 405, 336, 30);
        l1.setFont(new Font("Verdana", Font.PLAIN, 25));
        l1.setVerticalTextPosition(JLabel.CENTER);
        l1.setHorizontalTextPosition(JLabel.CENTER);
        l1.setForeground(new Color(0xB8E4FA));
        add(l1);
        
        JLabel lblscore = new JLabel("Obtained Mark: " + score);
        lblscore.setBounds(351, 449, 336, 30);
        lblscore.setFont(new Font("Verdana", Font.PLAIN, 25));
        lblscore.setVerticalTextPosition(JLabel.CENTER);
        lblscore.setHorizontalTextPosition(JLabel.CENTER);
        lblscore.setForeground(new Color(0xB8E4FA));
        add(lblscore);

        int incorrect = (100 - score) / 10;

        JLabel l2 = new JLabel("Incorrect: " + incorrect);
        l2.setBounds(351, 493, 336, 30);
        l2.setFont(new Font("Verdana", Font.PLAIN, 25));
        l2.setVerticalTextPosition(JLabel.CENTER);
        l2.setHorizontalTextPosition(JLabel.CENTER);
        l2.setForeground(new Color(0xB8E4FA));
        add(l2);
        
        JButton submit = new JButton("Next");
        submit.setBounds(400, 540, 226, 50);
        submit.setBackground(new Color(0xB8E4FA));
        submit.setFont(new Font("Verdana", Font.BOLD, 32));
        submit.setForeground(new Color(0x071330));
		submit.setFocusPainted(false);
        submit.addActionListener(this);
        add(submit);
        
        this.add(select);
        //this.add(blurLabel);
        this.add(background);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        SelectCourse s = new SelectCourse(p);
        s.setVisible(true);
    }

    public static void main(String[] args) {
        new ScoreDark(new Person("23-53117-3"), 60);
    }
}