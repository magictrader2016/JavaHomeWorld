import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("ENTER FIRST PHRASE: ");
        String first = in.nextLine().toUpperCase();


        System.out.print("ENTER SECOND PHRASE: ");
        String second = in.nextLine().toUpperCase();

        String result = isAnagram(first, second);
        System.out.println(result);
    }

    private static String isAnagram(String first, String second) {
        if (first == null || second == null || first.equals("") || second.equals("") || !first.matches("[A-Za-z,. ]+")
                || !second.matches("[A-Za-z,. ]+")) {
            return "NO ANAGRAM";
        }
        String answer = "";

        String st = first.replaceAll("[,. ]+", "");
        String nd = second.replaceAll("[,. ]+", "");

        if (st.equals("") || nd.equals("")) {
            return "NO ANAGRAM";
        }

        char[] arraySt = st.toCharArray();
        char[] arrayNd = nd.toCharArray();
        Arrays.sort(arraySt);
        Arrays.sort(arrayNd);

        if (Arrays.equals(arraySt, arrayNd)) {
            answer = "ANAGRAM";
        } else {
            answer = "NO ANAGRAM";
        }
        return answer;
    }

}