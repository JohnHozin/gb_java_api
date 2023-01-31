package home_work.home_work_3;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        int[] arr = new int[30];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
//        writeInFail(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void swap(int[] items, int left, int right)
    {
        if (left != right)
        {
            int temp = items[left];
            items[left] = items[right];
            items[right] = temp;
        }
    }

    private static void sort(int[] items)
    {
        boolean swapped;
        do
        {
            swapped = false;
            for (int i = 1; i < items.length; i++) {
                if (items[i - 1]> items[i])
                {
                    swap(items, i - 1, i);
                    swapped = true;
                    System.out.println(Arrays.toString(items));
                    writeInFail(items);
                }
            }
        } while (swapped != false);
    }

    private static void writeInFail(int[] arr) {
//        if (arr.()) {
//            System.out.println("Нет данных для записи!");
//            return;
//        }

//        try (PrintWriter pw = new PrintWriter("src/main/resources/lib/test.txt")) {
//            pw.println(Arrays.toString(arr));
//
////            pw.print(Arrays.toString(arr));
////            System.out.println("Данные успешно записаны!");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        try (FileWriter pw = new FileWriter("src/main/resources/lib/log.txt",true)) {
            pw.append(Arrays.toString(arr) + "%n");

//            pw.print(Arrays.toString(arr));
//            System.out.println("Данные успешно записаны!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
