package ua.iaroslav.square.utilits;

import ua.iaroslav.square.localization.LocalizationRu;

/**
 * Created by Iaroslav on 24.01.2016.
 * подготовка строки для записи в файл
 */
public class StringForSavePrepare {

    public static String make(String array, String spiral, String snake){
        String result = "";
        result = result + LocalizationRu.ARRAY + "\n";
        result = result + array + "\n";
        result = result + LocalizationRu.SPIRAL + "\n";
        result = result + spiral + "\n";
        result = result + LocalizationRu.SNAKE + "\n";
        result = result + snake;

        return result;
    }
}
