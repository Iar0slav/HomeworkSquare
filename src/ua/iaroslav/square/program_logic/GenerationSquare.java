package ua.iaroslav.square.program_logic;

/**
 * Created by Iaroslav on 19.01.2016.
 * В даном класе происходит генерация массива [n][n]
 * на основании числа полученного от пользователя
 */
public class GenerationSquare {

    private int programValue;
    private int[][] squareArray;

    public GenerationSquare(int programValue){
        this.programValue = programValue;
    }

    // создаем массив заданого размера и заполняем рандомом в пределах [-100, 100]
    public void makeArray(){
        int[][] array = new int[programValue][programValue];
        for (int x = 0; x < array.length; x++ ){
            for (int y = 0; y < array[0].length; y++){
                array[x][y] = (int)(Math.random()*201) - 100;
            }
        }
        squareArray = array;
    }

    public int[][] getSquareArray() {
        return squareArray;
    }
}
