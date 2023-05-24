
public class Module_1 {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("No Command Line Argument");
        } else {
            String argsnew = String.join(" Technologies ", args);
            System.out.println(argsnew);
        }
        System.out.println("Hello");
        int a = 56;
        int b = 7;
        if (a % 10 == b % 10) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
