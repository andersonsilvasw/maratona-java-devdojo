package maratonajavadevdojo.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereço endereço;
    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereço.getRua() + " " + this.endereço.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}
