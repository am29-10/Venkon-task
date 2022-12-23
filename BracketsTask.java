import java.util.*;

public class BracketsTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку содержащую скобки: ");
        String string = scanner.nextLine();

        System.out.println(isCorrectString(string));
    }

    private static boolean isCorrectString(String stringWithBrackets) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');

        Stack<Character> stack = new Stack<>();
        for (char bracket : stringWithBrackets.toCharArray()) {
            if (brackets.containsValue(bracket)) {
                stack.push(bracket);
            } else if (brackets.containsKey(bracket)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(bracket)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
