import java.io.File;
public class file{
    public static void main(String[] args) {
        File file = new File("text.txt");
        if (file.exists()) {
            System.out.println("File Exist: " + file.getName());
        } else {
            System.out.println("File Not Found");
        }
    }
}