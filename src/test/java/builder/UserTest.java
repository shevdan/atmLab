package builder;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserTest {

    @Test
    public void testBuilding() {
        User user = User.builder()
                .name("Adam")
                .age(20)
                .gender("m")
                .height(180)
                .race("eu")
                .occupation("programmer")
                .occupation("programmer")
                .build();

        assertEquals("Adam", user.getName());
        assertEquals(20, user.getAge());
        assertEquals("m", user.getGender());
        assertEquals(180, user.getHeight());
        assertEquals("eu", user.getRace());
        assertArrayEquals(new String[] {"programmer", "programmer"}, user.getOccupations().toArray(new String[0]));





    }
}