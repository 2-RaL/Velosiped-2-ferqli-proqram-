import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velosipedinizin sürətini hesablayın!");
        System.out.print("Getmək istədiyiniz məsafə (km): ");
        double distance = scanner.nextDouble();
        System.out.print("Yolda sərf etmək istədiyiniz zaman (saat): ");
        double time = scanner.nextDouble();

        if (time != 0) {
            double speed = distance / time;
            System.out.println("Ortalama sürət: " + speed + " km/saat");
        } else {
            System.out.println("Zaman 0 ola bilməz.");
        }
    }
}
