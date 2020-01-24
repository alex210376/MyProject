package academy.lesson11.file;

import java.io.*;

public class FileStreamDemo {
    public static void main(String[] args) throws IOException {
        //Прочитать файл из 10 имен
        String inPath = "d:/QA-JA-08/Files/женские имена.txt";
        String outPath = "d:/QA-JA-08/Files/женские имена new stream.txt";
        BufferedReader br = new BufferedReader(new FileReader(inPath));
        PrintWriter pw = new PrintWriter(new FileWriter(outPath));

        br.lines()   // возвращает stream
                .limit(20)
                .peek(pw::println)
                .forEach(System.out::println);
        br.close();
        pw.close();


     }
}
