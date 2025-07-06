package ifsc.poo.naves;

import ifsc.poo.NaveEspacial;
import ifsc.poo.interfaces.Tripulada;

public class NaveMineradora extends NaveEspacial implements Tripulada {

    private int energiaLaserMaxima;
    private int energiaLaserAtual;

    public NaveMineradora(int velocidadeMaxima, int quantidadeMaximaTripulantes, int energiaLaserMaxima) {
        super("NaveMineradora", Math.min(velocidadeMaxima, 20), Math.max(2, Math.min(quantidadeMaximaTripulantes, 10)));
        this.energiaLaserAtual = energiaLaserMaxima;
        this.energiaLaserMaxima = energiaLaserMaxima;
    }

    public String minerar(int custo) {
        if ((energiaLaserAtual > custo) && (velocidadeAtual < 0.1 * velocidadeMaxima)) {
            energiaLaserAtual -= custo;
            return obterIdentificadorFormatado() + " está minerando com custo de " + custo +
             ". Energia do laser diminuiu para " + energiaLaserAtual;
        } else {
            return obterIdentificadorFormatado() + " não pode minerar no momento";
        }
    }

    @Override
    public String controlarManual() {
        return obterIdentificadorFormatado() + " ativou o controle manual";
    }

}