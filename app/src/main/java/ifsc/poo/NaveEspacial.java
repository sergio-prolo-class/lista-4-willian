package ifsc.poo;

public abstract class NaveEspacial {

    protected int id;
    protected String nome;
    protected int velocidadeAtual;
    protected int quantidadeAtualTripulantes;
    protected boolean naveEstaPousada;

    protected final int velocidadeMaxima;
    protected final int quantidadeMaximaTripulantes;

    private static int identificador = 1;

    public NaveEspacial(String nome, int velocidadeMaxima, int quantidadeMaximaTripulantes) {
        this.id = gerarId();
        this.nome = nome;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.quantidadeAtualTripulantes = 0;
        this.quantidadeMaximaTripulantes = quantidadeMaximaTripulantes;
        this.naveEstaPousada = true;
    }

    public String acelerar(int intensidade) {
        if (naveEstaPousada) {
            return "Não é possível acelerar. A nave está pousada.";
        } else {
            if ((velocidadeAtual + intensidade) > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            } else {
                velocidadeAtual += intensidade;
            }
            return obterIdentificadorFormatado() + " está acelerando à " + velocidadeAtual + " Mm/h.";
        }
    }

    public String frear(int intensidade) {
        if (naveEstaPousada) {
            return "Não é possível frear. A nave já está parada.";
        } else {
            if ((velocidadeAtual - intensidade) < 0) {
                velocidadeAtual = 0;
            } else {
                velocidadeAtual -= intensidade;
            }
            return obterIdentificadorFormatado() + " está freando e diminuindo a velocidade para " + velocidadeAtual + " Mm/h.";
        }
    }

    public String pousar() {
        if (velocidadeAtual != 0) {
            return "Não é possível pousar. A nave está em movimento.";
        } else {
            naveEstaPousada = true;

            return obterIdentificadorFormatado() + " está pousando";
        }

    }

    public String decolar() {
        if (naveEstaPousada) {
            naveEstaPousada = false;
        }
        return obterIdentificadorFormatado() + " está decolando";
    }

    private static int gerarId() {
        return identificador++;
    }

    public String obterIdentificadorFormatado() {
        return this.nome + "(ID#" + String.format("%04d", id) + ")";

    }
    
}