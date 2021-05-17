import javax.script.ScriptContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String chuoia = "You only live once, but if you do it right, once is enough";

        System.out.print("Nhập chương trình muốn chạy: ");
        int o = scanner.nextInt();
        switch (o) {
            case 1: {
                System.out.print("Kiểm tra một số ngẫu nhiên có phải là số nguyên tố và tính giai thừa");
                baiTapBuoi5.kiemtra();
                break;
            }
            case 2: {
                System.out.print("Tìm tất cả vị trí của một ký tự nhập từ bàn phím trong chuỗi có sẵn");
                baiTapBuoi5.timchuoi(chuoia);
                break;
            }
            case 3: {
                System.out.print("Đếm số lần xuất hiện của một ký tự nhập từ bàn phím trong chuỗi có sẵn");
                baiTapBuoi5.demkytu(chuoia);
                break;
            }
            case 4: {
                System.out.print("Đếm số từ trong câu nhập từ bàn phím");
                baiTapBuoi5.demtu(chuoia);
                break;
            }
            case 5: {
                System.out.print("In ra bảng cứu chương");
                baiTapBuoi5.bangcuuchuong();
                break;
            }
            case 6: {
                System.out.print("Tính giai thừa nhập từ ban phím");
                System.out.print("Nhập số giai thừa cần tính: ");
                int m = scanner.nextInt();
                System.out.printf("Giai thừa của " + m + " theo vòng lặp for là: %d\n", baiTapBuoi4.tinhGtFor(m));
                break;
            }
            case 7: {
                System.out.print("Liệt kê n số nguyên tố đầu tiên với n nhập từ bàn phím");
                System.out.print("\nNhập n số nguyên tố cần liệt kê: ");
                int h = scanner.nextInt();
                baiTapBuoi4.ChuoiSnt3(h);
                break;
            }
            case 8: {
                System.out.print("Liệt kê các số nguyên tố nhỏ hơn 100");
                baiTapBuoi4.ChuoiSnt1(100);
                break;
            }
            case 9: {
                System.out.print("Kiểm tra tam giác");
                baiTapBuoi5.kttamgiac();
                break;
            }
            case 10: {
                System.out.print("Tính tổng các ký tự của số đã nhập từ bàn phím");
                baiTapBuoi5.tinhtongso();
                break;
            }
            case 11: {
                System.out.print("Phân tích số nhập từ bàn phím thành các thừa số nguyên tố");
                baiTapBuoi5.phantichso();
                break;
            }
            case 12: {
                System.out.print("Giải phương trình bậc nhất ax+b=0");
                baiTapBuoi5.giaiphuongtrinh();
                break;
            }
            case 13: {
                System.out.print("Chuẩn hóa câu");
                baiTapBuoi5.chuanhoacau();
                break;
            }
            default:
            { System.out.print("Không có chương trình chạy");}
        }
        /*
        System.out.print("Nhập số lượng giai thừa cần tính: ");
        int m = scanner.nextInt();
        System.out.printf("Giai thừa của " + m + " theo vòng lặp for là: %d\n", baiTapBuoi4.tinhGtFor(m));
        System.out.printf("Giai thừa của " + m + " theo vòng lặp while là: %d\n", baiTapBuoi4.tinhGtFor(m));
        System.out.printf("Giai thừa của " + m + " theo vòng lặp do là: %d\n", baiTapBuoi4.tinhGtWhile(m));

        System.out.println("Liệt kê các số nguyên tố nhỏ hơn 100 theo vòng lặp for:");
        baiTapBuoi4.ChuoiSnt1(100);

        System.out.println("\nLiệt kê các số nguyên tố nhỏ hơn 100 theo vòng lặp while:");
        baiTapBuoi4.ChuoiSnt2(100);

        System.out.println("\nLiệt kê các số nguyên tố nhỏ hơn 100 theo vòng lặp do:");
        baiTapBuoi4.ChuoiSnt3(100);

        System.out.print("\nNhập số lương số nguyên tố cần liệt kê: ");
        int h = scanner.nextInt();

        System.out.print("Liệt kê theo vòng lặp for: ");
        baiTapBuoi4.ChuoiSnt4(h);

        System.out.print("\nLiệt kê theo vòng lặp while: ");
        baiTapBuoi4.ChuoiSnt5(h);

        System.out.print("\nLiệt kê theo vòng lặp do: ");
        baiTapBuoi4.ChuoiSnt6(h);

         */

    }
}