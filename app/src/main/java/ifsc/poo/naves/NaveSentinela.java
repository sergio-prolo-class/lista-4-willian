package ifsc.poo.naves;

import ifsc.poo.NaveEspacial;
import ifsc.poo.interfaces.Autonoma;

public class NaveSentinela extends NaveEspacial implements Autonoma {

    private boolean radarAtivado;

    public NaveSentinela(int velocidadeMaxima) {
        super("NaveSentinela", Math.max(10, Math.min(velocidadeMaxima, 20)), 0);
        this.radarAtivado = false;
    }

    public String ligarRadar() {
        if (velocidadeAtual > (0.9 * velocidadeMaxima)) {
            return obterIdentificadorFormatado() + " está muito rápida. É preciso diminuir a velocidade para ativar o radar";
        } else {
            radarAtivado = true;
            return "O radar da " + obterIdentificadorFormatado() + " foi ativado";
        }
    }

    @Override
    public String ativarControleAutomatico() {
        return obterIdentificadorFormatado() + " ativou o controle automático";
    }
    
}
