package ua.iaroslav.square.program_logic;

import ua.iaroslav.square.localization.LocalizationRu;
import ua.iaroslav.square.utilits.CheckForInt;

import java.util.Scanner;

/**
 * Created by Iaroslav Tiurmenko on 19.01.2016.
 * Через этот класс ведется консольное общение с пользователем
 */
public class Communication {

    private int programValue;

    public int getProgramValue() {
        return programValue;
    }

    // метод для получения числа от пользователя
    public void getValue (){
        boolean addValue         = true;

        // Приветствие
        System.out.println(LocalizationRu.WELCOME);

        // цикл обработки ввода числа
        do{
            // приглашение на ввод числа
            System.out.println(LocalizationRu.INPUT);
            // получаем строку и проверяем числовая ли она
            Scanner scanValue = new Scanner(System.in);
            String isValue = scanValue.nextLine();
            boolean isInt = CheckForInt.isInteger(isValue);
            /*
            проверка на переменную ВЫХОД
            проверка на число
            иначе повторное приглашение на ввод и повтор цикла
            */
            if (isValue.equals(LocalizationRu.EXIT)){
                System.exit(0);
            } else if(isInt){
                try {
                    int temp = Integer.parseInt(isValue);
                    if(temp > 0 && temp < 11){
                        addValue = false;
                        // запоминаем число для дальнейшей работы программы
                        programValue = temp;
                    } else {
                        System.out.println(LocalizationRu.INCORRECT);
                    }
                } catch (NumberFormatException e) {
                    System.out.println(LocalizationRu.INCORRECT);
                }
            } else {
                System.out.println(LocalizationRu.INCORRECT);
            }
        } while(addValue);
    }

    // Печатаем массив-квадрат
    public void printSquareArray(String s){
        System.out.println(LocalizationRu.SQUARE);
        System.out.println(s);
    }

    // Печатаем проход по массиву спиралью
    public void printSpiral(String s){
        System.out.println(LocalizationRu.SPIRAL);
        System.out.println(s);
    }

}
