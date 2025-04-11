package sistemabancario;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String titular, int numeroConta) {
        super(titular, numeroConta);
    }

    @Override
    public boolean sacar(double valor) {
        System.out.println("Tentando sacar: R$ " + valor);
        return super.sacar(valor);
    }
}