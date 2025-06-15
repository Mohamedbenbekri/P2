
package address;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author uw1009
 */
public class Address implements Comparable<Address>{
    private int nr;
    private String anrede;
    private String titel;
    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;
    private String strasse;
    private String hausnummer;
    private String postleitzahl;
    private String stadt;
    private String telefon;
    private String mobil;
    private String telefax;
    private String eMail;
    private boolean newsletter;
    private LocalDate eintragsdatum;
            

    public Address() {
    }

    public Address(String[] values) {
        this.nr = Integer.parseInt(values[0]);
        this.anrede = values[1];
        this.titel = values[2];
        this.vorname = values[3];
        this.nachname = values[4];

        
        if(values[5].length() == 10){
            this.geburtsdatum = LocalDate.of(Integer.parseInt(values[5].substring(6, 10)), 
                                    Integer.parseInt(values[5].substring(3, 5)), 
                                    Integer.parseInt(values[5].substring(0, 2)));
        }else{
            this.geburtsdatum = null;
        }
        
        this.strasse = values[6];
        this.hausnummer = values[7];
        this.postleitzahl = values[8];
        this.stadt = values[9];
        this.telefon = values[10];
        this.mobil = values[11];
        this.telefax = values[12];
        this.eMail = values[13];
        
        if(values[14].equals("ja"))
            this.newsletter = true;
        else
            this.newsletter = false;
        
        if(values[15].length() == 10){
            this.eintragsdatum = LocalDate.of(Integer.parseInt(values[15].substring(6, 10)), 
                                    Integer.parseInt(values[15].substring(3, 5)), 
                                    Integer.parseInt(values[15].substring(0, 2)));
        }else{
            this.eintragsdatum = null;
        }
    }

    public Address(int nr, String anrede, String titel, String vorname, String nachname, LocalDate geburtsdatum, String strasse, String hausnummer, String postleitzahl, String stadt, String telefon, String mobil, String telefax, String eMail, boolean newsletter, LocalDate eintragsdatum) {
        this.nr = nr;
        this.anrede = anrede;
        this.titel = titel;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.stadt = stadt;
        this.telefon = telefon;
        this.mobil = mobil;
        this.telefax = telefax;
        this.eMail = eMail;
        this.newsletter = newsletter;
        this.eintragsdatum = eintragsdatum;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getTelefax() {
        return telefax;
    }

    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public boolean getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    public LocalDate getEintragsdatum() {
        return eintragsdatum;
    }

    public void setEintragsdatum(LocalDate eintragsdatum) {
        this.eintragsdatum = eintragsdatum;
    }

    @Override
    public int compareTo(Address o) {
        // Pruefen ob das Objekt o initialisiert wurde
        if(o == null)
            return 1;
        // Nachname vergleichen
        int ct = this.nachname.compareTo(o.nachname);
        // Wenn Nachname gleich ...
        // ... dann Vorname vergleichen
        if(ct == 0)
            return this.vorname.compareTo(o.vorname);
        
        return ct;
    } // END compareTo
    
      @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.vorname);
        hash = 61 * hash + Objects.hashCode(this.nachname);
        return hash;
    } // END hashCode

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (!Objects.equals(this.nachname, other.nachname)) {
            return false;
        }
        return Objects.equals(this.vorname, other.vorname);
    } // END equals

    @Override
    public String toString() {
        return "Address{" + "nr=" + nr + ", nachname=" + nachname + ", vorname=" + vorname + '}';
    }
    public static Address[] loschenEintrageName(Address[] addr, String name, String vorname) {

    int index = -1;

    for (int i = 0; i < addr.length; i++) {
        if (addr[i].getNachname().equals(name) && addr[i].getVorname().equals(vorname)) {
            index = i;
            System.out.println(i);
        }
    }

    if (index == -1) {
        return addr;
    }

    Address[] nAddr = new Address[addr.length - 1];
    int j = 0;

    for (int ii = 0; ii < addr.length; ii++) {
        if (ii != index) {
            nAddr[j] = addr[ii];
            j++;
        }
    }

    return nAddr;
}
public static Address[] einfuegenAddress(Address[] addr, Address ich) {
    Address[] nAddr = new Address[addr.length + 1];
    int j = 0;
    boolean inserted = false;

    for (int i = 0; i < addr.length; i++) {
        if (!inserted && ich.compareTo(addr[i]) < 0) {
            nAddr[j++] = ich;
            inserted = true;
        }
        nAddr[j++] = addr[i];
    }

    if (!inserted) {
        nAddr[j] = ich;
    }

    return nAddr;
}
public static Address[] suchenNachNachname(Address[] addr, String suchNachname) {
  if (addr == null || suchNachname == null) return new Address[0];
    
    int anzahl = 0;
    for (Address a : addr) {
        if (a != null && a.getNachname() != null && 
            a.getNachname().equalsIgnoreCase(suchNachname)) anzahl++;
    }
    
    Address[] ergebnis = new Address[anzahl];
    int j = 0;
    for (Address a : addr) {
        if (a != null && a.getNachname() != null && 
            a.getNachname().equalsIgnoreCase(suchNachname)) {
            ergebnis[j++] = a;
        }
    }
    return ergebnis;
    
}// END Class Address
}