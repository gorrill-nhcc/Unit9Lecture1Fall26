package basicOOP;

public class Main {
    public static void main(String[] args) {
        A myA = new A(12, "Hello World");
        System.out.println(myA);

        B myB = new B();
        System.out.println(myB);

        myA.setAInt(45);
        myB.setAInt(78);
        System.out.println(myA);
        System.out.println(myB);
    }
}
