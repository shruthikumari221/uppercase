import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercase {

    public static void main(String[] args) {

        List<String> alpha = Arrays.asList("aBc", "d", "ef");

        //Before Java8
        List<String> alphaLower = new ArrayList<>();
        for (String s : alpha) {
            alphaLower.add(s.toLowerCase());
        }

        System.out.println(alpha);
        System.out.println(alphaLower);

        // Java 8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]

    }

}