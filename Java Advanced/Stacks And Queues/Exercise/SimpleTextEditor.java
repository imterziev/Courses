package JavaAdvanced.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int operations = Integer.parseInt(scanner.nextLine());
        StringBuilder data = new StringBuilder();
        Deque<String> savedDataStack = new ArrayDeque<>();

        for (int i = 1; i <= operations; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];

            switch (command) {
                case "1":
                    data.append(input[1]);
                    savedDataStack.push(data.toString());
                    break;
                case "2":
                    int elementToErase = Integer.parseInt(input[1]);
                    int startIndex = data.length() - elementToErase;
                    data.delete(startIndex, data.length());
                    savedDataStack.push(data.toString());
                    break;
                case "3":
                    int indexToReturn = Integer.parseInt(input[1]);
                    if (data.length() == 0) {
                        System.out.println("");
                    } else {
                        System.out.println(data.charAt(indexToReturn - 1));
                    }
                    break;
                case "4":
                    data.setLength(0);

                    if (savedDataStack.size() > 1) {
                        savedDataStack.pop();
                        data.append(savedDataStack.peek());
                    }
                    break;
            }
        }
    }
}