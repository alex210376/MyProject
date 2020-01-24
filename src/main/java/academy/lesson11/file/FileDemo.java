package academy.lesson11.file;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //Прочитать файл из 10 имен
        String inPath = "d:/QA-JA-08/Files/женские имена.txt";
        String outPath = "d:/QA-JA-08/Files/женские имена new.txt";
        BufferedReader br = new BufferedReader(new FileReader(inPath));
        PrintWriter pw = new PrintWriter(new FileWriter(outPath));
        //String name = br.readLine();
        //System.out.println(name);
        //String name2 = br.readLine();
        //System.out.println(name2);

        //читаем все имена до конца файла
        String nextName;
        while((nextName = br.readLine())!=null){
            pw.println(nextName);  // Запишем в другой файл
            System.out.println(nextName);
        }

        br.close();
        pw.close();
    }
}
