package ifsc.poo.naves;

import ifsc.poo.NaveEspacial;
import ifsc.poo.interfaces.Blindada;
import ifsc.poo.interfaces.Tripulada;

public class NaveExploradora extends NaveEspacial implements Blindada, Tripulada {
    
    private boolean holofotesAcesos;

    public NaveExploradora(int velocidadeMaxima, int quantidadeMaximaTripulantes) {
        super("NaveExploradora",14, Math.max(2, Math.min(quantidadeMaximaTripulantes, 10)));
        this.holofotesAcesos = false;

    }

    public String ligarHolofotes() {
        if (naveEstaPousada) {
            return obterIdentificadorFormatado() + " está pousada. Holofotes não podem ser acesos";
        } else {
            holofotesAcesos = true;
            return obterIdentificadorFormatado() + " acendeu os holofotes";
        }
    }

    public String desligarHolofotes() {
        if (holofotesAcesos) {
            holofotesAcesos = false;
        }
        return obterIdentificadorFormatado() + " apagou os holofotes";
    }

    @Override
    public String pousar() {
        if (velocidadeAtual != 0) {
            return "Não é possível pousar. A nave está em movimento.";
        } else {
            naveEstaPousada = true;
            holofotesAcesos = false;
            return "A nave está pousando. Holofotes foram apagados.";
        }

    }

    @Override
    public String ativarBlindagem() {
        return obterIdentificadorFormatado() + " ativou a blindagem";
    }

    @Override
    public String controlarManual() {
        return obterIdentificadorFormatado() + " ativou o controle manual";
    }

}
