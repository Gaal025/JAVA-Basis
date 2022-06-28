public class Main
{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int  summe =a+b;
        String wort = "summe";

        System.out.println(wort +"  " +  summe);

        int ergebnis = a * b;
        int wert = 5;
        if (wert > ergebnis) {
            System.out.println("Wert " + wert  +" > " + "ergebnis " +ergebnis);
        }
        else{
            System.out.println("Wert"  + wert + "< " + "ergebnis " +ergebnis);
        }
    }
}
