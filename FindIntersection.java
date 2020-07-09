import java.util.*; 
import java.io.*;
import java.util.stream.Stream;

class FindIntersection {

    public static String findIntersection(String[] strArr) {
        String[] array1 = strArr[0].split(",");
        String[] array2 = strArr[1].split(",");

        StringBuilder sb = new StringBuilder();
        Stream.of(array1).forEach(s -> {
            Stream.of(array2).forEach(a -> {
                if (a.equals(s)) {
                    sb.append(s.trim()).append(",");
                }
            });
        });
   
        return sb.toString().substring(0, sb.length()-1);
    }


    public static void main (String[] args) {
//		Scanner s = new Scanner(System.in);
        args = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.println(findIntersection(args));
    }

}