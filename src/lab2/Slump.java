package lab2;

import java.util.Random;

public class Slump {
    public static void main(String[] args) {


        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j <= 25; j++) {
                Random rnd = new Random();
                System.out.print(rnd.nextInt(25) + "\t");
            }
            System.out.println();
        }
    }
}
