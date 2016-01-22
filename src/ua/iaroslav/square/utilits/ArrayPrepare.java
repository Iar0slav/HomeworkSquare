package ua.iaroslav.square.utilits;

import ua.iaroslav.square.localization.LocalizationRu;

/**
 * Created by Iaroslav on 19.01.2016.
 * Подготовка и формирование удобочитаемого массива для вывода в консоль
 */
public class ArrayPrepare {

    private String s ="";

    // преобразуем полученый числовой массив в читабельную форму и возвращаем строку для вывода в консоль
    public String prepareForPrint(int[][] array){

        // формируем строковый массив из числового и добавляем элементы форматирования
        String[][] stringArray = new String[array.length][array[0].length];
        for (int a = 0; a < array.length; a++){
            for (int b  = 0; b < array[0].length; b++){
                int temp = array[a][b];

                if (temp >= 0 && temp < 10){
                    stringArray[a][b] = "   " + Integer.toString(temp);
                } else if (temp > 9 && temp < 100){
                    stringArray[a][b] = "  " + Integer.toString(temp);
                } else if (temp > -10 && temp < 0){
                    stringArray[a][b] = "  " + Integer.toString(temp);
                } else if (temp == 100){
                    stringArray[a][b] = " " + Integer.toString(temp);
                } else if (temp > -100 && temp < -9){
                    stringArray[a][b] = " " + Integer.toString(temp);
                } else if (temp == -100){
                    stringArray[a][b] = Integer.toString(temp);
                } else {
                    stringArray[a][b] = Integer.toString(temp);
                }

            }
        }

        // формируем строку из массива строк и добавляем разделители
        for (int x = 0; x < stringArray.length; x++ ){
            for (int y = 0; y < stringArray[0].length; y++){
                if (x == stringArray[0].length - 1 && y == stringArray[0].length - 1) {
                    s = s + stringArray[x][y];
                }else if (y == stringArray[0].length - 1){
                    s = s + stringArray[x][y] + "\n";
                }else {
                    s = s + stringArray[x][y] + LocalizationRu.DELIMITER;
                }
            }
        }

        return s;
    }
}
