public class PessoaFisica implements Cliente{
    protected String nome;
    protected String CPF;

    public PessoaFisica(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    @Override
    public String getName() {
        return nome;
    }

    @Override
    public String getId() {
        return CPF;
    }

    @Override
    public String toString() {
        return "Pessoa Física{" +
                "Nome ='" + nome + '\'' +
                ", CPF ='" + CPF + '\'' +
                '}';
    }
}
