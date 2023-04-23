package JavaOOP.Inheritance.Lab.ReusingClasses;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<Integer> numbers = new RandomArrayList<>();

        for (int i = 1; i <= 13; i++) {
            numbers.add(i);
        }

        System.out.println(numbers.getRandomElement());

        StackOfStrings stack = new StackOfStrings();

        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}