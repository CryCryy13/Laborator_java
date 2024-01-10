
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CITIRECSV {

    public static void main(String[] args) {
        String RUTA = "world food production.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(RUTA))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                processLine(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processLine(String line) {
        String[] data = line.split(",");

        for (String value : data) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
}
