import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int r = kb.nextInt();
            System.out.println("The radius of circle:" + 3.14 * (r * r));
        }
    }
}
