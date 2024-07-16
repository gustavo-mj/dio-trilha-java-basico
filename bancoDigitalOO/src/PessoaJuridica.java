public class PessoaJuridica implements Cliente {

    protected String nomeFantasia;
    protected String CNPJ;

    public PessoaJuridica(String nomeFantasia, String CNPJ) {
        this.nomeFantasia = nomeFantasia;
        this.CNPJ = CNPJ;
    }

    @Override
    public String getName() {
        return nomeFantasia;
    }

    @Override
    public String getId() {
        return CNPJ;
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica{" +
                "Nome Fantasia ='" + nomeFantasia + '\'' +
                ", CNPJ ='" + CNPJ + '\'' +
                '}';
    }
}
