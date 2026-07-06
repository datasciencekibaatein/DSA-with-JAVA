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
    }
}