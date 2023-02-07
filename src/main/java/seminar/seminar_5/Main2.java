package seminar.seminar_5;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 */
public class Main2 {
    public static void main(String[] args) {
        String s1 = "a+(d*3)";
        String s2 = "[a+(1*3)";
        String s3 = "[6+(3*3)]";
        String s4 = "{a}[+]{(d*3)}";

        System.out.println(isValidBrackets(s1));
        System.out.println(isValidBrackets(s2));
        System.out.println(isValidBrackets(s3));
        System.out.println(isValidBrackets(s4));
    }

    private static boolean isValidBrackets(String input) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put('>', '<');

        Deque<Character> stack = new LinkedList<>();
        for (char c : input.toCharArray()) {
            if (brackets.containsValue(c)) {
                // одна из открывающих скобок
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                // одна из закрывающих скобок
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
// в конце стек должен быть пустым
        return stack.isEmpty();
    }
}
