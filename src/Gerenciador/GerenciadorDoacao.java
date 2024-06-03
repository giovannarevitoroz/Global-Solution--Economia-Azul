package Gerenciador;

import Model.Doacao;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDoacao {
    private List<Doacao> doacoes;

    public GerenciadorDoacao() {
        this.doacoes = new ArrayList<>();
    }

    public void registrarDoacao(Doacao doacao) {
        doacoes.add(doacao);
    }

    public List<Doacao> listarDoacoes() {
        return doacoes;
    }

    public void AtualizarDoacao(int idDoacao, double novaQuantia) {
        for (Doacao doacao : doacoes) {
            if (doacao.getIdDoacao() == idDoacao) {
                doacao.setQuantia(novaQuantia);
                break;
            }
        }
    }
}