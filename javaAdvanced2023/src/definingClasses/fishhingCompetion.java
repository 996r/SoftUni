package definingClasses;

import java.util.Scanner;

public class fishhingCompetion {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = Integer.parseInt(keyboard.nextLine());
        int fishAmount = 0;
        boolean whirpool = false;
        int whirRow = 0;
        int whirCol = 0;
        char[][] matrix = new char[n][n];
        int row = 0;
        int col = 0;
        for (int i = 0; i < n ; i++) {
            String []input  = keyboard.nextLine().split("");
            for (int j = 0; j < n ; j++) {
                matrix[i][j] = (char)(input[j].charAt(0));
                if(input[j].equals("S")){
                    row = i;
                    col = j;
                    matrix[i][j] = '-';
                }
            }
        }
        String input = keyboard.nextLine();
        while(!input.equals("collect the nets") && whirpool == false){

            switch (input){
                case "up":
                    row--;
                    if(isaBoolean(row, n, col)) {
                        if(Character.isDigit(matrix[row][col])){
                            fishAmount += Integer.parseInt(String.valueOf(matrix[row][col]));
                            matrix[row][col] = '-';
                        } else if (matrix[row][col] == 'W') {
                            whirpool = true;
                            whirRow = row;
                            whirCol = col;
                            break;
                        }
//---------------------------------------------------
                    } else {
                        row = n - 1;
                        if(Character.isDigit(matrix[row][col])){
                            fishAmount += Integer.parseInt(String.valueOf(matrix[row][col]));
                            matrix[row][col] = '-';
                        } else if (matrix[row][col] == 'W') {
                            whirpool = true;
                            whirRow = row;
                            whirCol = col;
                            break;
                        }
                    }
                    break;
                case "down":
                    row++;
                    if(isaBoolean(row, n, col)) {
                        if(Character.isDigit(matrix[row][col])){
                            fishAmount += Integer.parseInt(String.valueOf(matrix[row][col]));
                            matrix[row][col] = '-';
                        } else if (matrix[row][col] == 'W') {
                            whirpool = true;
                            whirRow = row;
                            whirCol = col;
                            break;
                        }
//---------------------------------------------------
                    } else {
                        row = 0;
                        if(Character.isDigit(matrix[row][col])){
                            fishAmount += Integer.parseInt(String.valueOf(matrix[row][col]));
                            matrix[row][col] = '-';
                        } else if (matrix[row][col] == 'W') {
                            whirpool = true;
                            whirRow = row;
                            whirCol = col;
                            break;
                        }
                    }
                    break;
                case "left":
                    col--;
                    if(isaBoolean(row, n, col)) {
                        if(Character.isDigit(matrix[row][col])){
                            fishAmount += Integer.parseInt(String.valueOf(matrix[row][col]));
                            matrix[row][col] = '-';
                        } else if (matrix[row][col] == 'W') {
                            whirpool = true;
                            whirRow = row;
                            whirCol = col;
                            break;
                        }
//---------------------------------------------------
                    } else {
                        col = n -1;
                        if(Character.isDigit(matrix[row][col])){
                            fishAmount += Integer.parseInt(String.valueOf(matrix[row][col]));
                            matrix[row][col] = '-';
                        } else if (matrix[row][col] == 'W') {
                            whirpool = true;
                            whirRow = row;
                            whirCol = col;
                            break;
                        }
                    }
                    break;
                case "right":
                    col++;
                    if(isaBoolean(row, n, col)) {
                        if(Character.isDigit(matrix[row][col])){
                            fishAmount += Integer.parseInt(String.valueOf(matrix[row][col]));
                            matrix[row][col] = '-';
                        } else if (matrix[row][col] == 'W') {
                            whirpool = true;
                            whirRow = row;
                            whirCol = col;
                            break;
                        }
//---------------------------------------------------
                    } else {
                        col = 0;
                        if(Character.isDigit(matrix[row][col])){
                            fishAmount += Integer.parseInt(String.valueOf(matrix[row][col]));
                            matrix[row][col] = '-';
                        } else if (matrix[row][col] == 'W') {
                            whirpool = true;
                            whirRow = row;
                            whirCol = col;
                            break;
                        }
                    }
                    break;
            }
            input = keyboard.nextLine();
        }


        if(whirpool == true) {
            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                    " Last coordinates of the ship: [%d,%d]%n",whirRow, whirCol);


        } else if(fishAmount >= 20) {
            matrix[row][col] = 'S';
            System.out.printf("Success! You managed to reach the quota!%n");
            System.out.printf("Amount of fish caught: %d tons.", fishAmount);
            System.out.println();
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        } else {
            matrix[row][col] = 'S';
            System.out.printf("You didn't catch enough fish and didn't reach the quota! " +
                    "You need %d tons of fish more.%n", (20 - fishAmount));
            // System.out.printf("You need %d tons of fish more.%n", (20 - fishAmount));
            System.out.printf("Amount of fish caught: %d tons.",fishAmount);
            System.out.println();
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }

    }

    private static boolean isaBoolean(int row, int n, int col) {
        return row >= 0 && row < n && col >= 0 && col < n;
    }
}


