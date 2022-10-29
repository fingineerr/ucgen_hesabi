import java.util.Scanner;

public class ucgenbul {
    public static void main(String[] args){
        //değikenlerimizi oluşturalım.
        double a,b,c,u, alan;
        //scanner sınıfı ile kullanıcıdan verilerimizi alalım.
        Scanner girdi = new Scanner(System.in);

        System.out.println("a kenarını giriniz:");
        a= girdi.nextLong();
        System.out.println("b kenarını giriniz:");
        b= girdi.nextLong();
        System.out.println("c kenarını giriniz:");
        c= girdi.nextLong();

        u= ((a+b+c)/2);
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("alan:\n" +alan);

    }

}

