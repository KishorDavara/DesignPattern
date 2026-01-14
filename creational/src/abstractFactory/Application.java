package abstractFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.checkbox = uiFactory.createCheckbox();
    }

    public static void main(String[] args) {
        UIFactory uiFactory;

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            uiFactory = new WindowsUIFactory();
        } else {
            uiFactory = new MacUIFactory();
        }
        Application application = new Application(uiFactory);
        application.paint();
    }

    private void paint() {
        button.print();
        checkbox.print();
    }
}
