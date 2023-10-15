import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("this is just a test.");
            writer.close();
            System.out.println("Syccessfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    
    }
}
