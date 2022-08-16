// Complete the isValid function below.
static String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (char c : s.toCharArray()) {            
                int freq = map.getOrDefault(c, 0);    
                int newFreq = freq + 1;
                map.put(c, newFreq);
                max = Math.max(max, newFreq);
        }

        int countMax = 0, count = 0;
        for (int freq : map.values()) {
                min = Math.min(min, freq);
                if (freq == max)
                        countMax++;
        }

        if (max - min > 1 || (max != min && countMax > 1))
                return "NO";
        return "YES";        
}