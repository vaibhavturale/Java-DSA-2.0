package String_Problems;

public class Longest_Word_From_Sentence {

    public static void main(String[] args) {
        String str="I am aaaaaaaaaaaaaaaaa Vaibhav Turale from Chandrapur";
        String s="hii Nikhil8053 Rindhe";
        findLongestWord(s);
    }

    static void findLongestWord(String s){
        String sentence=s.toLowerCase();

        String[] words=sentence.split(" ");
        String longestWord="";

        for (String word: words){
            if (word.length() > longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println("Longest word: " + longestWord +" , Length is: "+longestWord.length());
    }
}
