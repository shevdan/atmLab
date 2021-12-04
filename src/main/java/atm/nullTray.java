package atm;

public class nullTray extends DefaultTray{
    public nullTray(){
        super(0);
    }

    @Override
    public void process (int amount){
        if (amount !=0)
            throw new IllegalArgumentException();
        System.out.println("Finished");

    }
}
