package src;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;


public class ProfileDark extends JFrame{
    String studentId, name, email, cgpa, department, password,lineNumber1;
    int lineNumber;
    public ProfileDark(Person user) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Profile | UniQuiz");
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
            
            for (int lineNumber = 0 ; scanner.hasNextLine() ; lineNumber++) {
                String line = scanner.nextLine();

                if (line.contains(searchString)) {
                    String[] value = line.split("\t");
                    this.studentId = value[0];
                    this.password = value[1];
                    this.department = value[2];
                    this.name = value[3];
                    this.email= value[4];
                    this.cgpa = value[5];
                    this.lineNumber = lineNumber;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ImageIcon logoImg = new ImageIcon("./assets/log2B.png");
        JLabel logo = new JLabel();
        logo.setIcon(logoImg);
        logo.setBounds(108, 232, 231, 231);

        ImageIcon BackgroundImg = new ImageIcon("./assets/4.png");
        JLabel background = new JLabel(BackgroundImg);

        
        ImageIcon longbarImg = new ImageIcon("./assets/longBar-light.png");
        JLabel longbar = new JLabel();
        longbar.setIcon(longbarImg);
        longbar.setBounds(367, 105, 12, 560);

        JLabel navbar = new JLabel(new ImageIcon("./assets/navbar-dark.png"));
        navbar.setBounds(20, 17, 966, 63);

        JLabel navbarBtn2 = new JLabel(new ImageIcon("./assets/navbar-btn-dark.png"));
        navbarBtn2.setBounds(427, 30, 170, 37);

        JButton logoutBtn = new JButton("LogOut");
        logoutBtn.setOpaque(false);
		logoutBtn.setFocusable(false);
        logoutBtn.setFont(new Font("Verdana", Font.BOLD, 24));
        logoutBtn.setForeground(new Color(0xD3E5EF));
		logoutBtn.setBackground(Color.white);
		logoutBtn.setBounds(427, 30, 170, 37);
		logoutBtn.setBorderPainted(false);
        logoutBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Welcome o = new Welcome();
                o.setVisible(true);
            }
        });
         //back button
        JButton backBtn = new JButton();
        backBtn.setOpaque(false);
		backBtn.setFocusable(false);
		backBtn.setBackground(Color.white);
		backBtn.setBounds(35,20,56,56);
		backBtn.setBorderPainted(false);
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                SelectCourseDark o = new SelectCourseDark(user);
                o.setVisible(true);
            }
        });

        JLabel backBtnImg = new JLabel(new ImageIcon("./assets/backBtn-dark.png"));
        backBtnImg.setBounds(35,20,56,56);

        //Light button
        JButton darkBtn = new JButton();
        darkBtn.setOpaque(false);
		darkBtn.setFocusable(false);
		darkBtn.setBackground(Color.white);
		darkBtn.setBounds(910,23,50,50);
		darkBtn.setBorderPainted(false);

		darkBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new CSE110();
                
                setVisible(false);
                Profile o = new Profile(user);
                o.setVisible(true);
            }
        });
        
        JLabel lightBtnImg = new JLabel(new ImageIcon("./assets/lightBtn.png"));
        lightBtnImg.setBounds(910,23,50,50);


        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Verdana", Font.BOLD, 24));
        name.setForeground(new Color(0xB8E4FA));
        name.setBounds(422, 214, 100, 36);

        //textfield For Name
        RoundedJTextField textField1 = new RoundedJTextField(10);
        textField1.setBounds(604, 209, 283, 45);
        textField1.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField1.setForeground(Color.black);
        textField1.setBackground(new Color(0xB8E4FA));
        textField1.setText("Name");
        textField1.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField1.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField1.setHorizontalAlignment(RoundedJTextField.CENTER);



        JLabel studentId = new JLabel("Student ID:");
        studentId.setFont(new Font("Verdana", Font.BOLD, 24));
        studentId.setForeground(new Color(0xB8E4FA));
        studentId.setBounds(422, 278, 400, 40);
        //textfield for ID
        RoundedJTextField textField2 = new RoundedJTextField(10);
        textField2.setBounds(604, 273, 283, 45);
        textField2.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField2.setForeground(Color.black);
        textField2.setBackground(new Color(0xB8E4FA));
        textField2.setText("Student Id");
        textField2.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField2.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField2.setHorizontalAlignment(RoundedJTextField.CENTER);


        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Verdana", Font.BOLD, 24));
        email.setForeground(new Color(0xB8E4FA));
        email.setBounds(422, 342, 400, 40);
        //textfield for Email
        RoundedJTextField textField3 = new RoundedJTextField(10);
        textField3.setBounds(604, 337, 283, 45);
        textField3.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField3.setForeground(Color.black);
        textField3.setBackground(new Color(0xB8E4FA));
        textField3.setText("Email");
        textField3.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField3.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField3.setHorizontalAlignment(RoundedJTextField.CENTER);

        JLabel department = new JLabel("Department:");
        department.setFont(new Font("Verdana", Font.BOLD, 24));
        department.setForeground(new Color(0xB8E4FA));
        department.setBounds(422, 406, 400, 40);
        //textfield for Department
        RoundedJTextField textField4 = new RoundedJTextField(10);
        textField4.setBounds(604, 401, 283, 45);
        textField4.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField4.setForeground(Color.black);
        textField4.setBackground(new Color(0xB8E4FA));
        textField4.setText("Department");
        textField4.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField4.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField4.setHorizontalAlignment(RoundedJTextField.CENTER);

        //textField for update
        RoundedJTextField textField5 = new RoundedJTextField(10);
        textField5.setBounds(532, 560, 283, 45);
        textField5.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField5.setForeground(Color.black);
        textField5.setBackground(new Color(0xB8E4FA));
        textField5.setText("Password");
        textField5.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        textField5.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        textField5.setHorizontalAlignment(RoundedJTextField.CENTER);

        JLabel cgpa = new JLabel("CGPA: " + this.cgpa);
        cgpa.setFont(new Font("Verdana", Font.BOLD, 24));
        cgpa.setForeground(new Color(0xB8E4FA));
        cgpa.setBounds(422, 470, 400, 40);

        JButton update = new JButton();
        update.setText("Update");
        update.setFont(new Font("Verdana",Font.PLAIN,18));
        update.setForeground(Color.WHITE);
        update.setOpaque(false);
		update.setFocusable(false);
		update.setBackground(Color.white);
		update.setBounds(594,615,160,60);
		update.setBorderPainted(false);
        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                String studentId = textField2.getText();
                String email = textField3.getText();
                String department = textField4.getText();
                String password = textField5.getText();
                if (user.password.equals(password)) {
                    try {
                        File file = new File(filePath);
                        Scanner scanner = new Scanner(file);

                        StringBuilder fileContent = new StringBuilder();
                        lineNumber = 0;
                        while (scanner.hasNextLine()) {
                            lineNumber++;
                            String line = scanner.nextLine();

                            if (line.contains(studentId)) {
                                String[] values = line.split("\t");
                                values[0] = studentId;
                                values[2] = department;
                                values[3] = name;
                                values[4] = email;
                                line = String.join("\t", values);
                            }

                            fileContent.append(line).append("\n");
                        }

                        scanner.close();

                        FileWriter writer = new FileWriter(file);
                        writer.write(fileContent.toString());
                        writer.close();

                        JOptionPane.showMessageDialog(null, "Profile Updated Successfully");
                        setVisible(false);
                        ProfileDark p = new ProfileDark(user);
                        p.setVisible(true);
 
                    }catch (FileNotFoundException fileNotFoundException) {
                        fileNotFoundException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please check the password.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            
        }});

        JLabel updateimg = new JLabel(new ImageIcon("./assets/Button.png"));
        updateimg.setBounds(594,615,160,60);


        this.add(update);
        this.add(updateimg);
        this.add(longbar);
        this.add(lightBtnImg);
        this.add(logoutBtn);
        this.add(darkBtn);
        this.add(backBtnImg);
        this.add(backBtn);
        this.add(navbarBtn2);
        this.add(navbar);
        this.add(textField1);
        this.add(textField2);
        this.add(textField3);
        this.add(textField4);
        this.add(textField5);
        this.add(cgpa);
        this.add(department);
        this.add(email);
        this.add(studentId);
        this.add(name);
        this.add(logo);
        this.add(background);
        this.setVisible(true);


    }

    public static void main(String[] args) {
        ProfileDark pr = new ProfileDark(new Person("23-53117-3"));
        pr.setVisible(true);
    }
}
