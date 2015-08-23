import java.util.Scanner;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> parenStack = new Stack<Character>();
        parenStack.push('T');

        Map<Character, Character> opposite = new HashMap<Character, Character>();
        opposite.put(')','(');
        opposite.put(']','[');
        opposite.put('}','{');

        while(sc.hasNext()) {
            String testString = sc.nextLine();
            for (char c : testString.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    parenStack.push(c);
                } else {
                    if (parenStack.peek() != opposite.get(c)) {
                        parenStack.push('F');
                        break;
                    } else {
                        parenStack.pop();
                    }

                }
            }
            if (parenStack.peek() == 'T') System.out.println("true");
            else System.out.println("false");
            while (parenStack.peek() != 'T') {
                parenStack.pop();
            }
        }
    }
}
