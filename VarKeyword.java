public class VarKeyword {

    public static void main(String[] args) {
        var x = 50;
        System.out.println(x);  // the var keyword identifies what kind of data type it is 

       // var y ="hello";
        // System.out.println(y); 

        var y=50; // now it is an int
        y=60; // still an int
        y=9.99; // cant assign a double to an int
    }
}