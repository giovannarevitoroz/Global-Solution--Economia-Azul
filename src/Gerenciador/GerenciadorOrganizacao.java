package Gerenciador;

import java.util.ArrayList;
import java.util.List;
import Model.Organizacao;

public class GerenciadorOrganizacao {
    private List<Organizacao> organizacoes;

    public GerenciadorOrganizacao() {
        this.organizacoes = new ArrayList<>();
    }

    public void cadastrarOrganizacao(Organizacao organizacao) {
        organizacoes.add(organizacao);
    }

    public int getPontosOrganizacao(String cnpjOrganizacao) {
        for (Organizacao organizacao : organizacoes) {
            if (organizacao.getCnpjOrganizao().equals(cnpjOrganizacao)) {
                return organizacao.getPontosOrganizacao();
            }
        }
        return 0;
    }

    public Organizacao buscarOrganizacaoPorCnpj(String cnpjOrganizacao) {
        for (Organizacao organizacao : organizacoes) {
            if (organizacao.getCnpjOrganizao().equals(cnpjOrganizacao)) {
                return organizacao;
            }
        }
        return null;
    }

    public List<Organizacao> listarOrganizacoes() {
        return organizacoes;
    }
}