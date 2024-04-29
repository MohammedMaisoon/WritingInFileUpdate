import java.io.FileWriter;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class File {

        public static void main(String[] args) throws Exception{
            LocalTime currentTime = LocalTime.now();
            try {
                Scanner input = new Scanner(System.in);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                String formattedTime = currentTime.format(formatter);
                System.out.println("Write anything to Store in File: ");
                FileWriter writer = new FileWriter("abc.txt");
                writer.write("Saved Time: ");
                writer.write(formattedTime);
                writer.write("\n");
                writer.write(input.nextLine());
                writer.close();
                System.out.println("Text Has Been Written To The File Successfully");
            }
            catch (Exception e){
                System.out.println("An Error Occurred While Writing To The File"+e.getMessage());
            }
        }}






