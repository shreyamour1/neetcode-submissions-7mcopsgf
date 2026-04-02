class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String s: strs) {
            for (char c: s.toCharArray()) {
                builder.append(c);
            }
            builder.append('😊');
        }
        return builder.toString(); 

    }

    public List<String> decode(String str) {

         List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (char c: str.toCharArray()) {
            if (c == '😊') {
                result.add(builder.toString());
                builder.setLength(0);
            }
            else {
                builder.append(c);
            }
        }
        return result;

    }
}
