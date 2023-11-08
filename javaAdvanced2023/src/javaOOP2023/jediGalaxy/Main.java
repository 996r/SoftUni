package workingWithAbstraction.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int[] dimensions = readPositions(scanner.nextLine());
            int roll = dimensions[0];
            int coll = dimensions[1];

            int[][] matrix = new int[roll][coll];

        fillField(roll, coll, matrix);

        String command = scanner.nextLine();
            long sum = 0;
            while (!command.equals("Let the Force be with you"))
            {
                int[] jediPositions = readPositions(command);
                int[] evilPositions = readPositions(scanner.nextLine());
                int rowEvil = evilPositions[0];
                int colEvil = evilPositions[1];

                moveEvil(matrix, rowEvil, colEvil);

                int rowJedi = jediPositions[0];
                int colJedi = jediPositions[1];
int collectStars = getCollectedStars(matrix, sum, rowJedi, colJedi);
sum+= collectStars;

                command = scanner.nextLine();
            }

        System.out.println(sum);


    }

    private static int getCollectedStars(int[][] matrix, long sum, int rowJedi, int colJedi) {
        int countStars = 0;
        while (rowJedi >= 0 && colJedi < matrix[1].length)
        {
            if (rowJedi < matrix.length && colJedi >= 0 && colJedi < matrix[0].length)
            {
                countStars += matrix[rowJedi][colJedi];
            }

            colJedi++;
            rowJedi--;
        }
        return countStars;
    }

    private static void moveEvil(int[][] matrix, int rowEvil, int colEvil) {
        while (rowEvil >= 0 && colEvil >= 0)
        {
            if (rowEvil >= 0 && rowEvil < matrix.length && colEvil >= 0 && colEvil < matrix[0].length)
            {
                matrix[rowEvil] [colEvil] = 0;
            }
            rowEvil--;
            colEvil--;
        }
    }

    private static int[] readPositions(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillField(int roll, int coll, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < roll; i++)
        {
            for (int j = 0; j < coll; j++)
            {
                matrix[i][j] = value++;
            }
        }
    }
}
