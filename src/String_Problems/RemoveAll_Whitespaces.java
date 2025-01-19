package String_Problems;

public class RemoveAll_Whitespaces {

    public static void main(String[] args) {
        String s="Vaibhav Turale I am    JDCOEM";

        String str= s.replaceAll("\\s", "");
        System.out.println(str);


//        ORRRR
        String[] words= s.split(" ");
        for (String word: words){
            System.out.print(word);
        }
    }
}
