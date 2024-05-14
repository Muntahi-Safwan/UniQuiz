package src;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Person {
    String name;
    String studentId;
    String email;
    String password;
    String department;
    String cgpa;
    int lineNumber;

    public Person(String studentId) {
        this.studentId = studentId;
        String filePath = "Data/Users.txt";
        String searchString = this.studentId;
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
    }
}
