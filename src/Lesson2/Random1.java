package Lesson2;

import java.util.Random;

public class Random1 {
    private int nextInt;

    public static void main(String[] args) {

//        double random = Math.random();
//        System.out.println((int) (random * 100));

        Random random = new Random();
        int i = random.nextInt(0,10);
    }
}
