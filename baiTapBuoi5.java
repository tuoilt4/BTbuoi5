import java.util.Random;
import java.util.Scanner;
public class baiTapBuoi5 {
    public static void kiemtra() {
        Random ran = new Random();
        int n = ran.nextInt(10);
        if (baiTapBuoi4.checkSnt(n)) {
            System.out.print("Số " + n + " là số nguyên tố");
            System.out.printf("\nGiai thừa của " + n + " là: %d", baiTapBuoi4.tinhGtFor(n));
        } else {
            System.out.print("Số " + n + " không là số nguyên tố");
        }
    }

    public static void demkytu (String chuoi) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("\nNhập ký tự cần tìm trong chuỗi:");
        String kyTu =scanner.nextLine();
        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            String c = String.valueOf(chuoi.charAt(i));
            if (c.equals(kyTu) ){
                dem=dem+1;
            }
        }
        System.out.print("Số lần xuất hiện của ký tự " + kyTu +" trong chuỗi " + chuoi + ": " + dem);
    }

    public static void timchuoi (String chuoi) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("\nNhập ký tự cần tìm trong chuỗi:");
        //sc.nextLine();
        String kyTu = sc.nextLine();
        System.out.print("\nVị trí xuất hiện của ký tự " + kyTu + " trong chuỗi " + chuoi + ":");
        for (int i = 0; i < chuoi.length(); i++) {
            String c = String.valueOf(chuoi.charAt(i));
            if (c.equals(kyTu)){
                System.out.print(i +"\t");
            }
            else {
                System.out.print("\n Không có ký tự cần tìm trong chuỗi");
            }
        }
    }


    public static void demtu(String chuoi) {
        int dem = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập vào chuỗi cần đếm số từ: ");
        chuoi = scanner.nextLine();
        String chuoich ;
        chuoich = chuoi.trim();
        chuoich = chuoich.replaceAll("\\s+"," ");
        for (int i = 0; i < chuoich.length(); i++) {
            char kyTu = chuoich.charAt(i);
            if (Character.isSpaceChar(kyTu)) {
                dem++;
            }
        }
        System.out.print("Số từ trong chuỗi " + chuoi + ": " + dem);
    }

    public static void bangcuuchuong () {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("\nNhập số cần in bảng cửu chương: ");
//        int n = scanner.nextInt();
        for (int i = 0; i < 10; i++){
            for (int j=0;j<10;j++){
                System.out.printf("\n%d * %d = %d", i, j, i*j);
            }
            System.out.println();
        }
    }

    public static void kttamgiac() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập thông tin ba cạnh của tam giác: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a1 = a * a;
        int b1 = b * b;
        int c1 = c * c;
        if (a == b & b == c) {
            System.out.printf("Tam giác có ba canh %d, %d, %d là tam giác đều", a, b, c);
        } else if (a == b| a == c|b == c) {
           System.out.printf("Tam giác có ba canh %d, %d, %d là tam giác cân", a, b, c);
        } else if ((a1 + b1 == c1) | (a1 + c1 == b1) | (b1 + c1 == a1)) {
            System.out.printf("Tam giác có ba canh %d, %d, %d là tam giác vuông", a, b, c);
        } else {
           System.out.printf("Tam giác có ba canh %d, %d, %d là tam giác thường", a, b, c);
       }
    }

    public static void tinhtongso() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số cần tính cổng các chữ số: ");
        int n = sc.nextInt();
        int st;
        int tong=0;
        for (int i=0 ;i<n;i--){
            st= n%10;
            tong = tong +st;
            n= n/10;
        }
        System.out.printf ("Tổng các ký tự số là: %d",tong);
    }
    public static void phantichso() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số cần phân tích: ");
        int n = sc.nextInt();
        for (int i=2 ;i<=n;i++) {
            while (n % i == 0) {
                n /= i;
                System.out.print(i + "x");
            }
        }
    }
    public static void giaiphuongtrinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập các tham số a, b: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c=b/a;
        if(a==0) {System.out.printf("Nghiệm phương trình là: %.2f",-b);}
        else {System.out.printf("Nghiệm phương trình là: %.2f ",-c);}
    }
    public static void chuanhoacau(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập câu cần chuẩn hóa: ");
        String chuoibd= sc.nextLine();
        String chuoich ;
        chuoich = chuoibd.trim();
        chuoich = chuoich.replaceAll("\\s+"," ");
        System.out.print("Câu đã chuẩn hóa: "+chuoich);

    }
}