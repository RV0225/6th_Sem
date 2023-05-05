package Rough;

public class Permut {
    public static void main(String args[]) {
        int count = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 != 0 && i % 4 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
