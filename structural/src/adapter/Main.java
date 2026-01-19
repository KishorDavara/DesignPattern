package adapter;

public class Main {
    public static void main(String[] args) {
        MicroUsbCharger oldCharger = new MicroUsbCharger();
        UsbCCharger adapter = new UsbCAdapter(oldCharger);

        adapter.chargeWithUsbC();
    }
}
