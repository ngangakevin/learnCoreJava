package practice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LearnStreams {
    public static void main(String[] args){
        Stream.Builder<Integer> source = Stream.<Integer>builder().add(5);
        source.accept(11);
        source.add(1);
//        source.build().forEach(System.out::println);
        Stream<Integer> test = source.build();

//        Integer sum = source.build()
//                .map(i-> i+3)
//                .filter(i -> i>5)
//                .reduce(0, Integer::sum);
//        System.out.println(sum);
//
//        Stream<Integer> source2 = IntStream.range(1,7).boxed();
//
//        Integer num1 = 6;
//        Integer num2 = 7;
//        System.out.println(num2 + num1);
        String text = "hello";
        String result = new StringBuilder(text).reverse().toString().chars()
                .mapToObj(c-> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(result);

        char ch = 'a';
        System.out.print(Character.toUpperCase(ch));
    }

    Stream<Integer> test = IntStream.of(1,2,3,4,5)
            .boxed();

}
