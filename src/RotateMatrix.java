public class RotateMatrix extends Matrix{
    public RotateMatrix(int row, int column, String[][] newArray) {
        super(row, column, newArray);
        this.row = row;
        this.column = column;
        this.newArray = newArray;
    }

    public void rotateMatrixHorizontal(){
        String[][] rotatedHorizontal = new String[newArray[0].length][newArray.length];
        for (int i = 0; i < newArray[0].length; ++i){
            for (int j = 0; j < newArray.length; ++j){
                rotatedHorizontal [i][j] = newArray[newArray.length - j - 1][i];
            }
        }
    }

    public void rotateMatrixVertical(){
        String[][] rotatedVertical = new String[newArray[0].length][newArray.length];
        for (int i = 0; i < newArray[0].length; ++i){
            for (int j = 0; j < newArray.length; ++j){
                rotatedVertical [i][j] = newArray[j][newArray[0].length - i - 1];
            }
        }
    }

    public void rotateMatrixLeft(){
        String[][] rotatedLeft = new String[newArray[0].length][newArray.length];
        for (int i = 0; i < newArray[0].length; ++i){
            for (int j = 0; j < newArray.length; ++j){
                rotatedLeft [i][j] = newArray[newArray.length - j - 1][i];
            }
        }
    }

    public void rotateMatrixRight(){
        String[][] rotatedRight = new String[newArray[0].length][newArray.length];
        for (int i = 0; i < newArray[0].length; ++i){
            for (int j = 0; j < newArray.length; ++j){
                rotatedRight [i][j] = newArray[newArray.length - j - 1][i];
            }
        }
    }
}
