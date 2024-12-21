package String_Problems;
//import java.lang.*;
public class PrintVowels {

    public static void main(String[] args) {
        String str = "abgsgvennjibnbo";

        StringBuilder vowels = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels.append(ch); // Append the vowel to the StringBuilder
            }
        }
        System.out.println(vowels);
    }
}
