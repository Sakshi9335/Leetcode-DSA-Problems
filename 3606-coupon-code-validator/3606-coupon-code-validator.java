class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
         HashMap<String, Integer> map = new HashMap<>();
        map.put("electronics", 0);
        map.put("grocery", 1);
        map.put("pharmacy", 2);
        map.put("restaurant", 3);

        List<String[]> lst = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (!isActive[i]) 
            continue;
            if (!map.containsKey(businessLine[i])) 
            continue;
            if (code[i].isEmpty()) 
            continue;
            if (!code[i].matches("[a-zA-Z0-9_]+")) 
            continue;

            lst.add(new String[]{businessLine[i], code[i]});
        }

        Collections.sort(lst, (a, b) -> {
            int cmp = map.get(a[0]) - map.get(b[0]);
            if (cmp != 0) return cmp;
            return a[1].compareTo(b[1]);
        });

        List<String> res = new ArrayList<>();
        for (String[] c : lst) {
            res.add(c[1]);
        }

        return res;
    }
}