package Main;

import Gerenciador.*;
import Model.*;

import java.util.List;

public class App {
    public static void main(String[] args) {
        GerenciadorDenuncia gerenciadorDenuncia =  new GerenciadorDenuncia();
        GerenciadorOrganizacao gerenciadorOrg = new GerenciadorOrganizacao();
        GerenciadorRecibo gerenciadorRecibo = new GerenciadorRecibo();
        GerenciadorRecompensa gerenciadorRecompensa = new GerenciadorRecompensa();
        GerenciadorReconhecimentoEspecie gerenciadorRecEspec = new GerenciadorReconhecimentoEspecie();
        GerenciadorDoacao gerenciadorDoacao = new GerenciadorDoacao();
        GerenciadorIlhaLixo gerenciadorIlhaLixo = new GerenciadorIlhaLixo();
        GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();


        //ORGANIZAÇÃO

        // Cria organizacões
        Organizacao org1 = new Organizacao("1234567890", "Org 1", "Missao 1", "ONG");
        Organizacao org2 = new Organizacao("9876543210", "Org 2", "Missao 2", "Empresa");
        Organizacao org3 = new Organizacao("1111111111", "Org 3", "Missao 3", "Governamental");

        // Cadastra as organizações
        gerenciadorOrg.cadastrarOrganizacao(org1);
        gerenciadorOrg.cadastrarOrganizacao(org2);
        gerenciadorOrg.cadastrarOrganizacao(org3);

        // Get dos pontos da organização
        String cnpj = "1234567890";
        int pontos = gerenciadorOrg.getPontosOrganizacao(cnpj);
        System.out.println("Pontos da organização " + cnpj + ": " + pontos);

        // Pesquisa organização por CNPJ
        Organizacao org = gerenciadorOrg.buscarOrganizacaoPorCnpj(cnpj);
        if (org != null) {
            System.out.println("Organização encontrada: " + org.getNomeOrganizacao());
        } else {
            System.out.println("Organização não encontrada");
        }

        // Lista todas as organizações cadastradas
        List<Organizacao> organizacoes = gerenciadorOrg.listarOrganizacoes();
        System.out.println("Organizações:");
        for (Organizacao o : organizacoes) {
            System.out.println(o.getNomeOrganizacao());
        }

        //RECIBO

        // Cria Recibos
        Recibo recibo1 = new Recibo(111111,156.85,"03/06/2024","10:00");
        Recibo recibo2 = new Recibo(222222,26.78,"03/06/2024","08:14");
        Recibo recibo3 = new Recibo(333333,580.00,"03/06/2024","13:22");

        // Adiciona recibos ao gerenciador
        gerenciadorRecibo.adicionarRecibo(recibo1);
        gerenciadorRecibo.adicionarRecibo(recibo2);
        gerenciadorRecibo.adicionarRecibo(recibo3);

        // Imprime recibo
        System.out.println("*_* Imprimindo recibo *_*");
        gerenciadorRecibo.imprimirRecibo(recibo1);

        // Lista os recibos
        System.out.println("*_* Lista os Recibos *_*");
        gerenciadorRecibo.listarRecibos();

        //RECOMPENSA
        // Cria recompensas
        Recompensa recompensa1 = new Recompensa(1,8500,"troféu, viagem de cruzeiro");
        Recompensa recompensa2 = new Recompensa(2,500,"certificado, boné e camiseta personalizado");
        Recompensa recompensa3 = new Recompensa(3,2300,"viagem em frente a praia");





    }
}