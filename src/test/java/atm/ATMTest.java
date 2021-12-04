package atm;


import org.junit.Test;

public class ATMTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAtm(){
        ATM atm = new ATM();
        atm.process(126);
    }

}