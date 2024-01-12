import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CuRunnable {
    public static void main(String[] args) {
        String DATEDINCSV = "world food production.csv";
        List<String> liniidinCSV = new ArrayList<>();

        Thread citireThread = new Thread(new CitireRunnable(DATEDINCSV, liniidinCSV));
        citireThread.start();

        try {
            citireThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread sortareThread = new Thread(new SortareRunnable(liniidinCSV));
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

class CitireRunnable implements Runnable {
    private String filePath;
    private List<String> lines;

    public CitireRunnable(String filePath, List<String> lines) {
        this.filePath = filePath;
        this.lines = lines;
    }

    @Override
    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String linie;
            while ((linie = bufferedReader.readLine()) != null) {
                lines.add(linie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SortareRunnable implements Runnable {
    private List<String> lines;

    public SortareRunnable(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public void run() {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String cuvant1 = s1.split(",")[0].trim();
                String cuvant2 = s2.split(",")[0].trim();

                return Integer.compare(cuvant1.length(), cuvant2.length());
            }
        };
        lines.sort(comparator);
    }
}

