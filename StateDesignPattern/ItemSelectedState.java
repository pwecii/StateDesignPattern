public class ItemSelectedState implements VendingMachineState {

    private VendingMachine machine;

    public ItemSelectedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Item already selected.");
    }

    @Override
    public void insertCoin(double amount) {
        machine.addBalance(amount);
        System.out.println("Inserted: " + amount);

        if (machine.getBalance() >= 10) {
            machine.setState(machine.getDispensingState());
            machine.dispenseItem();
        }
    }

    @Override
    public void dispenseItem() {
        System.out.println("Insert sufficient coins first.");
    }

    @Override
    public void setOutOfOrder() {
        machine.setState(machine.getOutOfOrderState());
    }
}
