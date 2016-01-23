package ua.iaroslav.square;

import ua.iaroslav.square.localization.LocalizationRu;
import ua.iaroslav.square.program_logic.Communication;
import ua.iaroslav.square.program_logic.GenerationSnake;
import ua.iaroslav.square.program_logic.GenerationSpiral;
import ua.iaroslav.square.program_logic.GenerationSquare;
import ua.iaroslav.square.utilits.ArrayPrepare;
import ua.iaroslav.square.utilits.SaveToFile;
import ua.iaroslav.square.utilits.StringForSavePrepare;

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
        ArrayPrepare arrayPrepare = new ArrayPrepare();
        chat.printSquareArray(arrayPrepare.prepareForPrint(squareArray.getSquareArray()));

        // формируем строку прохода по массиву спиралью и выводим в консоль
        GenerationSpiral spiral = new GenerationSpiral(squareArray.getSquareArray());
        chat.printSpiral(spiral.makeSpiral());

        // формируем строку прохода по массиву змейкой и выводим в консоль
        GenerationSnake snake = new GenerationSnake(squareArray.getSquareArray());
        chat.printSnake(snake.makeSnake());

        // сохраняем массив и 2 строки в файл, информируем об успешной операции
        SaveToFile.write(LocalizationRu.PATH_TO_SAVE + LocalizationRu.FILENAME + LocalizationRu.FILENAME_EXTENSION,
                StringForSavePrepare.make(arrayPrepare.getStringArray(), spiral.getArrayInLine(), snake.getArrayInSnake()));
        chat.allDone();
    }
}
