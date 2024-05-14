package src;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Score extends JFrame implements ActionListener {
    Person p;
    double current;
    String cgpaPrevious;

    public Score(Person user, int score) {
        this.p = user;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Result | UniQuiz");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./assets/logo1.png");
        this.setIconImage(img.getImage());

        String filePath = "Data/Users.txt";
        String searchString = user.studentId;
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            for (int lineNumber = 0; scanner.hasNextLine(); lineNumber++) {
                String line = scanner.nextLine();
                System.out.println(lineNumber);
                if (line.contains(searchString)) {
                    String[] value = line.split("\t");
                    this.cgpaPrevious = value[5];
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (score >= 90) {
            this.current = 4.0;
        } else if (score == 80) {
            this.current = 3.75;
        } else if (score == 70) {
            this.current = 3.5;
        } else if (score == 60) {
            this.current = 3.25;
        } else if (score == 50) {
            this.current = 3;
        } else {
            this.current = 0;
        }

        double calculate;

        if (Double.parseDouble(this.cgpaPrevious) > 0) {
            calculate = this.current;
        } else {
            double previous = this.current;
            calculate = ((previous * 3) + (current * 3)) / 6;
        }
        System.out.println("calculate" + calculate);

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            StringBuilder fileContent = new StringBuilder();
            int lineNumber = 0;
            System.out.println(lineNumber);
            while (scanner.hasNextLine()) {
                lineNumber++;
                String line = scanner.nextLine();
                String cgpa = Double.toString(calculate);
                if (line.contains(user.studentId)) {
                    String[] values = line.split("\t");
                    values[5] = cgpa;
                    line = String.join("\t", values);
                }
                // System.out.println(lineNumber);
                fileContent.append(line).append("\n");
            }

            scanner.close();

            FileWriter writer = new FileWriter(file);
            writer.write(fileContent.toString());
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ImageIcon selectImg = new ImageIcon("./assets/score.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/2.png");
        ImageIcon blur = new ImageIcon("./assets/Rectangle-21.png");

        JLabel background = new JLabel(BackgroundImg);

        JLabel blurLabel = new JLabel();
        blurLabel.setIcon(blur);
        blurLabel.setBounds(35, 45, 940, 580);

        JLabel select = new JLabel();
        select.setIcon(selectImg);
        select.setBounds(362, 70, 300, 300);

        JLabel heading = new JLabel("Submitted Successfully!!!");
        heading.setBounds(337, 360, 400, 30);
        heading.setFont(new Font("Verdana", Font.BOLD, 28));
        heading.setVerticalTextPosition(JLabel.CENTER);
        heading.setHorizontalTextPosition(JLabel.CENTER);
        heading.setForeground(Color.black);
        add(heading);

        JLabel l1 = new JLabel("Name: " + user.name);
        l1.setBounds(351, 405, 336, 30);
        l1.setFont(new Font("Verdana", Font.PLAIN, 25));
        l1.setVerticalTextPosition(JLabel.CENTER);
        l1.setHorizontalTextPosition(JLabel.CENTER);
        l1.setForeground(Color.black);
        add(l1);

        JLabel lblscore = new JLabel("Obtained Mark: " + score);
        lblscore.setBounds(351, 449, 336, 30);
        lblscore.setFont(new Font("Verdana", Font.PLAIN, 25));
        lblscore.setVerticalTextPosition(JLabel.CENTER);
        lblscore.setHorizontalTextPosition(JLabel.CENTER);
        lblscore.setForeground(Color.black);
        add(lblscore);

        int incorrect = (100 - score) / 10;

        JLabel l2 = new JLabel("Incorrect: " + incorrect);
        l2.setBounds(351, 493, 336, 30);
        l2.setFont(new Font("Verdana", Font.PLAIN, 25));
        l2.setVerticalTextPosition(JLabel.CENTER);
        l2.setHorizontalTextPosition(JLabel.CENTER);
        l2.setForeground(Color.black);
        add(l2);

        JButton submit = new JButton("Next");
        submit.setBounds(400, 540, 226, 50);
        submit.setBackground(new Color(0x071330));
        submit.setFont(new Font("Verdana", Font.BOLD, 32));
        submit.setForeground(new Color(0xB8E4FA));
        submit.addActionListener(this);
        submit.setFocusPainted(false);
        add(submit);

        this.add(select);
        this.add(blurLabel);
        this.add(background);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        SelectCourse s = new SelectCourse(p);
        s.setVisible(true);
    }
}