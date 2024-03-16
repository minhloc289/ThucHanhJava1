import java.util.Scanner;
public class BTTH1 {
    public void Bai1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ban kinh duong tron: ");
        int r = in.nextInt();
        double chuVi = 2 * Math.PI * r;
        System.out.println("Chu vi duong tron la: " + chuVi);
        System.out.println();
    } //Tinh chu vi duong tron
    public void Bai2() {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap so a: ");
        a = in.nextInt();
        System.out.println("Nhap so b: ");
        b = in.nextInt();
        double x = (double) a / b;
        System.out.printf("%.3f",x);
        System.out.println();
    } //Tinh phan thap phan cua a/b
    public void Bai3(){
        class Bai3 {
            int tuso;
            int mauso;

            public Bai3(int tuso, int mauso){
                this.tuso = tuso;
                this.mauso = mauso;
            }

            public Bai3 inputPhanSo(){
                Scanner in = new Scanner(System.in);
                System.out.println("Nhap tu so: ");
                int tuso = in.nextInt();
                System.out.println("Nhap mau so: ");
                int mauso = in.nextInt();
                return new Bai3(tuso, mauso);
            }

            public Bai3 add(Bai3 a, Bai3 b){
                int tuso = a.tuso * b.mauso + b.tuso * a.mauso;
                int mauso = a.mauso * b.mauso;
                return new Bai3(tuso, mauso);
            }

            public Bai3 substract(Bai3 a, Bai3 b) {
                int tuso = a.tuso * b.mauso - b.tuso * a.mauso;
                int mauso = a.mauso * b.mauso;
                return new Bai3(tuso, mauso);
            }

            public int UCLN(int a, int b) {
                while (a != b) {
                    if (a > b) {
                        a -= b;
                    } else {
                        b -= a;
                    }
                }
                return a;
            }

            public void outPut(){
                if (this.tuso % this.mauso == 0){
                    int s = this.tuso / this.mauso;
                    System.out.println(s);
                }
                else if (this.tuso % this.mauso != 0){
                    if (this.mauso < 0){
                        this.tuso *= -1;
                        this.mauso *= -1;
                    }
                    int u = UCLN(Math.abs(this.tuso), Math.abs(this.mauso));
                    this.tuso /= u;
                    this.mauso /= u;
                    System.out.println(this.tuso + "/" + this.mauso);
                }
            }
        }

        System.out.println("Nhap phan so thu nhat: ");
        Bai3 phanSo1 = new Bai3(0, 0).inputPhanSo();
        System.out.println("Nhap phan so thu hai: ");
        Bai3 phanSo2 = new Bai3(0, 0).inputPhanSo();

        Bai3 sum = phanSo1.add(phanSo1, phanSo2);
        System.out.println("Tong hai phan so: ");
        sum.outPut();

        Bai3 sub = phanSo1.substract(phanSo1, phanSo2);
        System.out.println("Hieu hai phan so: ");
        sub.outPut();
    } //Phep cong, tru phan so
    public void Bai4(){
        Scanner in = new Scanner(System.in);
        String x, y;
        System.out.println("Nhap chuoi x: ");
        x = in.nextLine();
        System.out.println("Nhap chuoi y: ");
        y = in.nextLine();

        System.out.println("Do dai chuoi x: " + x.length());

        String s1 = x.substring(0, 3);
        System.out.println("3 ky tu dau tien cua chuoi x: " + s1);

        String s2 = x.substring(x.length() - 3);
        System.out.println("3 ky tu cuoi cung cua chuoi x: " + s2);

        char s3 = x.charAt(5);
        System.out.println("Ky tu thu 6 cua chuoi x: " + s3);

        String s4 = x.substring(0,3) + y.substring(y.length() - 3);
        System.out.println("Chuoi moi la: " + s4);

        if (x.equals(y)){
            System.out.println("Hai chuoi bang nhau (Phan biet chu hoa, thuong)");
        }
        else {
            System.out.println("Hai chuoi khong bang nhau (Phan biet chu hoa, thuong)");
        }

        if (x.equalsIgnoreCase(y)){
            System.out.println("Hai chuoi bang nhau (Khong phan biet chu hoa, thuong)");
        }
        else {
            System.out.println("Hai chuoi khong bang nhau (Khong phan biet chu hoa, thuong)");
        }

        int s5 = x.indexOf(y);
        if (s5 == -1){
            System.out.println("Chuoi y khong co trong chuoi x");
        }
        else {
            System.out.println("Chuoi y co trong chuoi x");
        }
    } //Xu ly chuoi
    public void Bai5(){
        int soDien;
        int tongTien;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so dien tieu thu: ");
        soDien = in.nextInt();
        if (soDien <= 50){
            tongTien = soDien * 2000;
        }
        else if (soDien <= 100) {
            tongTien = 50 * 2000 + (soDien - 50) * 2500;
        }
        else {
            tongTien = 50 * 2000 + 50 * 2500 + (soDien - 100) * 3500;
        }
        System.out.println("Tong so tien dien: " + tongTien);
    } //Tinh tien dien
}

