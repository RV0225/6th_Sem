
public class Permut {
    public static void main(String args[]) {
        String name = "010101";
        String B = generateBString(name);
        System.out.println(B);
        System.out.println(numberTimes(name, B));
    }

    private static String generateBString(String name) {
        int max = 0;
        String ans = "";
        for (int i = 0; i < name.length(); i++) {
            String curr = name.substring(1);
            String first = name.substring(0, 1);
            name = curr + first;
            // System.out.println(name);
            int value = Integer.parseInt(name, 2);
            if (max < value) {
                max = Math.max(max, value);
                ans = name;
            }
            // System.out.println(name);
        }
        return ans;
    }

    private static int numberTimes(String A, String B) {
        int k = 2, sum = 0, i = 1;
        while (k > 0) {
            i++;
            String curr = A.substring(1);
            String first = A.substring(0, 1);
            A = curr + first;
            if (A.equals(B)) {
                sum += i;
                // System.out.println(i);
                k--;
                // if(first==)

            }
        }
        return sum + (2 / 2);
    }
}
