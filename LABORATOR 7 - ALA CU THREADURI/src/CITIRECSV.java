
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

    public class CITIRECSV {
        private static final int NUM_THREADS=2;

        public static void main(String[] args) {
            String csvFilePath = "world food production.csv";

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFilePath))) {
                ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    String finalLine = line;
                    executorService.submit(() -> processLine(finalLine));
                }

                executorService.shutdown();

            } catch (IOException e) {
                System.out.println("Afisez: ");
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

