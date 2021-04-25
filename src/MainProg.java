import java.util.*;

public class MainProg {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many rows do you want for your matrix?  ");
        int row = in.nextInt();

        System.out.print("How many columns do you want for your matrix?  ");
        int column = in.nextInt();
        String[][] newArray = new String[row][column];


        RotateMatrix rotateMatrix = new RotateMatrix(row, column, newArray);
        Matrix twoDArray = new Matrix(row, column, newArray); //calling my class
        twoDArray.fillArray();


        do {
            System.out.println("If you would like to set an, element press S: " + "\n" +
                    "If you would like to set an element, press G" + "\n" +
                    "If you would like to empty an element, press E" + "\n" +
                    "If you would like to print an element, press P" + "\n" +
                    "If you would like to fill the array with a single character, press F" + "\n" +
                    "If you would like to completely empty the array, press C" + "\n" +
                    "If you would like to rotate horizontally press 1" + "\n" +
                    "If you would like to rotate vertically press 2" + "\n" +
                    "If you would like to rotate right press 3" + "\n" +
                    "If you would like to rotate left press 4" + "\n" +
                    "If you would like to quit, press Q");
            String userInput = in.next();


            if(userInput.equalsIgnoreCase("S")) {
                twoDArray.setElement();
            } else if (userInput.equalsIgnoreCase("G")) {
                twoDArray.getElement();
            } else if (userInput.equalsIgnoreCase("E")) {
                twoDArray.clearElement();
            } else if (userInput.equalsIgnoreCase("P")) {
                twoDArray.printMatrix();
                //you will make your own toString here
            } else if (userInput.equalsIgnoreCase("1")){
                rotateMatrix.rotateMatrixHorizontal();
            } else if (userInput.equalsIgnoreCase("2")){
                rotateMatrix.rotateMatrixVertical();
            } else if (userInput.equalsIgnoreCase("3")){
                rotateMatrix.rotateMatrixLeft();
            } else if (userInput.equalsIgnoreCase("4")){
                rotateMatrix.rotateMatrixRight();
            } else if (userInput.equalsIgnoreCase("F")) {
                twoDArray.userFill();
            } else if (userInput.equalsIgnoreCase("C")){
                twoDArray.userEmpty();
            } else if (userInput.equalsIgnoreCase("Q")) {
                //this will quit the program
                twoDArray.quitProgram();
            }
            //break;
        } while (true);

    }
}