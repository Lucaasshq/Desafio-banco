import java.util.ArrayList;
import java.util.List;

public class Banco {

   List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<Cliente>();
    }

    public void listarClientes(Banco b) {
        for (Cliente c : b.clientes) {
            System.out.println("Cliente: " + c.getNome());
        }

    }



    public static void main(String[] args) {
        Banco banco = new Banco();


        Cliente cliente = new Cliente("Lucas", "65241475", new ContaCorrente());
        Cliente cliente2 = new Cliente("Matheus", "111111", new ContaPoupanca());
        Conta lucas = new ContaCorrente();
        Conta matheus = new ContaPoupanca();

        // área do cliente
        matheus.depositar(400);
        lucas.depositar(200.0);
        matheus.transferir(400.0, lucas);
        lucas.mostrarDados();
        System.out.println("==============");
        matheus.mostrarDados();
        // área do banco
        banco.clientes.add(cliente);
        banco.clientes.add(cliente2);
        banco.listarClientes(banco);







    }
}



