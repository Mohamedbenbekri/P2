package address;
import static java.nio.charset.StandardCharsets.UTF_8;  
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author uw1009
 */
public class AddressMain {

    public static void main(String[] args) {
        AddressListing addrL = new AddressListing();
        Address[] addrArray = addrL.addressArrayEinlesen();
        
        
        
        Address[]new_array_loschen=Address.loschenEintrageName(addrArray, "zzzz", "zzzz");
        Address ich = new Address(
    1001,                       // nr
    "Herr",                     // anrede
    "",                         // titel
    "Mohamed",                  // vorname
    "Benbekri",                 // nachname
    null,                       // geburtsdatum (optional)
    "HuntermannStraße",        // strasse
    "1",                        // hausnummer
    "26121",                    // postleitzahl
    "Oldenburg",                // stadt
    "+1234556",                         // telefon
    "",                         // mobil
    "",                         // telefax
    "mohamed@gmail.com",        // eMail
    false,                      // newsletter
    null                        // eintragsdatum
);

        Address ich1=new Address();
        
        
        /*Scanner sc =new Scanner(System.in);
        System.out.println("Bitte geben Sie Name ");
        String nachname =sc.next();
        System.out.println("Bitte geben Sie vorname");
        String vorname=sc.next();
        ich1.setNr(1002);
        ich1.setAnrede("Herr");
        ich1.setNachname(nachname);
        ich1.setVorname(vorname);*/
        Address []new_array_einfugen=Address.einfuegenAddress(addrArray,ich);

        printArray(new_array_einfugen);
        
        
        
    } // END main()

    public static void printArray(Address[] addrArray) {
        for (Address a : addrArray) {
            System.out.println(a.toString());
        }
    } // END printArray()
}



       