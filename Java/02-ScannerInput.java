import java.util.Scanner;
class InputFromScanner{
    public static void main(String[] args){
        //Output in java
        System.out.print("hello"); // print without moving to the next line
        System.out.println("hello");// print text and move the cursor to next line
        String name= "Dhruv";
        int age= 23;
        System.out.printf("Name: %s Age: %d",name,age);


        //Taking input from Scanner class
        Scanner sc = new Scanner(System.in); //System.in - Standard keyboard input
        System.out.print("Enter your age: ");
        int ag = sc.nextInt();

        System.out.print("Your age is "+ag);
        sc.close();

        /*
        sc.nextDouble(); -> For double input
        sc.nextFloat(); -> For float input
        sc.nextLong(); -> For long input
        sc.nextShort(); -> For short input
        sc.nextByte(); -> For byte input
        sc.nextBoolean(); -> For boolean input
        sc.next().charAt(0); -> For sinlge character only
        sc.next(); -> For String input
        sc.nextLine(); Reads the complete line
        */



    }
}