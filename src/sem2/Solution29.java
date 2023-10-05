package sem2;

import java.io.IOException;
import java.util.*;

public class Solution29 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> cityFamilyTable = new HashMap<>();
        while (true) {
            String city = scanner.next();
            if (city.equals("end")) {
                break;
            }
            String family = scanner.next();
            cityFamilyTable.put(city, family);
        }

        while (true) {
            String city = scanner.next();
            if (city.equals("end")) {
                break;
            }
            System.out.println(cityFamilyTable.get(city));
        }


    }
}
