import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args)  {
        /* First exercise */
        System.out.println("---Here is all of the Strings that starts with letter 'a' and have 3 letters---");
        
        List<String> list = Arrays.asList(
        "ana", "Isabele", " K a l e o", "123", "abc", " This Is The Delete White Spaces ", "824", "Meisters"
        );

        list.stream()
        .filter(s -> s.startsWith("a") && s.length() == 3)
        .forEach(System.out::println);

        /*Second exercise */
        System.out.println("---     Removing all of the white spaces    ---");
        HashMap<String, String>noWhiteSpace = new HashMap<>();
        noWhiteSpace.put(" ","");
        
        /*Creating a for loop that maps the char inside arrayList and creates a new one separating */
        for(int i = 0; i < list.size(); i++) {
            String myString = list.get(i);
            StringBuilder sb = new StringBuilder();
            for(char c : myString.toCharArray()){
                if(noWhiteSpace.containsKey(String.valueOf(c))){
                    sb.append(noWhiteSpace.get(String.valueOf(c)));
                }
                else{
                    sb.append(c);
                }
            }
            list.set(i, sb.toString());
        }
        System.out.println(list);
        
        /*Third exercise */
        System.out.println("---     Swapping two numbers without a third variable    ---");

        int x=50, y=100;

        System.out.println("First values are x: " + x + " & y: " + y);
        
        y = y - x;
        x = x + y;
        
        System.out.println("Updated values are x: " + x + " & y: " + y);
    }
}