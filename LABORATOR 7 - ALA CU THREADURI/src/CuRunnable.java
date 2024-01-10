import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CuRunnable {
    public static void main(String[] args) {
        String DATEDINCSV = "world food production.csv";
        String[] liniidinCSV = new String[1000];

        int i1 = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(DATEDINCSV))) {
            String linie;
            while ((linie = bufferedReader.readLine()) != null) {
                if (i1 == liniidinCSV.length) {
                    liniidinCSV = Arrays.copyOf(liniidinCSV, liniidinCSV.length * 2);
                }
                liniidinCSV[i1++] = linie;
            }
            for (int i = 0; i < i1; i++) {
                System.out.println(liniidinCSV[i]);
            }
            Thread sortingThread = new Thread(new Sortare(liniidinCSV, i1));
            sortingThread.start();

            try {
                sortingThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*System.out.println("-------------");
            for (int i = 0; i < i1; i++) {
                System.out.println(liniidinCSV[i]);
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Sortare implements Runnable {
    private String[] data;
    private int length;

    public Sortare(String[] data, int length) {
        this.data = data;
        this.length = length;
    }

    @Override
    public void run() {
        Arrays.sort(data, 0, length, (o1, o2) -> o1.split(",")[1].compareTo(o2.split(",")[1]));
    }
}
