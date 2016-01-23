package ua.iaroslav.square.program_logic;

import ua.iaroslav.square.localization.LocalizationRu;

/**
 * Created by Iaroslav on 23.01.2016.
 * В этом классе происходит проход змейкой по базовому массиву
 */
public class GenerationSnake {

    private int[][] baseArray;
    private String arrayInSnake;

    public GenerationSnake (int[][] baseArray){
        this.baseArray = baseArray;
    }

    public String getArrayInSnake() {
        return arrayInSnake;
    }

    public String makeSnake(){

        int length = baseArray.length;
        arrayInSnake = "";

        for (int x = (length -1); x >= 0; x--){
            if (((length - 1) - x)%2 == 0){
                for (int y = (length - 1); y >= 0; y--){
                    if (x == 0 && y == 0){
                        arrayInSnake = arrayInSnake + Integer.toString(baseArray[x][y]);
                    } else {
                        arrayInSnake = arrayInSnake + Integer.toString(baseArray[x][y]) + LocalizationRu.DELIMITERSPACE;
                    }
                }
            } else {
                for (int y = 0; y <= (length - 1); y++){
                    if (x == 0 && y == (length - 1)){
                        arrayInSnake = arrayInSnake + Integer.toString(baseArray[x][y]);
                    } else {
                        arrayInSnake = arrayInSnake + Integer.toString(baseArray[x][y]) + LocalizationRu.DELIMITERSPACE;
                    }
                }
            }
        }
        return arrayInSnake;
    }
}
