import java.util.Scanner;
public class mainBTVN1 {
    public static void main(String[] args) {
        BTVN1 bt = new BTVN1();
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("-------------------- MENU --------------------");
        System.out.println("| 1. Bai 1                                   |");
        System.out.println("| 2. Bai 2                                   |");
        System.out.println("| 3. Bai 3                                   |");
        System.out.println("| 4. Bai 4                                   |");
        System.out.println("| 5. Thoat                                   |");
        System.out.println("----------------------------------------------");
        System.out.println("Nhap lua chon cua ban: ");
        do{
            choice = in.nextInt();
            switch (choice){
                case 1:
                    bt.Bai1();
                    break;
                case 2:
                    bt.Bai2();
                    break;
                case 3:
                    bt.Bai3();
                    break;
                case 4:
                    bt.Bai4();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long nhap lai: ");
            }
        } while (choice != 0);
    }
}
