import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueensPuzzle queensPuzzle = null;

        int i[][] = {
                {2,45, 6},
                {45,7,87}
        };
        System.out.println(Arrays.toString(i[0]));
        System.out.print("What's the grid dimension: ");
        int n = scanner.nextInt();

        if (n <= 3) System.out.println("No solutions for a grid of " + n + ".");
        else {
            queensPuzzle = new QueensPuzzle(n);
        }

        System.out.println(queensPuzzle);
    }
}
