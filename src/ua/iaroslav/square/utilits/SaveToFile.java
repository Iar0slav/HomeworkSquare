package ua.iaroslav.square.utilits;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Iaroslav on 24.01.2016.
 * класс для сохранения результатов
 */
public class SaveToFile {

    public static void write(String fileName, String text){

        File file = new File(fileName);                                 // определяем файл

        try {
            if (!file.exists()){
                file.createNewFile();                                   // если файла нету, создаем
            }

            PrintWriter out = new PrintWriter(file.getAbsoluteFile());  // обеспечивает возможность записи в файл

            try {
                out.print(text);                                        // пишем текст
            } finally {
                out.close();                                            // закрываем файл
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
