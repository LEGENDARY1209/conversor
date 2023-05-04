import java.util.Scanner;

public class Conversor{

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Converter Celsius para Fahrenheit");
            System.out.println("2 - Converter Fahrenheit para Celsius");
            System.out.println("3 - Sair");
            System.out.print("Opção escolhida: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em graus Celsius: ");
                    double temperaturaCelsius = scanner.nextDouble();
                    double Celsius;
                    double temperaturaFahrenheit = celsiusToFahrenheit (temperaturaCelsius);
                    System.out.printf("%.2f graus Celsius correspondem a %.2f graus Fahrenheit\n", temperaturaCelsius, temperaturaFahrenheit);
                    break;
                case 2:
                    System.out.print("Digite a temperatura em graus Fahrenheit: ");
                    double temperaturaFahrenheit2 = scanner.nextDouble();
                    double temperaturaCelsius2 = (double) fahrenheitToCelsius(temperaturaFahrenheit2);
                    System.out.printf("%.2f graus Fahrenheit correspondem a %.2f graus Celsius\n", temperaturaFahrenheit2, temperaturaCelsius2);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }



public static double celsiusToFahrenheit(double celsius) {
return (celsius * 1.8) + 32;
}

/**
 * @param fahrenheit
 * @return
 */
public static double fahrenheitToCelsius(double fahrenheit) {
return (fahrenheit - 32) / 1.8;
}

@Override
public String toString() {
    return "Conversor []";
}
}

