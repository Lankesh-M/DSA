class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        String a = s.substring(0, mid);
        String b = s.substring(mid, s.length());

        int av = 0;
        int bv = 0;
        for (int i = 0; i < mid; i++) {
            if (is_vowel(a.charAt(i)))
                av++;
            if (is_vowel(b.charAt(i)))
                bv++;
        }
        return av == bv ? true : false;
    }

    public boolean is_vowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
