public class TypeCasting {
    public static void main(String[] args) {

        // Widening casting

        int myInt = 10;
        double myDouble = myInt; // automatically casting int to double

        System.out.println(myInt); // 10
        System.out.println(myDouble); // 10.0

        int myBnt = 50;
        double myBouble = myBnt;

        System.out.println(myBnt); // 50
        System.out.println(myBouble); // 50.0

        int myCnt = 90;
        double myCouble = myCnt;

        System.out.println(myCnt);  // 90
        System.out.println(myCouble);  // 90.0
    }
}
