## Lista 4: Frota Espacial Polimórfica

## Alunos: Willian Ferreira dos Santos, Mônica Cancellier

## Diagrama de Classes

```mermaid

classDiagram
    
    direction LR
    
    class App {
        - garagem: Set ~NaveEspecial~
        + main(args: String[]) void
    }
    
    class NaveEspacial {
            <<Abstract>>
        # id: int
        # nome: String
        # velocidadeAtual: int
        # velocidadeMaxima: int
        # quantidadeAtualTripulantes: int
        # quantidadeMaximaTripulantes: int
        - identificador: int
        
        + NaveEspacial(nome: String, velocidadeMaxima: int, quantidadeMaximaTripulantes: int)
        + acelerar(intensidade: int) String *
        + frear(intensidade: int) String *
        + pousar() String *
        + decolar() String *
        + gerarId() int
        + obterIdentificadorFormatado() String
    }
    
    class NaveMineradora {
        - energiaLaserMaxima: int
        - energiaLaserAtual: int

        + NaveMineradora(velocidadeMaxima: int, quantidadeMaximaTripulantes int, energiaLaserMaxima: int)
        
        + minerar(custo: int) String
    }
    
    class NaveExploradora {
        - holofotesAcesos: boolean

        + NaveExploradora(velocidadeMaxima: int, quantidadeMaximaTripulantes: int)
        + ligarHolofotes() String
        + desligarHolofotes() String
    }
    
    class NaveCargueira {
        - capacidadeMaxima: int
        - cargaAtual: int

        + NaveCargueira(velocidadeMaxima: int, capacidadeMaxima: int)
        + carregar(peso: int) String
        + desativarBlindagem() String
    }
    
    class NaveSentinela {
        - radarAtivado: boolean

        + NaveSentinela(velocidadeMaxima: int)
        + ligarRadar() String
    }
    
    class Tripulada {
        <<Interface>>
        + controlarManual() String *
    }
    
    class Blindada {
        <<Interface>>
        
        + ativarBlindagem() String *
    }
    
    class Autonoma {
        <<Interface>>
        + ativarControleAutomatico() String *
    }
    
    App *-- NaveEspacial
    
    NaveEspacial <|-- NaveMineradora 
    NaveEspacial <|-- NaveExploradora
    NaveEspacial <|-- NaveCargueira
    NaveEspacial <|-- NaveSentinela

    Tripulada <|.. NaveMineradora
    Tripulada <|.. NaveExploradora
    Blindada <|.. NaveExploradora
    Blindada <|.. NaveCargueira
    Autonoma <|.. NaveCargueira
    Autonoma <|.. NaveSentinela

```

<img src="/img/1-informacoes-lista-4.png">
<img src="/img/2-informacoes-lista-4.png">
<img src="/img/3-informacoes-lista-4.png">