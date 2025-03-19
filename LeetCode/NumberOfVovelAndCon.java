public class NumberOfVovelAndCon {
    public static void main(String[] args) {
        String word = "ieaouqqieaouqq";
        int k = 1;  
        System.out.println(countOfSubstrings(word, k));
    }
    public static long countOfSubstrings(String word, int k) {
        long count = 0;
        int n = word.length();
        
        // Array to store count of substrings with difference i at each index
        // diffCount[i][j] stores count of substrings ending at i with difference j
        int[][] diffCount = new int[n][2*n + 1];
        
        int vowels = 0;
        int consonants = 0;
        
        // Process each character and maintain running difference
        for (int i = 0; i < n; i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            
            // Update vowels and consonants count
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
            
            // Current difference between vowels and consonants
            int diff = vowels - consonants;
            
            // Add 1 for the current substring ending at i
            diffCount[i][diff + n]++;
            
            // Add counts from previous position
            if (i > 0) {
                for (int j = 0; j < 2*n + 1; j++) {
                    diffCount[i][j] += diffCount[i-1][j];
                }
            }
            
            // Add to result if difference equals k or -k
            count += diffCount[i][k + n];
            if (k != 0) {
                count += diffCount[i][-k + n];
            }
        }
        
        return count;
    }
}
