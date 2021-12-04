package atm;

import org.junit.Test;


public class nullTrayTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNullTray(){
        Tray nullTray = new nullTray();
        nullTray.process(2);
    }
}