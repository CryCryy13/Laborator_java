import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class ORDONAREDATE {
    public static void main(String[] args) {
        String DATEDINCSV = "world food production.csv";
        String[] liniidinCSV = new String[1000];

        int I = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(DATEDINCSV))) {
            String linie;
            while ((linie = bufferedReader.readLine()) != null) {
                if (I == liniidinCSV.length) {
                    liniidinCSV = Arrays.copyOf(liniidinCSV, liniidinCSV.length * 2);
                }
                liniidinCSV[I++] = linie;
            }
            System.out.println("Elemente din prima coloană care încep cu 'A':");
            for (int i = 0; i < I; i++) {
                String primaColoana = liniidinCSV[i].split(",")[0].trim();
                if (primaColoana.startsWith("A")) {
                    System.out.println(primaColoana);
                }
            }
            Arrays.sort(liniidinCSV, 0, I, Comparator.comparing(o -> o.split(",")[1]));
            /*System.out.println("-------------");
            for (int i = 0; i < currentIndex; i++) {
                System.out.println(liniidinCSV[i]);
            }*/ //ca sa afisez tot

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}