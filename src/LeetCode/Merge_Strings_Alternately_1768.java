package LeetCode;

public class Merge_Strings_Alternately_1768 {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqz";
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        var sb = new StringBuilder();
        int i;
        int minSize = Math.min(word1.length(), word2.length());

        for (i = 0; i < minSize; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (sb.length() < word1.length() + word2.length()){
            String remainWord;
            if(word2.length() > word1.length()) { remainWord = word2; }
            else { remainWord = word1; }
            for (int j = i; j < remainWord.length(); j++) {
                sb.append(remainWord.charAt(j));
            }
        }
        return sb.toString();
    }
}
