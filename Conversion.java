import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){
        char response = 'O';
        while (response == 'O')
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choice your conversion mode : \n" +
                "1- Conversion Celsius - Fahrenheit \n" +
                "2- Conversion Fahrenheit - Celsius \n" + "Votre choice : " );
            int choice = sc.nextInt();
            sc.nextLine();
            double temperatureEnCelsius, temperatureEnFahrenheit;
            if(choice == 1) {
                System.out.println("Température à convertir (en degrés Celsius): ");
                temperatureEnCelsius = sc.nextDouble();
                sc.nextLine();
                temperatureEnFahrenheit = (9.0/5.0*temperatureEnCelsius) + 32;
                System.out.println( temperatureEnCelsius + " o C vaut " + temperatureEnFahrenheit + " o F.");
            } else if (choice == 2) {
                System.out.println("Température à convertir (en degrés Fahrenheit): ");
                temperatureEnFahrenheit = sc.nextDouble();
                sc.nextLine();
                temperatureEnCelsius = (temperatureEnFahrenheit-32)*5/9;
                System.out.println( temperatureEnFahrenheit + " o F vaut " + temperatureEnCelsius + " o C.");
            }
            response = ' ';
            while (response != 'O' && response != 'N'){
                System.out.println("Souhaitez-vous convertir une autre température ? (O/N)");
                response = sc.nextLine().charAt(0);
            }
        }
        System.out.println("Merci d'avoir jouer. Bye ! ");
    }
}
