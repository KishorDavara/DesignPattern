package adapter;

public class UsbCAdapter implements UsbCCharger{
    private final MicroUsbCharger microUsbCharger;

    public UsbCAdapter(MicroUsbCharger microUsbCharger) {
        this.microUsbCharger = microUsbCharger;
    }

    @Override
    public void chargeWithUsbC() {
        microUsbCharger.chargeWithMicroUsb();
    }
}
