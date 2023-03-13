package leetcode.java;

public class CapitalizetheTitle {
       public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < 3) {
                sb.append(arr[i].toLowerCase()).append(" ");
            } else {
                sb.append(convert(arr[i])).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static String convert(String str) {
        char[] array = str.toCharArray();
        for (int i = 1; i < str.length(); i++) {
            array[i] = Character.toLowerCase(array[i]);
        }
        array[0] = Character.toUpperCase(array[0]);
        return String.valueOf(array);
    }
}
