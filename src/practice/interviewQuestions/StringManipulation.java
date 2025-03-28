package practice.interviewQuestions;

import java.util.*;

public class StringManipulation {
    public static void removeOccurrences(){
        String str = "asdfghjkjhgfdsa";
        String str1 = str.replace("a", "");
        System.out.println(str1);
    }

    public static void characterCount(){
        String str = "asdfghjkjhgfdsa";
        char[] characters = str.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(char i: characters){
            if(charCountMap.containsKey(i)){
                charCountMap.put(i, charCountMap.get(i)+1);
            }else{
                charCountMap.put(i, 1);
            }
        }
        System.out.println(charCountMap);
    }

    public static void proveImmutability(){
        String str = String.valueOf(1);
        String str1 = str;
        str = "Gotham";
        System.out.println(str == str1);
        System.out.println(str1);
    }

    public static void proveMutability(){
        List<Integer> tester = new ArrayList<>();
        tester.add(52);
        List<Integer> tester1 = tester;
        tester.set(0, 99);
        tester.add(98);

        tester1.forEach(System.out::println);

        System.out.println(tester1.equals(tester));
        System.out.println(tester1);
        System.out.println(tester);
    }

    public static void createBlock(){
        String str = "This\nis\na\ntext\nblock";
        System.out.println(str);
    }

    public static void shortSet(){
        /* boxing and autoboxing. without explicit casting from a larger data type to a small data type
        * in arithmetic operations, the smaller data type is first promoted, int - (or any opr) int is performed
        * Also, short - int = int. also, int - short = int
        * */
        HashSet<Short> set = new HashSet<>();
        for(short i=0; i< 100; i++){
            set.add(i);
            set.remove((short) (i / 2));
        }
        System.out.println(set.size());
    }

    public static void main(String[] args){
        shortSet();
    }
}
