# PlantsVsZombies
My Own Clone of Plants VS Zombies Game Using Java

![Alt text](/../master/pvz.png?raw=true "Screenshot")


# Refactory

[Projeto Original](https://github.com/arminkz/PlantsVsZombies)

[Projeto Refatorado](https://github.com/barbosajackson/PlantsVsZombies)

Para rodar os projetos basta fazer o clone dos repositórios, abrir na IDE  de sua preferencia, compilar e executar.

### Padrões utilizados

  1. Singleton
  
     Aplicado em:
        - a imagem do fundo para todas as fases que houver do jogo será a mesma, sendo que até então, para cada fase seria criada a instancia de uma nova imagem de fundo, sendo assim, aplicando o padrão de projeto **SINGLETON** a imagem é carregada apenas uma vez e sempre que necessário é recuperada essa mesma instância da imagem.
        - [GamePanel.java](https://github.com/BarbosaJackson/PlantsVsZombies/blob/master/src/GamePanel.java#L58) 
  1. Strategy
  
     Aplicado em:
     - Existem, atualmente, dois tipos de zombie no jogo, o zombie normal e o zombie com o cone na cabeça, a primeira alteração feita foi em como calcular qual zombie vai aparecer, para dificultar o jogo, o aparecimento de zombie não está vinculado ao level que está sendo jogado, mas sim, a um número aleatorio gerado que se for par vai gerar um zombie normal e se for impar um zombie com o cone na cabeça.
     - Para invocar o Zombie correto foi implementado o padrão de projeto strategy definindo atráves do número aleatório gerado qual a posição do enum deve ser  instanciada (o tipo de zombie).
     - [GamePanel.java](https://github.com/BarbosaJackson/PlantsVsZombies/blob/master/src/GamePanel.java#L119)

  1. Iterator
  
     Aplicado em:
        - Para executar o movimento de todos os zombies em suas respectivas posições era feito um for rodando posição a posição, para substituir isso foi aplicado o padrão de projeto **ITERATOR** e com ele o loop é feito.
        - [GamePanel.java](https://github.com/BarbosaJackson/PlantsVsZombies/blob/master/src/GamePanel.java#L130)
