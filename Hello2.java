public class Hello2 {
    public static void main(String[] args) {
        // final int myNum=50;
        // myNum=20; // will generate an error: cannot assign a value to a final
        // variable
        // System.out.println(myNum);

        String name = "john";
        System.out.println("hello " + name); // hello john

        String firstname = "asmit ";
        String lastname = "aryan";
        String fullname = firstname + lastname;
        System.out.println(fullname); // asmit aryan

        /*
         * int x = 50;
         * int y = 40;
         * System.out.println(x + y); 90
         */

        int x = 5;
        int y = 6;
        System.out.println("the sum is " + x + y);  // the sum is 56

        System.out.println("the sum is " + (x + y));  // the sum is 11

        

    }
}
