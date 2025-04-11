package sistemabancario;

public class CaixaEletronico {
    public static void emitirNotas(double valor) {
        int[] notas = {100, 50, 20, 10, 5, 2};
        int valorRestante = (int) valor;

        System.out.println("Notas fornecidas:");
        for (int nota : notas) {
            int quantidade = valorRestante / nota;
            if (quantidade > 0) {
                System.out.println(quantidade + " nota(s) de R$" + nota);
                valorRestante %= nota;
            }
        }

        if (valorRestante > 0) {
            System.out.println("Valor restante não pode ser entregue em notas: R$" + valorRestante);
        }
    }
}