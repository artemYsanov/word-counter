package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /* Считаем количество символов
        Создаём экземпляр класса FileInputStream, передав объект требуемого файла в качестве параметра его конструктору.
        Считываем содержимое файла в байтовый массив, используя метод read() класса FileInputStream.
        Создаём класс String путем передачи полученного байтового массива в качестве параметра его конструктору.
        Найдём длину строки.
         */
        File file = new File("C:\\Users\\Artem\\IdeaProjects\\word counter\\src\\com\\company\\text input.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];

        fileInputStream.read(byteArray);
        String data = new String(byteArray);
        System.out.println("Символов с пробелами: " + data.length());

        /*  Считаем количество символов без пробелов
        Считываем содержимое файла с помощью метода read() в байтовый массив.()
        В класс String передаём байтовый массив его конструктору.()
         */
        int count2 = 0;
        FileInputStream in = new FileInputStream("C:\\Users\\Artem\\IdeaProjects\\word counter\\src\\com\\company\\text input.txt");
        byte[] array = new byte[(int)in.available()];
        in.read(array);
        String text = new String(array);
        for (char ch : text.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                count2++;
            }
        }
        System.out.println("Символов без пробелов: " + count2);

        /* Считаем количество слов
        Считываем содержимое файла с помощью метода read() в байтовый массив.()
        В класс String передаём байтовый массив его конструктору.()
        С помощью метода split() считываем слова строки в массив.()
        Создаём целочисленную переменную, для расчета количества слов, инициализируем ее 0,
        внутри цикла for для каждого элемента массива строк увеличиваем счетчик.
         */
        int count3 =0;
        File file2 = new File("C:\\Users\\Artem\\IdeaProjects\\word counter\\src\\com\\company\\text input.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytesArray = new byte[(int)file2.length()];
        fis.read(bytesArray);
        String s = new String(bytesArray);
        String [] data2 = s.split(" ");
        for (int i=0; i<data2.length; i++) {
            count3++;
        }
        System.out.println("Количество слов: " + count3);
        String text1 = "Количество слов: " + count3 + ". "+ "Символов без пробелов: " + count2 + ". "+ "Символов с пробелами: " + data.length() + ".";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Artem\\IdeaProjects\\word counter\\src\\com\\company\\output.txt"));
        bufferedWriter.write(text1 );
        bufferedWriter.flush();
    }
}
