
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M E G A S T A R
 */
public class CobaOperasiString {
    public static void main(String[] args)
    {
        // Intial Commit
        
        String identitas = "Muhamamad Khoirul Anam / XRPL3 / 25";
        System.out.println("Identitas : "+ identitas);
        
        String x = "Operasi";
        System.out.println("isi variabel x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : "+ y);
        System.out.println("y adalah kosong " + y.isEmpty());
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "opersi";
        System.out.println("isi varibel z : "+ z);
        System.out.println("isi x sama dengan z (Case sensitive): "
                + x.equals(z));
        
        String r = "opreasi";
        System.out.println("isi variabel r : "+ r);
        System.out.println("isi x sama dengan r (Case sensitive): "
                + x.equals(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive): "
                + x.equalsIgnoreCase(r));

    }
    
}
