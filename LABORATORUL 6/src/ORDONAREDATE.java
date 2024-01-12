import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ORDONAREDATE{
    public static void main(String[] args) {
        String DATEDINCSV = "world food production.csv";
        List<String> liniidinCSV = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(DATEDINCSV))) {
            String linie;

            while ((linie = bufferedReader.readLine()) != null) {
                liniidinCSV.add(linie);
            }
            Comparator<String> comparator = new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    String cuvant1 = s1.split(",")[0].trim();
                    String cuvant2 = s2.split(",")[0].trim();

                    return Integer.compare(cuvant1.length(), cuvant2.length());
                }
            };
            liniidinCSV.sort(comparator);

            for (String inregistrare : liniidinCSV) {
                System.out.println(inregistrare);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}