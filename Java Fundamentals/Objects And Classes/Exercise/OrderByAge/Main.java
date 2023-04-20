package ProgrammingFundamentals.ObjectsAndClasses.Exercise.OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<OrderByAge> orderByAgeList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);

            OrderByAge order = new OrderByAge(name, id, age);
            orderByAgeList.add(order);

            input = scanner.nextLine();
        }

        orderByAgeList.sort(Comparator.comparing(OrderByAge::getAge));

        for (OrderByAge orderByAge : orderByAgeList) {
            System.out.println(orderByAge);
        }
    }
}