package address;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author uw1009
 */
public class AddressListing {

    Address[] a = new Address[1000];
    String dateiName = "./data/TestDaten1000 UTF.csv";
    String[] values = {};

    public Address[] addressArrayEinlesen() {
        try {
            FileReader fileIn = new FileReader(dateiName);
            BufferedReader in = new BufferedReader(fileIn);
            
            // Erste Zeile enthaelt Ueberschriften
            String s0 = in.readLine(); // Kann IOException auslösen

            int index = 0;
            // Zeile für Zeile lesen:
            while (true) {

                String s = in.readLine(); // Kann IOException auslösen

                if (s == null) {
                    break; // Ende der Datei erreicht.
                }
                values = s.split(";");

                Address address = new Address(values);
                a[index] = address;
                index++;
            }

            in.close();  // Kann IOException auslösen
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return a;
    }

}
