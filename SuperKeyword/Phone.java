class Phone {
    String type = "Phone";

    Phone() {
        System.out.println("Phone ON");
    }

    void call() {
        System.out.println("Calling...");
    }
}

class Smartphone extends Phone {
    String type = "Smartphone";

    Smartphone() {
        super();
    }

    void show() {
        System.out.println(super.type);
        super.call();
    }

    public static void main(String[] args) {
        new Smartphone().show();
    }
}
