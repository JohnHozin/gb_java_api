package seminar.seminar_oop_1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Product("Lays",123.55))
                .addProduct(new Product("Pringls", 255.12))
                .addProduct(new Product("Fanta", 2312.4))
                .addProduct(new Product("Kola", 35.12))
                .addProduct(new Product("Qwe", 55.12))
                .addProduct(new Product("Asd", 25.12))
                .addProduct(new Beer("alcoholFree", 25.12))
                .addProduct(new Beer("notBeer", 25.12,99))
                .addProduct(new CurledProduct("milk", 25.12,5));


        System.out.println(vendingMachine);

        System.out.println("searching for Lays");
        System.out.println(vendingMachine.findProduct("Lays"));

        System.out.println("buying Lays");
        vendingMachine.buy("Lays",123.55);
        System.out.println(vendingMachine);

        System.out.println("buying Fanta");
        vendingMachine.buy("Fanta",2312.4);
        System.out.println(vendingMachine);

        System.out.println("buying zxc");
        vendingMachine.buy("zxc",544.6);
        System.out.println(vendingMachine);


    }
}
