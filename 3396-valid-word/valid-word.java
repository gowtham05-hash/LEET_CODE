class Solution {
    public boolean isValid(String word) {
                int n = word.length();
        if (n < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch)) return false;

            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }
}
