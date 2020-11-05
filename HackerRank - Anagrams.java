

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length())
            return false;
        if(a.equalsIgnoreCase(b))
            return true;
        
        char[] aa = a.toLowerCase().toCharArray();
        char[] ba = b.toLowerCase().toCharArray();
        java.util.HashMap<Character, Integer> am = new java.util.HashMap();
        java.util.HashMap<Character, Integer> bm = new java.util.HashMap();
        
        for(int i = 0; i < a.length(); i++) {
            addToMap(aa[i], am);
            addToMap(ba[i], bm);
        }
        return am.equals(bm);
    }
    
    static void addToMap(char c, java.util.HashMap<Character, Integer> map) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }


