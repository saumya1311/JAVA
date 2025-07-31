class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stg= new HashMap<>();

        //int arr[]=new int[26];
        for(String s: strs ){
            int arr[]=new int[26];
            for (char c:s.toCharArray()){
                arr[c-'a']++;

            }
            String key = Arrays.toString(arr);
            stg.putIfAbsent(key, new ArrayList<>());
            stg.get(key).add(s);
        }
        return new ArrayList<>(stg.values());
    }
}