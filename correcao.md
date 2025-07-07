# Correção

## Diagrama

- métodos de interfaces não precisam estar escritos em itálico
- por que NaveEspacial possui ambos id e identificador? parece redundante
- a diagramação está complicada de ler
  - muitas linhas cruzadas, ou atrás dos blocos de classe
  - eu sei que Mermaid não oferece muita liberdade...
  - ... mas o meu exemplo possui a mesma estrutura, mas é legível!
  - se vocês não conseguem entregar um produto de qualidade com essa tecnologia, aconselho usar outra que dê mais liberdade

## Implementação

- Execução
  - Existem algums métodos das naves que não são executados
    - por exemplo, a NaveMineradora não decola, não pousa, etc...
- App
  - não tenho certeza se vocês entenderam onde está sendo usado o polimorfismo na aplicação
  - entendo o porquê de alguns métodos não serem executados, está vinculado com o polimorfismo
- NaveEspacial
  - o método construtor deixa criar naves com qualquer valor de velocidade máxima e tripulação
  - os construtores das naves concretas também não impedem nenhum valor
  - então as regras de negócio estabelecidas para eles valores não são garantidas!

## Nota

7 ou 8, dependendo de uma conversa na aula hoje (07/07) 