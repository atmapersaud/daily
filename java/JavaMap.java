import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class JavaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEntries = Integer.parseInt(sc.nextLine());

        Map<String, Integer> phonebook = new HashMap<String, Integer>();

        for (int i = 0; i < numEntries; i++) {
            String name = sc.nextLine();
            int number = Integer.parseInt(sc.nextLine());
            phonebook.put(name, number);            
        }

        while(sc.hasNext()) {
            String query = sc.nextLine();
            if (phonebook.containsKey(query)) {
                System.out.println(query + "=" + phonebook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
