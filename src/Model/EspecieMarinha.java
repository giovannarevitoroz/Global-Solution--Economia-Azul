package Model;

public class EspecieMarinha {
    private int idEspecie;
    private String nomeCientifico;
    private String nomeComum;
    private boolean statusConservacao;
    private String descricaoEspecie;

    public EspecieMarinha(int idEspecie, String nomeCientifico, String nomeComum, boolean statusConservacao, String descricaoEspecie) {

        this.idEspecie = idEspecie;
        this.nomeCientifico = nomeCientifico;
        this.nomeComum = nomeComum;
        this.statusConservacao = statusConservacao;
        this.descricaoEspecie = descricaoEspecie;
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getNomeComum() {
        return nomeComum;
    }

    public void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }

    public boolean isStatusConservacao() {
        return statusConservacao;
    }

    public void setStatusConservacao(boolean statusConservacao) {
        this.statusConservacao = statusConservacao;
    }

    public String getDescricaoEspecie() {
        return descricaoEspecie;
    }

    public void setDescricaoEspecie(String descricaoEspecie) {
        this.descricaoEspecie = descricaoEspecie;
    }
}

