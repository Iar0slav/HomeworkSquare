package ua.iaroslav.square;

import ua.iaroslav.square.program_logic.Communication;
import ua.iaroslav.square.program_logic.GenerationSquare;
import ua.iaroslav.square.utilits.ArrayPrint;

/**
 * Created by Iaroslav Tiurmenko on 19.01.2016.
 * Класс для запуска приложения
 */
public class RunSquare {

    public static void main(String[] args) {

        //получаем от пользователя число
        Communication chat = new Communication();
        chat.getValue();

        // создаем массив-квадрат
        GenerationSquare squareArray = new GenerationSquare(chat.getProgramValue());
        squareArray.makeArray();

        // формируем массив-квадрат и выводим его в консоль
        ArrayPrint arrayPrint = new ArrayPrint();
        chat.printSquareArray(arrayPrint.printArray(squareArray.getSquareArray()));







    }

}
