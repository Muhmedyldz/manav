import java.util.Scanner;

public class Manavkasa1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,e,d,m,p;
        System.out.println("kaç kilo armut :");
        a= scan.nextInt();
        System.out.println("kaç kilo elma :");
        e= scan.nextInt();
        System.out.println("kaç kilo domates :");
        d= scan.nextInt();
        System.out.println("kaç kilo muz :");
        m= scan.nextInt();
        System.out.println("kaç kilo patlican :");
        p= scan.nextInt();
        double ar=2.14;
        double el=3.67;
        double dom= 1.11;
        double mu=0.95;
        double pa=5.00;
        double tutar=(a*ar)+(e*el)+(d*dom)+(mu*m)+(pa*p);
        System.out.println("toplam tutar :"+tutar);
    }
}
