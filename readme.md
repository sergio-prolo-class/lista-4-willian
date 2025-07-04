## Lista 4

## Diagrama de Classes

```mermaid

classDiagram
    
    direction LR
    
    class App {
        - garagem: Set NaveEspecial
        + main(args: String[]) void
    }
    
    class NaveEspacial {
            <<Abstract>>
        # id: int
        # velocidadeAtual: int
        # velocidadeMaxima: int
        # quantidadeAtualTripulantes: int
        # quantidadeMaximaTripulantes: int
        
        
        + acelerar(intensidade: int) String *
        + frear(intensidade: int) String *
        + pousar() String *
        + decolar() String *
        + gerarIdentificador() int
    }
    
    class NaveMineradora {
        - energiaLaserMaxima: int
        - energiaLaserAtual: int
        
        + minerar(custo: int) String
    }
    
    class NaveExploradora {
        - holofotes: bool
        + ligarHolofotes() String
    }
    
    class NaveCargueira {
        - capacidadeMaxima: int
        - cargaAtual: int
        + carregar(peso: int) String
        
        
        
        
    }
    
    class NaveSentinela {
        - radar: bool
        + ligarRadar() String
    }
    
    class Tripulada {
        <<Interface>>
        + controlarManual() String *
        + validarVelocidadeMaxima() int *
        + validarQuantidadeMaximaTripulantes() int *
    }
    
    class Blindada {
        <<Interface>>
        
        + ativarBlindagem() String *
        + desativarBlindagem() String *
        + validarVelocidadeMaxima() int *
    }
    
    class Autonoma {
        <<Interface>>
        + ativarControleAutomatico() String *
        + validarQuantidadeMaximaTripulantes() int *
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

