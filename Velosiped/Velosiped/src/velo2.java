import java.util.Scanner;

public class velo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Başlangıç bilgileri
        System.out.print("Toplam məsafə (km): ");
        double totalDistance = scanner.nextDouble();
        double remainingDistance = totalDistance;

        // Başlangıç dişli (transmission) və sürət
        double speed = 0;
        double totalTime = 0; // Toplam vaxt (saat)
        double distanceCovered = 0;

        System.out.println("Başlanğıc dişlisi (skorost, transmission)  0'dır. Dişlini artırmaq üçün +, azaltmaq üçün - daxil edin.");

        // Simulasiya döngüsü
        while (remainingDistance > 0) {
            System.out.print("Dişli (artırmaq üçün +, azaltçaq üçün -): ");
            char gearChange = scanner.next().charAt(0);

            // Dişli dəyişimi və sürətin idarə edilməsi
            switch (gearChange) {
                case '+':
                    speed += 5; // Dişli artırdığınızda sürət 5 km/saat artır
                    break;
                case '-':
                    speed = Math.max(0, speed - 5); // Dişli azaldanda sürət 5 km/saat azalır, sürət 0'ın altına düşməsin
                    break;
                default:
                    System.out.println("Yanlış dişli seçimi.");
                    continue;
            }

            // Məsafə hesablama
            System.out.print("Keçən vaxt (dəqiqə): ");
            double timeInMinutes = scanner.nextDouble();
            double timeInHours = timeInMinutes / 60.0;
            distanceCovered = speed * timeInHours;

            if (distanceCovered > remainingDistance) {
                distanceCovered = remainingDistance;
            }

            remainingDistance -= distanceCovered;
            totalTime += timeInHours;

            System.out.println("Hal-hazırdakı sürət: " + speed + " km/saat");
            System.out.println("Əhatə edən mədafə: " + distanceCovered + " km");
            System.out.println("Qalan məsafə: " + remainingDistance + " km");
        }

        // Ortalama sürət hesablama
        double averageSpeed = totalDistance / totalTime;
        System.out.println("Gedəcəyiniz yerə çatdınız!");
        System.out.println("Toplam keçən vaxt: " + totalTime + " saat");
        System.out.println("Ortalama sürət: " + averageSpeed + " km/saat");
    }
}

