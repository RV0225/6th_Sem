
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Learn_Basics {

    public static void main(String args[]) throws IOException {
        // if (args.length == 0) {
        // System.out.println("No Command Line Argument");
        // } else {
        // String argsnew = String.join(" Technologies ", args);
        // System.out.println(argsnew);
        // }

        // int sum = 0;
        // for (String s : args) {
        // sum += Integer.parseInt(s);
        // }
        // System.out.println(sum);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String s = br.readLine();
        // PriorityQueue<Character> pq = new PriorityQueue<>();
        // for (char c : s.toCharArray()) {
        // pq.add(c);
        // }
        // System.out.println(pq.poll() + "," + pq.poll());
        // int a = 56;
        // int b = 7;
        // if (a % 10 == b % 10) {
        // System.out.println("Same");
        // } else {
        // System.out.println("Different");
        // }

        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // String gender = args[0];
        // int age = Integer.valueOf(args[1]);
        // if (gender.equals("Female") && age > 1 && age < 57) {
        // System.out.println("8.2%");
        // }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // // Scanner sc=new Scanner(System.in);
        // char c = (char) br.read();
        // if (Character.isLowerCase(c)) {
        // System.out.println(Character.toUpperCase(c));
        // } else if (Character.isUpperCase(c)) {
        // System.out.println(Character.toLowerCase(c));
        // }

        // Map<Character,String>map=new
        // HashMap<>(){{put('o',"orange");{put('b',"blue");}{put('g',"Green");}{put('w',"white");}};
        // char key = (char) br.read();
        // switch (key) {
        // case 'b':
        // System.out.println("Blue");
        // break;
        // case 'c':
        // System.out.println("Cyan");
        // break;
        // case 'w':
        // System.out.println("White");
        // break;
        // default:
        // System.out.println("Invalid Choice For Color");
        // break;
        // }

        // int n = br.read();

        // for (int j = 10; j < 100; j++) {
        // boolean flag = true;
        // for (int i = 2; i <= Math.sqrt(n); i++) {
        // if (j % i == 0) {
        // flag = false;
        // break;
        // }
        // }
        // if (!flag) {
        // System.out.println(j);
        // }
        // }
        // if (n <= 1) {
        // System.out.println("Not a Prime");
        // }
        // boolean flag = true;
        // for (int i = 2; i <= Math.sqrt(n); i++) {
        // if (n % i == 0) {
        // flag = false;
        // }
        // }
        // if (flag) {
        // System.out.println("Yes It is a Prime Number");
        // } else {
        // System.out.println("Not a Prime");
        // }

        // int number = Integer.parseInt(br.readLine());
        // // // System.out.println(number % 10);
        // // int sum = 0;
        // // while (number > 0) {
        // // sum += number % 10;
        // // // System.out.println(r);
        // // // sum += r;
        // // number /= 10;
        // // }
        // // System.out.println(sum);

        // int t = number;
        // int num = 0;
        // while (t > 0) {
        // int r = t % 10;
        // num = num * 10 + r;
        // t /= 10;
        // }
        // System.out.println(num);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // for Spaces
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            // for stars
            for (int k = 1; k < i + 1; k++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            // for spaces
            for (int j = 1; j < i + 1; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            // for stars
            for (int j = n - 1 - i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}