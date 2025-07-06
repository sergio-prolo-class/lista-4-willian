package ifsc.poo.naves;

import ifsc.poo.NaveEspacial;
import ifsc.poo.interfaces.Autonoma;
import ifsc.poo.interfaces.Blindada;

public class NaveCargueira extends NaveEspacial implements Blindada, Autonoma {

    private int capacidadeMaxima;
    private int cargaAtual;
    private boolean blindagemAtivada;

    public NaveCargueira(int velocidadeMaxima, int capacidadeMaxima) {
        super("NaveCargueira",14, 0);
        this.capacidadeMaxima = capacidadeMaxima;
        this.cargaAtual = 0;
        this.blindagemAtivada = false;
    }

    public String carregar(int peso) {
        if ((cargaAtual + peso) > capacidadeMaxima) {
            cargaAtual = capacidadeMaxima;
            ativarBlindagem();
            return "Não foi possível carregar " + peso + ". A capacidade máximada da " + obterIdentificadorFormatado() +
            " é " + capacidadeMaxima + ". Carga atual: " + cargaAtual;
        } else {
            cargaAtual += peso;

            if (cargaAtual > (0.7 * capacidadeMaxima)) {
            ativarBlindagem();
            }

            return "Carregando " + peso + " toneladas. Carga atual: " + cargaAtual;
        }
    }

    @Override
    public String ativarBlindagem() {
        if (!blindagemAtivada) {
            blindagemAtivada = true;
        }
        return obterIdentificadorFormatado() + " ativou a blindagem";
    }

    public String desativarBlindagem() {
        if (!naveEstaPousada) {
            return "A " + obterIdentificadorFormatado() + " só pode desativar a blindagem quando estiver pousada.";
        }
        if (naveEstaPousada) {
            blindagemAtivada = false;
        }
        return obterIdentificadorFormatado() + " desativou a blindagem";
    }

    @Override
    public String ativarControleAutomatico() {
        return obterIdentificadorFormatado() + " ativou o controle automático";
    }
    
}