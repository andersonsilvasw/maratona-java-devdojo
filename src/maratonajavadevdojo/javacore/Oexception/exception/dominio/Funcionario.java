package maratonajavadevdojo.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {
    public void salvar()throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando funcionário");
    }
}
