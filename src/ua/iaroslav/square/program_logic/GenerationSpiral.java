package ua.iaroslav.square.program_logic;

/**
 * Created by Iaroslav on 22.01.2016.
 * В этом классе происходит проход по спирали по базовому массиву
 */
public class GenerationSpiral {

    private int[][] baseArray;
    private String arrayInLine;

    public GenerationSpiral(int[][] baseArray){
        this.baseArray = baseArray;
    }

    public String makeSpiral(){

        int length = baseArray.length;
        int entry = Math.round((float)length/2);
        arrayInLine = "";

        for (int step = 1; step <= entry; step++){
            if((float)length%2 != 0 && step == entry){
                arrayInLine = arrayInLine + Integer.toString(baseArray[step - 1][step - 1]);
            } else {
                //верхний сектор
                for (int i = ((length - 1) - (length - step)); i < (length - step); i++) {
                    arrayInLine = arrayInLine + Integer.toString(baseArray[step - 1][i]) + ", ";
                }
                //правый сектор
                for (int i = ((length - 1) - (length - step)); i < (length - step); i++) {
                    arrayInLine = arrayInLine + Integer.toString(baseArray[i][length - step]) + ", ";
                }
                //нижний сектор
                for (int i = (length - step); i > ((length - 1) - (length - step)); i--){
                    arrayInLine = arrayInLine + Integer.toString(baseArray[length - step][i]) + ", ";
                }
                //левый сектор
                for (int i = (length - step); i > ((length - 1) - (length - step)); i--){
                    if (step == entry && i == step){
                        arrayInLine = arrayInLine + Integer.toString(baseArray[i][step - 1]);
                    } else {
                        arrayInLine = arrayInLine + Integer.toString(baseArray[i][step - 1]) + ", ";
                    }
                }

            }
        }

        return arrayInLine;
    }


}
