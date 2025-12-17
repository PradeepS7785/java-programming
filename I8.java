import java.util.Scanner;

public class I8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(Integer.toOctalString(n));
        }
    }
}
