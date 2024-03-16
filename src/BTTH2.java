import java.util.Arrays;
import java.util.Scanner;
public class BTTH2 {
    public void Bai1(){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Nhap so n: ");
        n = in.nextInt();
        boolean ok = true;
        for (int i = 2; i < n - 1; i++){
            if (n % i == 0){
                ok = false;
                break;
            }
        }
        if (ok){
            System.out.println("La so nguyen to.");
        }
        else System.out.println("Khong phai la so nguyen to");
    } //Kiem tra so nguyen to
    public void Bai2(){
        System.out.println("x ");
        for (int i = 1; i <= 10; i++){
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%2d", i);
            for (int j = 1; j <= 10; j++){
                int res = i * j;
                System.out.printf("%4d", res);
            }
            System.out.println();
        }
    } //Bang cuu chuong
    public void Bai3(){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Cac phan tu cua mang A: ");
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        //Xuat mang
        System.out.println("Cac phan tu trong mang: " + Arrays.toString(a));

        //Tim max, min
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < n; i++){
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }
        System.out.println("Phan tu lon nhat trong mang: " + max);
        System.out.println("Phan tu nho nhat trong mang: " + min);

        //Tim phan tu x trong mang
        int x;
        System.out.println("Nhap so x: ");
        x = in.nextInt();
        if (Arrays.binarySearch(a,x) >= 0){
            System.out.println("Mang co chua phan tu " + x);
        }
        else System.out.println("Mang khong chua phan tu " + x);

        //Dem so lan xuat hien cua phan tu x trong mang
        int count = 0;
        for (int i = 0; i < n; i++){
            if (a[i] == x){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua phan tu " + x + " trong mang: " + count);

        //Sap xep mang
        Arrays.sort(a);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(a));
    } //mang 1 chieu
    public void Bai4(){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = in.nextInt();
        int[][] a = new int[n][n];

        //Nhap mang
        System.out.println("Nhap mang 2 chieu: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = in.nextInt();
            }
        }

        //Xuat mang
        System.out.println("Mang 2 chieu vua nhap: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        //tim min
        int min = a[0][0];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                min = Math.min(min, a[i][j]);
            }
        }
        System.out.println("Phan tu nho nhat trong mang: " + min);

        //sap xep cac phan tu tren tung dong tang dan
        for (int i = 0; i < n; i++){
            Arrays.sort(a[i]);
        }
        System.out.println("Mang 2 chieu sau khi sap xep cac phan tu tren tung dong tang dan: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        //sap cac phan tu tren duong cheo chinh tang dan
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int MIN = a[i][i];
                if (a[i][i] > a[j][j]){
                    MIN = a[j][j];
                    a[j][j] = a[i][i];
                    a[i][i] = MIN;
                }
            }
        }
        System.out.println("Mang 2 chieu sau khi sap xep cac phan tu tren duong cheo chinh tang dan: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

    } //mang 2 chieu
}

