package JavaAdvanced.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Deque<Character> leftBracketsStack = new ArrayDeque<>();

        boolean isExpressionBalanced = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                leftBracketsStack.push(currentChar);
            } else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                if (leftBracketsStack.isEmpty()) {
                    isExpressionBalanced = false;
                    break;
                }

                char lastOpenBracket = leftBracketsStack.pop();

                if (lastOpenBracket == '(' && currentChar == ')'
                        || lastOpenBracket == '[' && currentChar == ']'
                        || lastOpenBracket == '{' && currentChar == '}') {
                    isExpressionBalanced = true;
                } else {
                    isExpressionBalanced = false;
                    break;
                }
            }
        }

        if (isExpressionBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}