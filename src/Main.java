import java.util.Random;

public class Main {
    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            System.out.println("Можно идти гулять");
            return "Можно идти гулять";
        } else {
            System.out.println("Оставайтесь дома");
            return "Оставайтесь дома";
        }

    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
}