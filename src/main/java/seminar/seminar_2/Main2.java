package seminar.seminar_2;

public class Main2 {
    public static int temp = 1;

    public static void main(String[] args) {
        StringBuilder line = new StringBuilder();
        StringBuilder new_line = new StringBuilder();
        line.append("qqqqqwwwweeeqqqwwweeewwwqqqqqqqqeeeeeeedeeeeet");
        System.out.println(line);

        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == line.charAt(i + 1)) {
                temp++;
            } else {
                append_symbol(new_line, line, i);
            }
        }
        append_symbol(new_line, line, line.length() - 1);
        System.out.println(new_line);
    }

    static void append_symbol(StringBuilder new_line, StringBuilder line, int i) {
        if (temp == 1) {
            new_line.append(line.charAt(i));
        } else {
            new_line.append(line.charAt(i) + "" + temp);
            temp = 1;
        }
    }
}




//for (int i = 0; i < line.length()-1; i++) {
//            if (line.charAt(i) == line.charAt(i+1)){
//                temp++;
//                if (i+1 == line.length()-1){
////                    new_line.append(line.charAt(i) + "" + temp);
//                    if (temp==1){
//                        new_line.append(line.charAt(i));
//                    } else{
//                        new_line.append(line.charAt(i) + "" + temp);
//                    }
//                }
//            } else{
////                new_line.append(line.charAt(i) + "" + temp);
////                temp=1;
//                if (temp==1){
//                    new_line.append(line.charAt(i));
//                } else{
//                    new_line.append(line.charAt(i) + "" + temp);
//                    temp=1;
//                }
//
//            }
//
//        }

// 2 variant
//        for (int i = 0; i < line.length()-1; i++) {
//            if (line.charAt(i) == line.charAt(i+1)){
//                temp++;
//            } else{
//                if (temp==1){
//                    new_line.append(line.charAt(i));
//                } else{
//                    new_line.append(line.charAt(i) + "" + temp);
//                    temp=1;
//                }
//            }
//        }
//        if (temp==1){
//            new_line.append(line.charAt(line.length()-1));
//        } else{
//            new_line.append(line.charAt(line.length()-1) + "" + temp);
//        }
//        System.out.println(new_line);
