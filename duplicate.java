public class duplicate {
    public static void removeDuplicate(String str, StringBuilder newStr, int idx, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDuplicate(str, newStr, idx + 1, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, newStr.append(currChar), idx + 1, map);
        }
    }

    public static void main(String[] args) {
        String str = "rijurakshit";
        removeDuplicate(str, new StringBuilder(), 0, new boolean[26]);
    }
}
