public class DispensingState implements VendingMachineState {

    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Currently dispensing. Please wait.");
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("Currently dispensing. Cannot insert coin.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Dispensing item...");
        machine.decreaseInventory();
        machine.resetBalance();

        if (machine.getInventory() > 0) {
            machine.setState(machine.getIdleState());
        } else {
            machine.setState(machine.getOutOfOrderState());
        }
    }

    @Override
    public void setOutOfOrder() {
        machine.setState(machine.getOutOfOrderState());
    }
}