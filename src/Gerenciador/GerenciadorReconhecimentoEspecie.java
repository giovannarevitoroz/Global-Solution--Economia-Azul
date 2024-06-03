package Gerenciador;

import Model.EspecieMarinha;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorReconhecimentoEspecie {

    private List<EspecieMarinha> listaEspecies;

    public GerenciadorReconhecimentoEspecie() {
        this.listaEspecies = new ArrayList<>();
    }

    public void adicionarEspecie(EspecieMarinha especie) {
        listaEspecies.add(especie);
    }

    public void reconhecerEspecie(EspecieMarinha especie) {
        if (especie.isStatusConservacao()) {
            System.out.println("A espécie " + especie.getNomeComum() + " está em risco de extinção.");
        } else {
            System.out.println("A espécie " + especie.getNomeComum() + " não está em risco de extinção.");
        }

        if (especie.getDescricaoEspecie().contains("rara")) {
            System.out.println("A espécie " + especie.getNomeComum() + " é considerada rara.");
        } else if (especie.getDescricaoEspecie().contains("endêmica")) {
            System.out.println("A espécie " + especie.getNomeComum() + " é considerada endêmica.");
        } else {
            System.out.println("A espécie " + especie.getNomeComum() + " não tem um status de conservação especial.");
        }
    }

    public void listarEspecies() {
        for (EspecieMarinha especie : listaEspecies) {
            System.out.println("ID: " + especie.getIdEspecie() + " - Nome Científico: " + especie.getNomeCientifico() + " - Nome Comum: " + especie.getNomeComum());
        }
    }
}