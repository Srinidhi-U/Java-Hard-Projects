class FinallyDemo {

    public static void main(String[] args) {

        try {
            int a = 10 / 2;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            System.out.println("Error");
        }
        finally {
            System.out.println("Finally executed");
        }
    }
}