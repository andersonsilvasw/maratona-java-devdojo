package maratonajavadevdojo.javacore.Npolimorfismo.test;

import maratonajavadevdojo.javacore.Npolimorfismo.dominio.Computador;
import maratonajavadevdojo.javacore.Npolimorfismo.dominio.Tomate;
import maratonajavadevdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC1017", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
