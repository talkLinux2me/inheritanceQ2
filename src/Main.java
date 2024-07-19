public class Main {
    public static void main(String[] args) {

        Adder one = new Adder();
        System.out.println("My superclass is: " + one.getClass().getSuperclass().getName());
        System.out.println(Arithmetic.add(20,22) + " " + Arithmetic.add(3,10) + " " + Arithmetic.add (15,5));
    }
}