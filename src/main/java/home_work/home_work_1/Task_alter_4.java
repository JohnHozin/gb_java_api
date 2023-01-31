package home_work.home_work_1;

import java.util.ArrayList;

public class Task_alter_4 {
    public static void main(String[] args) {
        String equation = "?2??9 + ???50 = 6???9";

        String firstNumber = equation.split("\\+")[0].replace(" ", "");
        String secondNumber = equation.split("\\+")[1].split("=")[0].replace(" ", "");
        String resultNumber = equation.split("\\+")[1].split("=")[1].replace(" ", "");

        ArrayList<String> firstArr = new ArrayList<>();
        firstArr = workWithArr(firstArr, firstNumber);
//        System.out.println(firstArr);

        ArrayList<String> secondArr = new ArrayList<>();
        secondArr = workWithArr(secondArr, secondNumber);
//        System.out.println(secondArr);

        ArrayList<String> resultArr = new ArrayList<>();
        resultArr = workWithArr(resultArr, resultNumber);
//        System.out.println(resultArr);

        int chet = 0;
        for (String i : firstArr) {
            for (String j : secondArr) {
                for (String k : resultArr) {
                    if (Integer.parseInt(i) + Integer.parseInt(j) == Integer.parseInt(k)) {
                        System.out.println(i + " + " + j + " = " + k);
                        chet++;
                    }
                }
            }
        }
        if (chet==0){
            System.out.println("Решений нет!");
        } else {
            System.out.println("Найдено " + chet + " решений!");
        }
    }

    static int containSymbol(String number){
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '?'){
                count++;
            }
        }
        return count;
    }

    static ArrayList<String> replaceArr(ArrayList<String> nums){
        ArrayList<String> new_nums = new ArrayList<>();
        for (String name: nums) {
            for (int j = 0; j < 10; j++) {
                new_nums.add(name.replaceFirst("\\?", String.valueOf(j)));
            }
        }
        return new_nums;
    }

    static ArrayList<String> workWithArr (ArrayList<String> nums, String number){
        nums.add(number);
        if (number.contains("?")) {
            int count = containSymbol(number);
            for (int i = 0; i < count; i++) {
                nums = replaceArr(nums);
            }
        }
        return nums;
    }
}
