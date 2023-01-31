package seminar.seminar_2;

public class Main {
    public static void main(String[] args) {
//        task_1();
        task_3("qwertytrewq");


    }

    static void task_1(){
        int n = 15;
        char c1 = 'q';
        char c2 = 'W';

        StringBuilder new_line = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                new_line.append(c1);
            } else {
                new_line.append(c2);
            }
        }
        System.out.println(new_line);

//        String c1 = "q";
//        String c2 = "W";
//
//        String line = "";
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                line += c1;
//            } else {
//                line += c2;
//            }
//        }
//        System.out.println(line);
    }

    static boolean task_3(String line){
        for (int i = 0; i < line.length()/2; i++) {
            if (line.charAt(i) != line.charAt(line.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}
