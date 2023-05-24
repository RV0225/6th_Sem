
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
        String gender = args[0];
        int age = Integer.valueOf(args[1]);
        if (gender.equals("Female") && age > 1 && age < 57) {
            System.out.println("8.2%");
        }

    }
}
