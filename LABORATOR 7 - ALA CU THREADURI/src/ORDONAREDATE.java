import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ORDONAREDATE {
    private static final int NUM_THREADS = 4;

    public static void main(String[] args) {
        String DATEDINCSV = "world food production.csv";
        List<String> liniidinCSV = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(DATEDINCSV))) {
            String linie;
            while ((linie = bufferedReader.readLine()) != null) {
                liniidinCSV.add(linie);
            }
            ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
            liniidinCSV.forEach(line -> executorService.submit(() -> afisare(line)));
            executorService.shutdown();
            while (!executorService.isTerminated()) {
            }
            liniidinCSV.sort(Comparator.comparing(o -> o.split(",")[1]));
            liniidinCSV.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void afisare(String line) {
        System.out.println(line);
    }
}
