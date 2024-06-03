package Model;

public class ReconhecimentoImagem {
    private int idImagem;
    private String dataCaptura;
    private String especieIdentificada;

    public ReconhecimentoImagem(int idImagem, String dataCaptura, String especieIdentificada) {
        this.idImagem = idImagem;
        this.dataCaptura = dataCaptura;
        this.especieIdentificada = especieIdentificada;
    }

    public int getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }

    public String getDataCaptura() {
        return dataCaptura;
    }

    public void setDataCaptura(String dataCaptura) {
        this.dataCaptura = dataCaptura;
    }

    public String getEspecieIdentificada() {
        return especieIdentificada;
    }

    public void setEspecieIdentificada(String especieIdentificada) {
        this.especieIdentificada = especieIdentificada;
    }
}
