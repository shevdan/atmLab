package atm;

public abstract class DefaultTray implements Tray{
    private final int bill;
    private  Tray nextTray;

    public DefaultTray(int bill){
        this.bill = bill;
    }

    public void process (int amount){
        nextTray.process(amount % bill);
        System.out.println("Got " + amount / bill + " bills with amount of " + bill);

    }

    public void setNext(Tray tray){
        this.nextTray = tray;
    }
}
