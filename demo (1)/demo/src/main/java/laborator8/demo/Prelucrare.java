//ASTA ARE ERORI, M-AM CHINUIT SA LE REZOLV DA DEGEABA CA FAC MAI MULTE. NU STIU CE SA-I FAC
//AM INCERCAT SA CAUT DESPRE TREBURILE ASTEA, NU AM INTELES ABSOLUT NIMIC
//AM INTELES CA TREBUIE SA ADAUG DEPENDINTELE IN POM.XML, AM INCERCAT SA FAC NU IMI IESE
package laborator8.demo;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/data")
public class Prelucrare {

    private final List<String> dataset = new ArrayList<>();

    public Prelucrare() {
        try {
            Resource resource = new ClassPathResource("world food production.csv");
            byte[] bytes = FileCopyUtils.copyToByteArray(resource.getInputStream());
            String content = new String(bytes);
            dataset.add(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/get")
    public String GET(@RequestParam String columnName, @RequestParam String value) {
        return dataset.stream()
                .filter(entry -> entry.contains(columnName + "=" + value))
                .findFirst()
                .orElse("Element negasit");
    }

    @PostMapping("/add")
    public String ADD(@RequestBody List<String> elements) {
        dataset.addAll(elements);
        System.out.println("Element adaugat");
        return null;
    }

    @DeleteMapping("/delete")
    public String DELETE(@RequestParam String columnName, @RequestParam String value) {
        dataset.removeIf(entry -> entry.contains(columnName + "=" + value));
        System.out.println("Element sters");
        return null;
    }

    @PutMapping("/update")
    public String PUT(@RequestParam String columnName, @RequestParam String oldValue,
                      @RequestParam String newValue) {
        dataset.replaceAll(entry -> entry.replace(columnName + "=" + oldValue, columnName + "=" + newValue));
        System.out.println("Element updatat");
        return null;
    }
}