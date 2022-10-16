public class Endereco {

    private String cep;
    private String complemento;

    public Endereco(String cep, String complemento) {
        this.cep = cep;
        this.complemento = complemento;
    }

    public Endereco() {
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep = '" + cep + '\'' +
                ", complemento = '" + complemento + '\'' +
                '}';
    }
}
