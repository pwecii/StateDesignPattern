public class Main {
    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine(2);

        machine.selectItem("Soda");
        machine.insertCoin(5);
        machine.insertCoin(5);

        machine.selectItem("Chips");
        machine.insertCoin(10);

        machine.selectItem("Candy"); // should go out of stock
    }
}
