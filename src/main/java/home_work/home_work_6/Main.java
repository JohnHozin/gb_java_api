package home_work.home_work_6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * Создать множество ноутбуков (ArrayList).
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. Например, спросить у пользователя
 * минимальный размер оперативной памяти или конкретный цвет. Выводить только те ноутбуки, что соответствуют условию
 * <p>
 * <p>
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
 * Критерии фильтрации можно хранить в Map. Например:  	“Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

public class Main {
    public static void main(String[] args) {
        NoteBook noteBook1 = new NoteBook("noteBook1", 4, "windows", "black", 512, 150000);
        NoteBook noteBook2 = new NoteBook("noteBook2", 3, "windows", "yellow", 1024, 160000);
        NoteBook noteBook3 = new NoteBook("noteBook3", 5, "linux", "white", 1024, 170000);
        NoteBook noteBook4 = new NoteBook("noteBook4", 4, "linux", "black", 1024, 180000);
        NoteBook noteBook5 = new NoteBook("noteBook5", 5, "windows", "yellow", 2048, 190000);
        NoteBook noteBook6 = new NoteBook("noteBook6", 6, "windows", "black", 512, 140000);
        NoteBook noteBook7 = new NoteBook("noteBook7", 8, "linux", "red", 1024, 135000);
        NoteBook noteBook8 = new NoteBook("noteBook8", 7, "linux", "black", 512, 145000);
        NoteBook noteBook9 = new NoteBook("noteBook9", 3, "windows", "white", 2048, 155000);
        NoteBook noteBook10 = new NoteBook("noteBook10", 6, "windows", "red", 2048, 165000);
        NoteBook noteBook11 = new NoteBook("noteBook11", 5, "windows", "white", 2048, 175000);


//        List<NoteBook> noteBooks = List.of(noteBook1, noteBook2, noteBook3, noteBook4, noteBook5, noteBook6, noteBook7, noteBook8, noteBook9, noteBook10, noteBook11);
        List<NoteBook> noteBooks = new ArrayList<>();
        noteBooks.add(noteBook1);
        noteBooks.add(noteBook2);
        noteBooks.add(noteBook3);
        noteBooks.add(noteBook4);
        noteBooks.add(noteBook5);
        noteBooks.add(noteBook6);
        noteBooks.add(noteBook7);
        noteBooks.add(noteBook8);
        noteBooks.add(noteBook9);
        noteBooks.add(noteBook10);
        noteBooks.add(noteBook11);

        run(noteBooks);
    }

    private static void run(List<NoteBook> noteBooks) {
        String tilda = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        String firstText = "  1. Распечатать все ноутбуки\n  2. Выбрать по параметрам\n  3. Выход";
        String secondText = "  1. Указать минимальную RAM\n  2. Выбрать OS\n  3. Выбрать цвет" +
                "\n  4. Указать минимальный размер HD\n  5. Указать минимальную цену" +
                "\n  6. Распечатать согласно требованиям\n  7. Сбросить\n  8. Выход";
        String choose = "\nВыберете вариант: ";
        String input = "Введите значение: ";

        while (true) {
            switch (inputNumber(tilda + firstText + choose)) {
                case (1):
                    printList(noteBooks);
                    break;
                case (2):
                    Map<String, String> map = new HashMap<>();
                    while (true) {
                        switch (inputNumber(tilda + secondText + choose)) {
                            case (1):
                                map.put("RAM", String.valueOf(inputNumber(input)));
                                break;
                            case (2):
                                map.put("OS", inputText(input));
                                break;
                            case (3):
                                map.put("color", inputText(input));
                                break;
                            case (4):
                                map.put("HD", String.valueOf(inputNumber(input)));
                                break;
                            case (5):
                                map.put("price", String.valueOf(inputNumber(input)));
                                break;
                            case (6):
                                List<NoteBook> noteBooksTemp = new ArrayList<>();
                                for (NoteBook noteBook : noteBooks) {
                                    boolean b = true;
                                    if (map.containsKey("RAM")) {
                                        b = noteBook.getRandomAccessMemory() >= Integer.parseInt(map.get("RAM"));
                                    }
                                    if (map.containsKey("OS")) {
                                        b = b && noteBook.getOperationSystem().equalsIgnoreCase(map.get("OS"));
                                    }
                                    if (map.containsKey("color")) {
                                        b = b && noteBook.getColor().equalsIgnoreCase(map.get("color"));
                                    }
                                    if (map.containsKey("HD")) {
                                        b = b && noteBook.getHardDiskVolume() >= Integer.parseInt(map.get("HD"));
                                    }
                                    if (map.containsKey("price")) {
                                        b = b && noteBook.getPrice() >= Integer.parseInt(map.get("price"));
                                    }
                                    if (b) {
                                        noteBooksTemp.add(noteBook);
                                    }
                                }

//                                System.out.println(map);
                                printList(noteBooksTemp);
                                break;
                            case (7):
                                map.clear();
                                break;
                            case (8):
                                return;
                            default:
                                System.out.println("Ошибка ввода!");
                                break;
                        }
                    }
                case (3):
                    return;
                default:
                    System.out.println("Ошибка ввода!");
                    break;
            }
        }
    }

    private static String inputText(String firstText) {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println(firstText);
        try {
            text = scanner.nextLine();
        } catch (Exception e) {
            logger(e);
            System.out.println("Ошибка ввода!!");
        }
        return text;
    }

    private static Integer inputNumber(String firstText) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(firstText);
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            logger(e);
            System.out.print("Введено не число! ");
        }
        return number;
    }

    private static void printList(List<NoteBook> note) {
        for (NoteBook noteBook : note) {
            System.out.println(noteBook);
        }
    }

    private static void logger(Exception e) {
        final String location = "src/main/resources/lib/log_hw6.txt";
        DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try (PrintWriter pw = new PrintWriter(new FileWriter(location, true))) {
            String time = dateF.format(Calendar.getInstance().getTime());
            pw.print(time + "   ");
            e.printStackTrace(pw);
            pw.print("\n");
        } catch (IOException er) {
            er.printStackTrace();
        }
    }
}
