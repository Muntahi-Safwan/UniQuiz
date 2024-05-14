package src;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User extends Account{
    private String name;
    private String studentId;
    private String userEmail;
    private String department;
    private String userPassword;
    private double cgpa;
    private File file;
    private FileWriter writer;
    private Scanner sc;

    //Empty Constructor
    public User()
    {
        this.name="";
    }

    public User(String studentId,String userPassword,String name, String userEmail,String department)
    {
        this.name=name;
        this.studentId=studentId;
        this.userEmail=userEmail;
        this.department=department;
        this.userPassword=userPassword;
        this.cgpa=0;
    }

    //setter & getter method
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public String getDepartment() {
        return department;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public void addAccount()
    {
        try
        {
            file = new File("Data\\Users.txt");
            file.createNewFile();
            writer  = new FileWriter(file,true);
            writer.write(getStudentId()+"\t");
            writer.write(getUserPassword()+"\t");
            writer.write(getDepartment()+"\t");
            writer.write(getName()+"\t");
            writer.write(getUserEmail()+"\t");
            writer.write(getCgpa() + "\n");
            writer.flush();
            writer.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    @Override
    public boolean getAccount(String userName,String userPassword)
    {
        boolean isAuth = false;
        String path ="Data\\Users.txt";
        file = new File(path);
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if(value[0].equals(userName) && value[1].equals(userPassword))
                {
                    isAuth=true;
                }
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return isAuth;
    }


}