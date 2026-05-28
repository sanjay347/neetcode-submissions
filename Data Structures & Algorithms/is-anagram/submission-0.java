class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> SMap = new HashMap<>();
        HashMap<Character, Integer> TMap = new HashMap<>();

        for ( char c : s.toCharArray()) {
            if( SMap.containsKey(c)) {
                SMap.put(c, SMap.get((c) + 1));
            } else {
                SMap.put(c , 1);
            }
        }

        for ( char c : t.toCharArray()) {
            if (TMap.containsKey(c)) {
                TMap.put(c, TMap.get((c) + 1));
            } else {
                TMap.put(c , 1);
            }
        }

        return SMap.equals(TMap);
    }
}
