package Model;

public class Doacao {
    private int idDoacao;
    private String data;
    private double quantiaDoacao;
    private String formaPagamento;

    public Doacao(int idDoacao, String data, double quantia, String formaPagamento) {
        this.idDoacao = idDoacao;
        this.data = data;
        this.quantiaDoacao = quantia;
        this.formaPagamento = formaPagamento;
    }

    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getQuantia() {
        return quantiaDoacao;
    }

    public void setQuantia(double quantiaDoacao) {
        this.quantiaDoacao = quantiaDoacao;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
