import java.util.ArrayList;
import java.util.List;

public class ContaTerminal {
    public static void main(String[] argv) {
        int option = 0;
        List<Cliente> Clientes = new ArrayList<>();

        while (option != 3) {
            IO.printMenuPrincipal();

            option = IO.getInt("Opção: ", 1, 3);

            if (option == 1) {
                Cliente cliente = new Cliente();
                cliente.registerClient();
                Clientes.add(cliente);

            } else if (option == 2) {
                for (Cliente cliente : Clientes) {
                    System.out.printf(
                            "Nome: %s\nNúmero: %d\nAgência: %s\nSaldo: %f\n\n",
                            cliente.getName(),
                            cliente.getNumber(),
                            cliente.getAgency(),
                            cliente.getBalance()
                    );
                }
            }
        }
    }
}

