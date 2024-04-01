package driver;

import java.util.Scanner;

import model.Indomie;
import model.Jenismenu;
import model.Nasigoreng;
import model.Soto;
import model.Menu;

public class Driver1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu Makanan");
        System.out.println("1. Indomie");
        System.out.println("2. Nasi Goreng");
        System.out.println("3. Soto");
        System.out.print("Pilih Menu : ");
        int pilihan = input.nextInt();
        System.out.print("Total : ");
        double total = input.nextDouble();
        switch (pilihan) {
            case 1:
                Menu indomie = new Indomie(total);
                System.out.println("Total Harga : " + indomie.totalPrice());
                break;
            case 2:
                Menu nasigoreng = new Nasigoreng(total);
                System.out.println("Total Harga : " + nasigoreng.totalPrice());
                break;
            case 3:
                Menu soto = new Soto(total);
                System.out.println("Total Harga : " + soto.totalPrice());
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }
        input.close();
    }
}
