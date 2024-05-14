package src;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Faculty {
    private String name;
    private String facultyId;
    private String email;
    private String mobileNumber;
    private String password;
    private File file;
    private FileWriter writer;
    private Scanner sc;

    //Empty Constructor
    public Faculty()
    {
        this.name="";
    }

    public Faculty(String facultyId,String password,String name, String email,String mobileNumber)
    {
        this.name=name;
        this.facultyId=facultyId;
        this.email=email;
        this.mobileNumber=mobileNumber;
        this.password=password;
        
    }

    //setter & getter method
    public void setName(String name) {
        this.name = name;
    }
    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public String getFacultyId() {
        return facultyId;
    }
    public String getEmail() {
        return email;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getPassword() {
        return password;
    }

    public void addAccount()
    {
        try
        {
            file = new File("Data\\Faculty.txt");
            file.createNewFile();
            writer  = new FileWriter(file,true);
            writer.write(getFacultyId()+"\t");
            writer.write(getPassword()+"\t");
            writer.write(getMobileNumber()+"\t");
            writer.write(getName()+"\t");
            writer.write(getEmail()+"\n");
            writer.flush();
            writer.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public boolean getAccount(String facultyId,String userPassword)
    {
        boolean isAuth = false;
        String path ="Data\\Faculty.txt";
        file = new File(path);
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if(value[0].equals(facultyId) && value[1].equals(userPassword))
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