import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static List<String> omitLongStrings(List<String> strings) {
        // write your code here
//        strings.stream().filter(x -> x.length() <= 3).collect(Collectors.toList());
        strings.removeIf(string -> string.length() >= 4);
        return strings;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        omitLongStrings(list).forEach(System.out::println);
    }
}
