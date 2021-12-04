package atm;

public class ATM {
    private Tray initialTray;

    public ATM(){
        Tray tray20 = new Tray20();
        Tray tray10 = new Tray10();
        Tray tray5 = new Tray5();
        Tray nullTray = new nullTray();
        tray20.setNext(tray10);
        tray10.setNext(tray5);
        tray5.setNext(nullTray);

        this.initialTray  = tray20;
    }

    public void process(int amount){
        initialTray.process(amount);
    }
}
