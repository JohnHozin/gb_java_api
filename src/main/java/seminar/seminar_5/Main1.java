package seminar.seminar_5;

import java.util.HashMap;

/**
 * Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
 * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
 * повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
 * (Например, add - egg изоморфны) буква может не меняться, а остаться такой же. (Например, note - code)
 */

public class Main1 {
    public static void main(String[] args) {
        String s1 = "qweQwe ";
        String s2 = "asda sd";
        System.out.println(isIsomorphism(s1, s2));

    }

    private static boolean isIsomorphism(String string, String string1){
        string = string.replace(" ","");
        string1 = string1.replace(" ","");
        if (string.length() != string1.length()){
            return false;
        }
        string = string.toLowerCase();
        string1 = string1.toLowerCase();

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i))){
                if(!map.get(string.charAt(i)).equals(string1.charAt(i))){
                    return false;
                }
            } else {
                map.putIfAbsent(string.charAt(i), string1.charAt(i));
            }
        }
        System.out.println(map);
        return true;
    }
}
