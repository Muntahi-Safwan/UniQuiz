package src;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FacultyData extends JFrame implements ActionListener  {
    private Container c;
    private JLabel label1;
    private Font f1, f2, f3;
    private JScrollPane scroll;
    private JTable table;
    private DefaultTableModel model;
    private JButton Refreshbtn, Deletebtn, AddUserbtn, ExitBtn, Backbtn;
    private Cursor cursor;
    private String[] column = { "Faculty ID", "Full Name", "Email", "MobileNumber" };
    private String[] rows = new String[7];

    public FacultyData() {
        // ----------------------------------------Frame Layout---------------------
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Faculty Data | UniQuiz");
        this.setSize(1024, 720); // 480
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./assets/logo1.png");
        this.setIconImage(img.getImage());

        ImageIcon BackgroundImg = new ImageIcon("./assets/2.png");
        JLabel background = new JLabel(BackgroundImg);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(0xB8E4FA));

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Faculty Data");
        label1.setForeground(new Color(0x050E30));
        label1.setBounds(350, 10, 400, 80);
        label1.setFont(f1);
        c.add(label1);

        //----------------------------------------------------JButtons--------------------------------
        Refreshbtn = new JButton("Refresh");
        Refreshbtn.setBounds(53, 518, 184, 50);
        Refreshbtn.setFont(f2);
        Refreshbtn.setForeground(new Color(0xB8E4FA));
        Refreshbtn.setCursor(cursor);
        Refreshbtn.setBackground(new Color(0x050E30));
        Refreshbtn.setFocusable(false);
        c.add(Refreshbtn);

        Deletebtn = new JButton("Delete");
        Deletebtn.setBounds(240, 518, 184, 50);
        Deletebtn.setFont(f2);
        Deletebtn.setForeground(new Color(0xB8E4FA));
        Deletebtn.setCursor(cursor);
        Deletebtn.setBackground(new Color(0x050E30));
        Deletebtn.setFocusable(false);
        c.add(Deletebtn);

        AddUserbtn = new JButton("Add Faculty");
        AddUserbtn.setBounds(430, 518, 184, 50);
        AddUserbtn.setFont(f2);
        AddUserbtn.setForeground(new Color(0xB8E4FA));
        AddUserbtn.setCursor(cursor);
        AddUserbtn.setBackground(new Color(0x050E30));
        AddUserbtn.setFocusable(false);
        c.add(AddUserbtn);

        ExitBtn = new JButton("Exit");
        ExitBtn.setBounds(620, 518, 178, 50);
        ExitBtn.setFont(f2);
        ExitBtn.setForeground(new Color(0xB8E4FA));
        ExitBtn.setCursor(cursor);
        ExitBtn.setBackground(new Color(0x050E30));
        ExitBtn.setFocusable(false);
        c.add(ExitBtn);

        Backbtn = new JButton("Back");
        Backbtn.setBounds(810, 518, 136, 50);
        Backbtn.setFont(f2);
        Backbtn.setCursor(cursor);
        Backbtn.setForeground(new Color(0xB8E4FA));
        Backbtn.setBackground(new Color(0x050E30));
        Backbtn.setFocusable(false);
        c.add(Backbtn);

        // JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(f3);
        table.getTableHeader().setFont(f3);
        table.setAlignmentX(CENTER_ALIGNMENT);
        table.setAlignmentY(CENTER_ALIGNMENT);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(40);
        table.setSize(900, 400);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(170);
        table.getColumnModel().getColumn(1).setPreferredWidth(220);
        table.getColumnModel().getColumn(2).setPreferredWidth(285);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);

        scroll = new JScrollPane(table);
        scroll.setBounds(53, 96, 900, 400);
        scroll.setBackground(Color.WHITE);
        c.add(scroll);

        String filepath = "./Data/Faculty.txt";
        Path path = Paths.get("Data/Faculty.txt");

        // To input data in the table
        try {

            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            int totalLines = 0;
            File file = new File(filepath);
            Scanner scanner = new Scanner(file);
            while (reader.readLine() != null)
                totalLines++;
                reader.close();

                for (int i = 0; i < totalLines; i++) {
                    String lined = scanner.nextLine();
                    String[] value = lined.split("\t");
                    this.rows[0] = value[0];
                    this.rows[1] = value[3];
                    this.rows[2] = value[4];
                    this.rows[3] = value[2];                 
                    model.addRow(rows);

                }
                scanner.close();

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return;
        }

        // Refresh Button
        Refreshbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                FacultyData frame = new FacultyData();
                frame.setVisible(true);

            }
        });
        
        // Delete Button
        Deletebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int lineNumber = table.getSelectedRow();
                
                if (table.getSelectionModel().isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        List<String> lines = Files.readAllLines(path);
                        lines.remove(lineNumber);
                        Files.write(path, lines);
                        JOptionPane.showMessageDialog(null,"User Remove Successful");
                        setVisible(false);
                        FacultyData frame = new FacultyData();
                        frame.setVisible(true);
                        } catch (IOException e) {
                        JOptionPane.showMessageDialog(null,"ERROR");
                        }
                }
            }
        });

        // Add Button
        AddUserbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                FacultyAdd frame = new FacultyAdd();
                frame.setVisible(true);
            }
        });

        // Exit Button
        ExitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        //Back Button
        Backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Admin frame = new Admin();
                frame.setVisible(true);
            }
        });
    

    c.add(background);
}
    public static void main(String[] args) {
        FacultyData frame = new FacultyData();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}