package Model;

public class Organizacao {

    private String cnpjOrganizao;
    private String nomeOrganizacao;
    private String missao;
    private String tipoOrganizacao;
    private int pontosOrganizacao;

    public Organizacao(String cnpjOrganizao, String nome, String missao, String tipoOrganizacao) {
        this.cnpjOrganizao = cnpjOrganizao;
        this.nomeOrganizacao = nome;
        this.missao = missao;
        this.tipoOrganizacao = tipoOrganizacao;
    }

    public String getCnpjOrganizao() {
        return cnpjOrganizao;
    }

    public void setCnpjOrganizao(String cnpjOrganizao) {
        this.cnpjOrganizao = cnpjOrganizao;
    }

    public String getNomeOrganizacao() {
        return nomeOrganizacao;
    }

    public void setNomeOrganizacao(String nomeOrganizacao) {
        this.nomeOrganizacao = nomeOrganizacao;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getTipoOrganizacao() {
        return tipoOrganizacao;
    }

    public void setTipoOrganizacao(String tipoOrganizacao) {
        this.tipoOrganizacao = tipoOrganizacao;
    }

    public int getPontosOrganizacao() {
        return pontosOrganizacao;
    }

    public void setPontosOrganizacao(int pontosOrganizacao) {
        this.pontosOrganizacao = pontosOrganizacao;
    }
}
