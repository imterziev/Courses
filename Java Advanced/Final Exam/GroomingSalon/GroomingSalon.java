package JavaAdvanced.FinalExam.GroomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private int capacity;
    private List<Pet> data;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.capacity > this.data.size()) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet pet : data) {
            if (name.equals(pet.getName())) {
                data.remove(pet);
                return true;
            }
        }

        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : data) {
            if (name.equals(pet.getName()) && owner.equals(pet.getOwner())) {
                return pet;
            }
        }

        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder stringBuilder = new StringBuilder(String.format("The grooming salon has the following clients:\n"));

        for (Pet pet : data) {
            stringBuilder.append(pet.getName()).append(" ").append(pet.getOwner()).append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }
}