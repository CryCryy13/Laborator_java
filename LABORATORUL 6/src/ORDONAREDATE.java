//Ordonati datele in functie de un anumit camp folosind comparatia claselor Comparable/Comparator
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ORDONAREDATE {
    public static void main(String[] args) {
        String DATEDINCSV = "world food production.csv";
        List<String> liniidinCSV = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(DATEDINCSV))) {
            String linie;

            while ((linie = bufferedReader.readLine()) != null) {
                liniidinCSV.add(linie);
            }
            final int indexCamp = 1;
            liniidinCSV.sort(Comparator.comparing(o -> o.split(",")[indexCamp]));

            for (String inregistrare : liniidinCSV) {
                System.out.println(inregistrare);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
