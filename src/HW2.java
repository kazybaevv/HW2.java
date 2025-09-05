import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        int age = generateRandomAge();
 int temperature = generateRandomtemperature();
        System.out.println(permission(age,temperature));
        System.out.println("Случайный возраст: " + age);
        System.out.println("Случайная температура: " + temperature);

        // входные данные (примеры)
        System.out.println(permission(25,20));
        System.out.println(permission(15,10));
        System.out.println(permission(50,20));
        System.out.println(permission(10,-5));
        System.out.println(permission(30,40));

    }
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(50) + 1; //Возраст от 1 до 50

    }
    public static int generateRandomtemperature(){
        Random random = new Random();
        return random.nextInt(71) - 30;
    }
    public static String permission(int age, int temperature){
        if((age >=20 && age <=45 && temperature >=-20 && temperature <=30) ||
                (age < 20 &&  temperature >=0 && temperature <=28)||
            (age > 45 && temperature >=-10 && temperature <=25)) {
            return "Можно идти гулять";

        } else {
            return "Оставайтесь дома";

        }
    }
    }
