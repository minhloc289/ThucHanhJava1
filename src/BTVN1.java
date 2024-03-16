import java.util.Scanner;
public class BTVN1 {
    public void Bai1(){
        class Bai1 {
            public int UCLN(int a, int b){
                a = Math.abs(a);
                b = Math.abs(b);
                if (a * b == 0)
                    return a + b;
                if (a < b)
                    return UCLN(a, b % a);
                else
                    return UCLN(a % b, b);
            }
            public void B1(){
                Scanner in = new Scanner(System.in);
                System.out.println("Nhap so a: ");
                int a = in.nextInt();
                System.out.println("Nhap so b: ");
                int b = in.nextInt();
                System.out.println("UCLN cua " + a + " va " + b + " la: " + UCLN(a, b));
            }
        }
        Bai1 b1 = new Bai1();
        b1.B1();
    } //tim uoc chung lon nhat
    public void Bai2(){
        class Bai2 {
            public int UCLN(int a, int b){
                a = Math.abs(a);
                b = Math.abs(b);
                if (a * b == 0)
                    return a + b;
                if (a < b)
                    return UCLN(a, b % a);
                else
                    return UCLN(a % b, b);
            }
            public int BSCNN(int a, int b){
                a = Math.abs(a);
                b = Math.abs(b);
                return a * b / UCLN(a, b);
            }
            public void B2(){
                Scanner in = new Scanner(System.in);
                System.out.println("Nhap so a: ");
                int a = in.nextInt();
                System.out.println("Nhap so b: ");
                int b = in.nextInt();
                System.out.println("BSCNN cua " + a + " va " + b + " la: " + BSCNN(a, b));
            }
        }
        Bai2 b2 = new Bai2();
        b2.B2();
    } //tim boi so chung nho nhat
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
        Bai3 phanSo = new Bai3(0, 0);
        phanSo = phanSo.inputPhanSo();
        System.out.println("Ket qua toi gian cua phan so");
        phanSo.outPut();
    } //rut gon phan so
    public void Bai4(){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = in.nextInt();
        System.out.println("Cac uoc so cua " + n + " la: ");
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.printf("%4d", i);
            }
        }
    } //tim tat ca cac uoc cua n
}
