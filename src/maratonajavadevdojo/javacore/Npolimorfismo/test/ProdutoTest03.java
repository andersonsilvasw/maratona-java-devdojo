package maratonajavadevdojo.javacore.Npolimorfismo.test;

import maratonajavadevdojo.javacore.Npolimorfismo.dominio.Computador;
import maratonajavadevdojo.javacore.Npolimorfismo.dominio.Produto;
import maratonajavadevdojo.javacore.Npolimorfismo.dominio.Tomate;
import maratonajavadevdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
