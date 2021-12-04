import atm.*;
import builder.User;

import java.util.Scanner;

public class Main1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int amount = sc.nextInt();
        ATM atm = new ATM();


        atm.process(amount);
        User user = User.builder()
                .name("Adam")
                .age(20)
                .gender("m")
                .height(180)
                .race("eu")
                .occupation("programming")
                .occupation("sport")
                .build();

        System.out.println(user.getName());
        System.out.println(user);
    }
}
