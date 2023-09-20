public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String cep;
    private String email;
    private String rg;
    private String dataNascimento;

    public Cliente(String nome, String cpf, String telefone, String cep, String email, String rg, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cep = cep;
        this.email = email;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCep() {
        return cep;
    }

    public String getEmail() {
        return email;
    }

    public String getRg() {
        return rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
