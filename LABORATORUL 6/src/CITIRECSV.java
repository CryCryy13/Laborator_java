import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//Cititi fisieru csv
//AM ALES UN DATASHEET DE PE SITE SI AM FACUT CITIRE DIN CSV
public class CITIRECSV {
    public static void main(String[] args) {
        String fisierCSV = "world food production.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fisierCSV))) {
            String linie;

            while ((linie = bufferedReader.readLine()) != null) {
                String[] date = linie.split(",");

                for (String valoare : date) {
                    System.out.print(valoare + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}