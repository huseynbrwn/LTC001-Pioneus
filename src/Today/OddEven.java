package Today;

public class OddEven {
    public static final int maxNumber = 5; //consonant with the value of 10K

    public static final int currentNumber = 1; //consonant with the value of 10K



    public static void main(String[] args) {
        Thread oddThread = new Thread(() -> printNumbers(false));
        Thread evenThread = new Thread(() -> printNumbers(true));

        oddThread.start();
        evenThread.start();
    }

    public static void printNumbers(boolean isEven) {
        synchronized (OddEven.class) {
            for (int i = 1; i <= maxNumber; i++) //if even is true for initializes i to 2 and 1 otherwise.
                if ((i % 2 == 0 && isEven) || (i % 2 != 0 && !isEven)) {
                     System.out.println(i);
                }
            }

        }
    }

