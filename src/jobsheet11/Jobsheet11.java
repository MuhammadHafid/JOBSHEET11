
package jobsheet11;
import java.util.Locale;

public class Jobsheet11 {

    public static void main(String[] args) {
        String  identitas = "muhammad hafid azis / XRPL2 / 23";
        System.out.println("Identitas : "+ identitas);
        
        String x = "operasi";
        System.out.println("isi variable x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variable y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("isi variable z : "+ z);
        System.out.println("isi x sama dengan z (Case Sensitive): "+ x.equals(z) );
        
        String r = "operasi";
        System.out.println("isi variabel r : "+ r);
        System.out.println("isi x sama dengan r (Case Sensitive):"+ x.equals (r));
         System.out.println("isi x sama dengan r (Not Case Sensitive):"+ x.equalsIgnoreCase (r));
         
        System.out.println("perbandingan isi x dengan y :" + x.compareTo(y));
        System.out.println("perbandingan isi x dengan z (Case Sensitive) :" + x.compareTo(z));
        System.out.println("perbandingan isi x dengan r (Case Sensitive):" + x.compareTo(r));
        System.out.println("perbandingan isi x dengan r (Not Case Sensitive):" + x.compareTo(r));

        String s = "operasI";
        System.out.println("isi variable s : "+ s);
        System.out.println("perbandingan isi r dengan s (Case Sensitive):" + x.compareTo (s)); 
       
        System.out.println("pada x terdapat huruf 'a' : " + x.contains("a"));
        
        System.out.println("isi variable x besar semua : "+ x.toUpperCase());
        System.out.println("isi variable x besar semua : "+ x.toLowerCase());
        
        String t = "    operasi string  ";
        System.out.println("isi variable t : \""+ t +"\"");
        System.out.println("isi variable t tanpa spasi : \""+ t.trim() +"\"");
        
        System.out.println("gabungkan isi variable x dan r : "+ x.concat(r));
        
        
        

       