import java.util.Scanner;

public class IO {
    public static Double getDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        double input = 0.0;
        boolean valid = false;

        while (!valid) {
            System.out.println(message);

            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                valid = true;
            } else {
                System.out.println("\nEntrada inválida. Por favor, digite um decimal válido.");
            }
        }

        return input;
    }

    public static int getInt(String message) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean valid = false;

        while(!valid) {
            System.out.println(message);

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                valid = true;
            } else {
                scanner.next();
            }
        }

        return input;
    }

    public static int getInt(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean valid = false;

        while(!valid) {
            System.out.println(message);

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    valid = true;
                }
            } else {
                scanner.next();
            }
        }

        return input;
    }

    public static String getString(String message) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        String input = "";

        while (!valid) {
            System.out.println(message);
            input = scanner.nextLine();

            if (!input.isEmpty()) {
                valid = true;
            }
        }

        return input.trim();
    }

    public static void printMenuPrincipal() {
        System.out.println("""
                [1] Cadastrar novo cliente
                [2] Listar clientes
                [3] Sair
                """);
    }
}
