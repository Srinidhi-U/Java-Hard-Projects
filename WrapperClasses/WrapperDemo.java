class WrapperDemo {

    public static void main(String[] args) {

        int a = 10;

        Integer b = a;       // Autoboxing
        int c = b;           // Unboxing

        System.out.println("Integer: " + b);
        System.out.println("int: " + c);
    }
}