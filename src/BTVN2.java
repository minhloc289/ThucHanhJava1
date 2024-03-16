import java.util.Arrays;
import java.util.Scanner;
public class BTVN2 {
    public void Bai1() {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Nhap so n: ");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Cac phan tu cua mang A: ");
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int m;
        System.out.println("Nhap so m: ");
        m = in.nextInt();
        int[] b = new int[m];
        System.out.println("Cac phan tu ngau nhien cua mang B: ");
        for (int i = 0; i < m; i++) {
            b[i] = (int) (Math.random() * 100);
            System.out.print(b[i] + " ");
        }

        //tao mang C tu mang A (copy A qua C)
        int[] c = Arrays.copyOf(a, n);

        //Thay the phan tu thu 1 -> 3 cua mang C bang 3 phan tu cuoi mang B
        System.arraycopy(b, m - 3, c, n - 3, 3);

        //In mang C
        System.out.println("\nMang C sau khi thay the: ");
        Arrays.sort(c);
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }
    }
    public void Bai2(){
        class Bai2{
            public boolean isPrime(int n){
                if (n < 2) return false;
                for (int i = 2; i <= Math.sqrt(n); i++){
                    if (n % i == 0) return false;
                }
                return true;
            }
            public void input(int[][] a, int n, int m){
                Scanner in = new Scanner(System.in);
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < m; j++){
                        while(true){
                            int input = in.nextInt();
                            if (input > 0 && input < 100){
                                a[i][j] = input;
                                break;
                            }
                            else
                                System.out.println("Cac phan tu la nhung so nguyen lon hon 0 va nho hon 100");
                        }
                    }
                }
            }
            public void findMax(int[][] a, int n, int m){
                int max = a[0][0];
                int index_i = 0, index_j = 0;
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < m; j++){
                        max = Math.max(max, a[i][j]);
                        index_i = i;
                        index_j = j;
                    }
                }
                System.out.println("Phan tu lon nhat cua mang A o dong " + (index_i + 1) + ",cot " + (index_j + 1) + ",chi so: " + max);
            }
            public void findPrimeNumber(int[][] a, int n, int m){
                boolean flag = true;
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < m; j++){
                        if (!isPrime(a[i][j])){
                            a[i][j] = 0;
                        }
                        else
                            flag = false;
                    }
                }
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < m; j++){
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
                if (flag){
                    System.out.println("Mang A khong co so nguyen to");
                }
            }
            public void SortColumn(int[][] a, int n, int m){
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < m; j++){
                        for (int k = i + 1; k < n; k++){
                            if (a[i][j] > a[k][j]){
                                int temp = a[i][j];
                                a[i][j] = a[k][j];
                                a[k][j] = temp;
                            }
                        }
                    }
                }
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < m; j++){
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        Scanner in = new Scanner(System.in);
        int n,m;
        System.out.println("Nhap so dong: ");
        n = in.nextInt();
        System.out.println("Nhap so cot: ");
        m = in.nextInt();
        int[][] a = new int[n][m];
        Bai2 b2 = new Bai2();
        b2.input(a,n,m);
        b2.findMax(a,n,m);
        System.out.println("Mang A sau khi thay the cac so khong phai so nguyen to bang 0: ");
        b2.findPrimeNumber(a,n,m);
        System.out.println("Mang A sau khi sap xep theo cot: ");
        b2.SortColumn(a,n,m);
    }
}
