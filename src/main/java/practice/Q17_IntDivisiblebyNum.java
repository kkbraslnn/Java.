package practice;

public class Q17_IntDivisiblebyNum {
    public static void main(String[] args) {

        //Type code to print the integers divisible by 4 and by 6 from 13 to 211.

        //1.way:
        for (int i = 13; i < 212; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");//24 36 48 60 72 84 96 108 120 132 144 156 168 180 192 204
            }

        }

        System.out.println();
        //2.way:

        int i = 13;

        while (i < 212) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");//24 36 48 60 72 84 96 108 120 132 144 156 168 180 192 204
            }
            i++;

        }


    }
}
