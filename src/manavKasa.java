import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican,toplam;
        Scanner giris = new Scanner(System.in);
        System.out.print("Armut kaç kilo? ");
        armut=giris.nextDouble();
        System.out.print("Elma kaç kilo? ");
        elma=giris.nextDouble();
        System.out.print("Domates kaç kilo? ");
        domates=giris.nextDouble();
        System.out.print("Muz kaç kilo? ");
        muz=giris.nextDouble();
        System.out.print("Patlıcan kaç kilo? ");
        patlican=giris.nextDouble();
        toplam=(armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.00);
        System.out.println("Toplam ödemeniz gereken tutar: "+toplam);
    }
}