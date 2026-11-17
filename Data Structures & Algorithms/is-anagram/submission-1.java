class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] sWord = s.toLowerCase().toCharArray();
        char[] tWord = t.toLowerCase().toCharArray();
        Arrays.sort(sWord);
        Arrays.sort(tWord);

        boolean isSame= Arrays.equals(sWord ,tWord);

        return isSame;
    }
}
