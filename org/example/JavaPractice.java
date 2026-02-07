package org.example;

import java.util.*;

public class JavaPractice {
    public static void main(String[] args) {
        System.out.println("Hello and welcome! ***JAVA OUT PUT******");
        String reverseSting = reverseString("rambabu is very GOod boy123, ram");
        System.out.println(capitalize(reverseSting));
        Integer[] a = {1, 2, 3, 4, 5, 6, 8, 10, 1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(a);
        System.out.println(arrayOperations(list));
        System.out.println(duplicateFindOut(list));
        String name = "rambabu";
        System.out.println(duplicateFindOut(name.toCharArray()));
        System.out.println(fibonacci(10));
        System.out.println("********FREQUENCY COUNT********");
        System.out.println(frequencyCount(name));
        System.out.println("*********PRIME NUMBER*********");
        System.out.println(primeNumbers(5));
        System.out.println("*********PRIME NUMBER*********");
        System.out.println(primeNumbersUpto(100));
        System.out.println("*********FACTORIAL NUMBER*********");
        System.out.println(factorial(7));
        System.out.println("*********MAXIMUM NUMBER AND MIN` MAXIMUM NUMBER*********");
        System.out.println(maxAndMin(list));
        System.out.println("*********REVERSE NUMBER*********");
        System.out.println(reverseNumbers(12345));
        System.out.println("*********SORTING*********");
        System.out.println(sortArray(list));
        System.out.println("*********MERGESORTING*********");
        System.out.println(binarySearch(list,10));
        System.out.println("*********ArmStrong*********");
        System.out.println(armStrongNumber(153));
        System.out.println("*********isAnagram*********");
        System.out.println(isAnagram("ram","r am"));

    }

    public static List<Integer> arrayOperations(List<Integer> a) {

        int sum = 0;

        List<Integer> result = new ArrayList<>();
        for (Integer i : a) {
            if (i % 2 == 0) {
                result.add(i);
            }
            sum += i;
        }
        System.out.println("EVEN ARRAYS Sum: " + sum);
        return result;
    }

    public static String maxAndMin(List<Integer> list) {
       // int max = list.get(0);
//        Integer MAX = Integer.MAX_VALUE;
//        Integer MIN = Integer.MIN_VALUE;
        int max = list.get(0);
        int min = list.get(0);

      //  list.sort(Comparator.naturalOrder());
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i)   ;
            }

               // MIN = list.get(0);

        }
        return "MAX: " + max+", MIN: " + min;
    }

    public static List<Integer> fibonacci(int n) {
        List<Integer> result = new ArrayList<>();
//        result.add(0);
//        result.add(1);

        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <= n; i++) {

            int sum = n1 + n2;
            result.add(n1);
            n1 = n2;
            n2 = sum;
        }
        return result;
    }


    public static List<Integer> duplicateFindOut(List<Integer> a) {

        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        System.out.println("DuplicateFindOut");
        for (Integer i : a) {
            if (!set.add(i)) {
                result.add(i);
            }
        }
        System.out.println("duplicateFindOut: set:" + set);
        return result;
    }

    public static List<Character> duplicateFindOut(char[] a) {

        List<Character> result = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        System.out.println("duplicateFindOut");
        for (Character i : a) {
            if (!set.add(i)) {
                result.add(i);
            }
        }
        System.out.println("duplicateFindOut list: " + result);
        System.out.println("duplicateFindOut: set:" + set);
        return result;
    }


    public static String reverseString(String name) {

        // char [] nameArray = name.toCharArray();
        StringBuilder nameBuffer = new StringBuilder();
        String[] nameArray = name.split(" ");
        StringBuilder reverseStr = new StringBuilder();

        for (int i = 0; i <= nameArray.length - 1; i++) {
            //  nameBuffer.append(name.charAt(name.length()-1-i));
            //  reverseStr = reverseStr + nameArray[name.length()-i-1];
            reverseStr.append(nameArray[i]).append(" ");
            nameBuffer.append(reverseCharacters(nameArray[i] + " "));

        }
        System.out.println(capitalize(nameBuffer.toString()));
        return reverseStr.toString();

    }

    public static String reverseCharacters(String array) {
        String[] tempArray = array.split("");
        String reverseStr = "";
        for (int i = 0; i < tempArray.length; i++) {
            reverseStr += tempArray[tempArray.length - i - 1];
        }
        return reverseStr;
    }

    public static String capitalize(String str) {
        StringBuilder buffer = new StringBuilder();
        boolean upperCase = true;
        System.out.println("capitalize:Before " + str);
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                buffer.append(c);
                upperCase = true;
            } else {
                if (upperCase) {
                    buffer.append(Character.toUpperCase(c));
                    upperCase = false;
                } else {
                    buffer.append(Character.toLowerCase(c));
                }
            }

        }
        return buffer.toString();

    }

    public static String frequencyCount(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >1) {
                sb.append(entry.getKey()).append(" ---> ").append(entry.getValue()).append(" ");
                count++;
            }
        }
        return sb.toString().trim();


    }
    public static String reverseNumbers(Integer number) {

        int reversed = 0;
        while (number > 0) {
          //  System.out.print(number + " ");
            //121

            reversed = reversed*10 + number%10;
          //  System.out.println(reversed);
            number /= 10;
        }
        return String.valueOf(reversed);

    }

    public static List<Integer> primeNumbersUpto(Integer n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if(primeNumbers(i)){
                result.add(i);
            }
        }
        return result;
    }

    public static Integer factorial(Integer n) {
        if(n == 1){
            return n;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result*i;//1*1,1*2, 2*3 6*4,24*5, 120
        }
        return  result;

    }
    public static boolean primeNumbers(int n) {
       // List<Integer> result = new ArrayList<>();
        if (n <= 1) {
            return false;
        }
        int count = 0;
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }

        }
        if (count == 1) {
            return true;
        }
        return  false;

    }

    public static String sortArray(List<Integer> list) {
        System.out.println("sortArray sortArray: "+list);
       // Object[] a = list.toArray();
      //  int [] a = {10,22,3,4,5,6,7,8,9,10};
        for(int i=0;i<list.size()-1;i++) {
            for(int j=i;j<list.size()-1;j++){
                if(list.get(i)>list.get(j+1)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        return list.toString();

    }

    public static int binarySearch(List<Integer> list,int target) {
        System.out.println("binarySearch target: "+list);
        int low = 0;
        int high = list.size()-1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (list.get(mid) == target) {
                return mid;

            }
            if (list.get(mid) < target) {
                low = mid+1;
            }else {
                high = mid-1;
            }
          // return target;
        }
        return -1;
    }

    public static boolean isAnagram(String s1, String s2) {

        s1 =  s1.replaceAll("\\s+", "").toLowerCase();
        s2 =  s2.replaceAll("\\s+", "").toLowerCase();
        System.out.println("isAnagram: "+s1+" "+s2);
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }
    public static boolean armStrongNumber(int n){
        int length = String.valueOf(n).length();
        int sum = 0;
        int original = n;
        while (n>0){
            int digit = n%10;
            sum += Math.pow(digit,length);
            n/=10;

        }
        if(sum == original){
            return true;

        }else {
            return false;
        }
    }
}