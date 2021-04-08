import java.util.*;


public class Array2 {
    MainProg main1 = new MainProg();
    Scanner in = new Scanner(System.in);
    private String [][] newArray;
    private int row;
    private int column;


    public Array2(int row, int column, String[][] newArray) {
        this.row = row;
        this.column = column;
        this.newArray = newArray;
    }

    public void fillArray(){
        for(int i = 0; i < newArray.length;  i++){
            for(int j =  0; j < newArray.length; j++){
                newArray[i][j] = "";
            }
        }
    }

    public void getElement() {
        Scanner in = new Scanner(System.in);
        int userRow;
        int userCol;
        //get row for the element user wants
        do {
            System.out.println("What row is the element you would like to get in? (Must be under " + row + ")");
            userRow = in.nextInt();
            if (userRow > row) {
                System.out.println("Your number must be less than " + row);
            }
        }while(userRow > row);
        //get column for the element the user wants
        do {
            System.out.println("What column is the element you like to get in? (Must be under " + column + ")");
            userCol = in.nextInt();
            if (userCol > column) {
                System.out.println("Your number must be less than " + column);
            }
        }while(userCol > column);
        //print out the row/column the user entered for the element they want
        System.out.println("You have entered: " + "\n" +
                "Row " + userRow + "\n" +
                "Column " + userCol);
        //get the element the user wants
        String getElement = newArray[userRow-1][userCol-1];
        System.out.println(getElement);
    }

    public void setElement() {
        int userRow;
        int userCol;
        //get row for element to set from user
        do {
            System.out.println("What row would you like your element in? (Must be under " + row + ")");
            userRow = in.nextInt();
            if (userRow > row) {
                System.out.println("Your number must be less than " + row);
            }
        }while(userRow > row);
        System.out.println("What column would you like your element in? (Must be under " + column + ")");
        //get column for element to set from user
        do {
            userCol = in.nextInt();
            if (userCol > column) {
                System.out.println("Your number must be less than " + column);
            }
        }while(userCol > column);
        //get char from user they want to set
        System.out.println("What character would you like the element to be?");
        String userChar = in.next();
        //print out the new row, column, and char that user wants
        System.out.println("You have entered: " + "\n" +
                "Row " + userRow + "\n" +
                "Column " + userCol + "\n" +
                "Char to be entered: " + userChar);
        newArray[userRow][userCol] = String.valueOf(userChar);
    }

    public void clearElement() {
        Scanner in = new Scanner(System.in);
        int userRow;
        int userCol;
        //get element row to remove from user
        do{
            System.out.println("What row is the element you would like empty? (Must be under " + row + ")");
            userRow = in.nextInt();
            if (userRow > row) {
                System.out.println("Your number must be less than " + row);
            }
        }while(userRow > row);
        //get element column to remove from user
        do {
            System.out.println("What column is the element you like to empty? (Must be under " + column + ")");
            userCol = in.nextInt();
            if (userCol > column) {
                System.out.println("Your number must be less than " + column);
            }
        }while(userCol > column);
        System.out.println("You have entered: " + "\n" +
                "Row " + userRow + "\n" +
                "Column " + userCol);
        newArray[userRow][userCol] = String.valueOf("");

    }

    public void printMatrix() {
        Scanner in = new Scanner(System.in);
        //String result = " ";
        System.out.println("The array is: \n");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            //for (String[] row: newArray)
            //    Arrays.fill(row, " ");
            System.out.println("\n");
        }
    }

    public void quitProgram() {
        System.out.println("The system will now exit! BYE!!!");
        System.exit(0);
    }
}