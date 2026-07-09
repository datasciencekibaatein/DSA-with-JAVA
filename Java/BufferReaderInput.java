import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class BufferReaderInput {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        //Buffer reader always return string we need to parse the input

        System.out.print("Enter the name");
        String name = br.readLine();
        System.out.print("Your name is "+name);

        //to convert in any other input type we use wrapper clasess
        int age = Integer.parseInt(br.readLine());
        double salary = Double.parseDouble(br.readLine());


    }
}
