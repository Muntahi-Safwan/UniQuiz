package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AlgoQuizDark extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 30;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    Person p;
    
    public AlgoQuizDark(Person user) {
        this.p = user;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Algo Quiz | UniQuiz");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./assets/logo1.png");
        this.setIconImage(img.getImage());
        
        ImageIcon selectImg = new ImageIcon("./assets/quiz.png");
        ImageIcon BackgroundImg = new ImageIcon("./assets/4.png");
        ImageIcon blur = new ImageIcon("./assets/Rectangle-21.png");

        JLabel background = new JLabel(BackgroundImg);

        JLabel blurLabel = new JLabel();
        blurLabel.setIcon(blur);
        blurLabel.setBounds(35, 45, 940, 580);

        JLabel select = new JLabel();
        select.setIcon(selectImg);
        select.setBounds(270, 40, 400, 278);
        
        qno = new JLabel();
        qno.setBounds(100, 320, 50, 30);
        qno.setFont(new Font("Verdana", Font.PLAIN, 24));
        qno.setForeground(new Color(0xB8E4FA));
        add(qno);
        
        question = new JLabel();
        question.setBounds(130, 320, 900, 30);
        question.setFont(new Font("Verdana", Font.PLAIN, 24));
        question.setForeground(new Color(0xB8E4FA));
        add(question);
        
        questions[0][0] = "Which of the following is a divide-and-conquer algorithm?";
        questions[0][1] = "Bubble Sort";
        questions[0][2] = "Merge Sort";
        questions[0][3] = "nsertion Sort";
        questions[0][4] = "Selection Sort";

        questions[1][0] = "Which data structure is typically used for implementing a stack?";
        questions[1][1] = "Linked List";
        questions[1][2] = "Array";
        questions[1][3] = "Queue";
        questions[1][4] = "Binary Tree";

        questions[2][0] = "What is the time complexity of binary search algorithm?";
        questions[2][1] = "O(n)";
        questions[2][2] = "O(log n)";
        questions[2][3] = "O(n log n)";
        questions[2][4] = "O(1)";

        questions[3][0] = "Which algorithm is used for finding the shortest path in a weighted graph?";
        questions[3][1] = "Breadth-First Search (BFS)";
        questions[3][2] = "Depth-First Search (DFS)";
        questions[3][3] = "Dijkstra's Algorithm";
        questions[3][4] = "A* Search Algorithm";

        questions[4][0] = "Which of the following algorithms is used for searching in a sorted array?";
        questions[4][1] = "Linear Search";
        questions[4][2] = " Binary Search";
        questions[4][3] = "Depth-First Search (DFS)";
        questions[4][4] = "Breadth-First Search (BFS)";

        questions[5][0] = "Which algorithm is used for minimum spanning tree?";
        questions[5][1] = "Kruskal's Algorithm";
        questions[5][2] = "Dijkstra's Algorithm";
        questions[5][3] = "Bellman-Ford Algorithm";
        questions[5][4] = "Prim's Algorithm";

        questions[6][0] = "Which sorting algorithm has the best average-case time complexity?";
        questions[6][1] = "Bubble Sort";
        questions[6][2] = "Merge Sort";
        questions[6][3] = "Quick Sort";
        questions[6][4] = "Insertion Sort";

        questions[7][0] = "Which algorithm is used for topological sorting?";
        questions[7][1] = "Bellman-Ford Algorithm";
        questions[7][2] = "Depth-First Search (DFS)";
        questions[7][3] = "Breadth-First Search (BFS)";
        questions[7][4] = "Dijkstra's Algorithm";

        questions[8][0] = "Which algorithm is used for finding the closest pair of points in a set?";
        questions[8][1] = "Divide and Conquer";
        questions[8][2] = "Dynamic Programming";
        questions[8][3] = "Quick Sort";
        questions[8][4] = "Closest Pair of Points Algorithm";

        questions[9][0] = "Which algorithm is used for finding the maximum subarray sum?";
        questions[9][1] = "Greedy Algorithm";
        questions[9][2] = "Divide and Conquer";
        questions[9][3] = "Dynamic Programming";
        questions[9][4] = "Quick Sort";
        
        answers[0][1] = "Merge Sort";
        answers[1][1] = "Linked List";
        answers[2][1] = "O(log n)";
        answers[3][1] = "Dijkstra's Algorithm";
        answers[4][1] = "Binary Search";
        answers[5][1] = "Prim's Algorithm";
        answers[6][1] = "Quick Sort";
        answers[7][1] = "Depth-First Search (DFS)";
        answers[8][1] = "Closest Pair of Points Algorithm";
        answers[9][1] = "Dynamic Programming";
        
        opt1 = new JRadioButton();
        opt1.setBounds(110, 380, 400, 30);
        opt1.setBackground(new Color(0xB8E4FA));
		opt1.setForeground(new Color(0x071330));
        opt1.setFont(new Font("Verdana", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(110, 420, 400, 30);
        opt2.setBackground(new Color(0xB8E4FA));
		opt2.setForeground(new Color(0x071330));
        opt2.setFont(new Font("Verdana", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(110, 460, 400, 30);
		opt3.setBackground(new Color(0xB8E4FA));
		opt3.setForeground(new Color(0x071330));
        opt3.setFont(new Font("Verdana", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(110, 500, 400, 30);
        opt4.setBackground(new Color(0xB8E4FA));
		opt4.setForeground(new Color(0x071330));
        opt4.setFont(new Font("Verdana", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(109, 545, 190, 40);
        next.setFont(new Font("Verdana", Font.BOLD, 22));
        next.setBackground(new Color(0xB8E4FA));
		next.setForeground(new Color(0x071330));
        next.setFocusPainted(false);
        next.addActionListener(this);
        add(next);
        
        submit = new JButton("Submit");
        submit.setBounds(320, 545, 190, 40);
        submit.setFont(new Font("Verdana", Font.BOLD, 22));
        next.setBackground(new Color(0xB8E4FA));
        next.setForeground(new Color(0x071330));
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        this.add(select);
        this.add(background);
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {   
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(p, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(new Color(0xB8E4FA));
        g.setFont(new Font("Verdana", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 600, 500);
        } else {
            g.drawString("Times up!!", 600, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 30;
        } else if (timer < 0) {
            timer = 30;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                Score s = new Score(p, score);
                s.setVisible(true);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }

}