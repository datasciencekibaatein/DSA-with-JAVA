class Variables_Datatypes_Operators{
    public static void main(String[] args){
        // Variables
        int num = 34;
        String str = "Anything";
        // Datatypes
        /*
        Java is strongly typed language, meaning every variable name
        should be assigned with particular datatype.

        There are two types:
            - Primitive types
            - Non-Primitive(Reference) types
         */

        //Primitive Types
        /*
        byte - 1 byte - -128 to 127
        short - 2 bytes
        int - 4 bytes
        long - 8 bytes
        float - 4 bytes
        double - 8 bytes
        char - 2 bytes
        boolean - 1 bit(logical)
        */

       byte age = 25;
       short population = 25000;
       int salary = 50000;
       long mobile = 893478287L; // need to add L in last of number
       float pi = 3.14f; // need to add f in last
       double amount = 34567.89;
       char grade = 'A';
       boolean flag = true;

       System.out.println(salary);


       int a = 10;
        int b = 3;

        System.out.println("===== ARITHMETIC OPERATORS =====");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n===== UNARY OPERATORS =====");
        int x = 5;
        System.out.println("Original x = " + x);

        System.out.println("Post Increment (x++) = " + (x++));
        System.out.println("After Post Increment = " + x);

        System.out.println("Pre Increment (++x) = " + (++x));

        System.out.println("Post Decrement (x--) = " + (x--));
        System.out.println("After Post Decrement = " + x);

        System.out.println("Pre Decrement (--x) = " + (--x));

        System.out.println("\n===== ASSIGNMENT OPERATORS =====");
        int c = 10;

        c += 5;
        System.out.println("c += 5 : " + c);

        c -= 3;
        System.out.println("c -= 3 : " + c);

        c *= 2;
        System.out.println("c *= 2 : " + c);

        c /= 4;
        System.out.println("c /= 4 : " + c);

        c %= 3;
        System.out.println("c %= 3 : " + c);

        System.out.println("\n===== RELATIONAL OPERATORS =====");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        System.out.println("\n===== LOGICAL OPERATORS =====");
        boolean p = true;
        boolean q = false;

        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p     : " + (!p));

        System.out.println("\n===== BITWISE OPERATORS =====");
        int m = 5;   // Binary: 0101
        int n = 3;   // Binary: 0011

        System.out.println("m & n  = " + (m & n));
        System.out.println("m | n  = " + (m | n));
        System.out.println("m ^ n  = " + (m ^ n));
        System.out.println("~m     = " + (~m));

        System.out.println("\n===== SHIFT OPERATORS =====");
        System.out.println("m << 1 = " + (m << 1));
        System.out.println("m >> 1 = " + (m >> 1));
        System.out.println("m >>> 1 = " + (m >>> 1));

        System.out.println("\n===== TERNARY OPERATOR =====");
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age Category : " + result);

        System.out.println("\n===== INSTANCEOF OPERATOR =====");
        String name = "Dhruv";
        System.out.println("name instanceof String : " + (name instanceof String));

        System.out.println("\n===== OPERATOR PRECEDENCE =====");
        int answer = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + answer);

        System.out.println("\n===== TYPE CASTING =====");
        double value = 15.75;
        int converted = (int) value;
        System.out.println("Double Value : " + value);
        System.out.println("Converted Int : " + converted);
    }
}