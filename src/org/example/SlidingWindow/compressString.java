package org.example.SlidingWindow;

public class compressString {
    public static void main(String[] args) {
        String name = "rambabu";
        System.out.println(compress(name.toCharArray()));

    }
    public static int compress(char[] chars) {

        int index = 0; // position to write
        int i = 0;

        while(i < chars.length) {

            char currentChar = chars[i];
            int count = 0;

            // count occurrences
            while(i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // write character
            chars[index++] = currentChar;

            // write count if > 1
            if(count > 1) {
                for(char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
