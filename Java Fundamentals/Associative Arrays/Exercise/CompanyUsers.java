package ProgrammingFundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> companies = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String employeesID = input.split(" -> ")[1];

            companies.putIfAbsent(companyName, new ArrayList<>());

            if (!companies.get(companyName).contains(employeesID)) {
                companies.get(companyName).add(employeesID);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            entry.getValue().stream().forEach(e -> System.out.printf("-- %s%n", e));
        }
    }
}