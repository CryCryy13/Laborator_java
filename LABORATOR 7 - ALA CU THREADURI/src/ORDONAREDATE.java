import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ORDONAREDATE {
    public static void main(String[] args) {
        String DATEDINCSV = "world food production.csv";
        List<String> liniidinCSV = new ArrayList<>();
        Thread citireThread = new Thread(() -> {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(DATEDINCSV))) {
                String linie;
                while ((linie = bufferedReader.readLine()) != null) {
                    liniidinCSV.add(linie);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        citireThread.start();

        try {
            citireThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread sortareThread = new Thread(() -> {
            Comparator<String> comparator = Comparator.comparingInt(s -> s.split(",")[0].trim().length());
            liniidinCSV.sort(comparator);
        });
        sortareThread.start();

        try {
            sortareThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (String inregistrare : liniidinCSV) {
            System.out.println(inregistrare);
        }
    }
}