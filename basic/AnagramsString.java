package basic;

public class AnagramsString {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        int[] charCounts = new int[256];
        
        // Single loop to update frequencies
        for (int i = 0; i < s1.length(); i++) {
            charCounts[s1.charAt(i)]++;
            charCounts[s2.charAt(i)]--;
        }
        
        // Check if all counts are zero
        for (int count : charCounts) {
            if (count != 0) return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2)); // Output: true
    }
}

