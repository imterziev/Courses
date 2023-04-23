package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.*;

public class SerializeCustomObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cube cube = new Cube();
        cube.color = "green";
        cube.width = 15.3;
        cube.height = 12.4;
        cube.depth = 3.0;

        String path = "D:\\Java\\src\\JavaAdvanced\\outputSCO.txt";

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));

        outputStream.writeObject(cube);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));

        Object cubeObject = inputStream.readObject();
    }

    static class Cube implements Serializable {
        String color;
        double width;
        double height;
        double depth;
    }
}