[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/RPHb6JFs)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=20969749&assignment_repo_type=AssignmentRepo)
# Atividade 4 - Classe e Objeto



## Sumário 
- [Como Utilizar Esse Projteto](#como-utilizar-esse-projeto-)
- [Desafio da Atividade](#desafio-da-atividade-)
- [No Microsoft Teams](#no-microsoft-teams--)
- [Regras](#regras-)
- [Feedback](#feedback-)

## Como Utilizar Esse Projeto 📁

- Nesse projeto há  pasta:
    - FazerVsCode:Exclusiva para realizar no VisualStudio Code. 

- Na sua máquina tem que ter instalado o <a href="https://www.oracle.com/br/java/technologies/downloads/" target="_blank">Java Development Kit (JDK) </a> 
- Caso utilize o VisualStudio Code é necessário que instale a <a href="https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack" target="_blank">Extension Pack for Java</a>


## Escopo da Atividade 🛠️

- Implementar uma classe que seja capaz de simular atuação dos modificadores de acesso e respectivamente os métodos getters/setters: 
- Implemente a Classe Corpo Humano e o Construtor  
- Implemente os métodos Getters
- Implemente os métodos Setters
- Implemente uma classe main que inclua as seguintes informações: Massa, Volume e Densidade



### Após essa implementação responda:

1. Responda às questões abaixo:
•	Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1.
    o	Qual foi a ocorrência?
    Se incluir essa linha na classe CorpoHumano, aparece “Syntax error on token "massa", VariableDeclaratorId expected after this token”. Se incluir na classe Main, aparece “The method massa(String) is undefined for the type CorpoHumano”
    o	Qual a conclusão sobre o que aconteceu?
    Se incluir essa linha na classe CorpoHumano, não funcionará pois não foi instanciado nenhum objeto da própria classe. Se incluir na classe Main, não é possível acessar a variável “massa” diretamente, apenas pelo método setMassa(), e não é possível atualizar o valor usando uma String, pois o valor esperado para essa variável é um float.

•	Na classe Corpo_Humano altere a linha private float Massa para public float Massa;
    o	Qual foi a ocorrência?
    Não houve erro na execução do código.
    o	Qual a conclusão sobre o que aconteceu?
    Agora é possível acessar a variável massa diretamente em outra classe sem precisar usar os métodos get ou set. 
•	Na classe Corpo_Humano altere a linha public setVolume(float volume) para private setVolume(float volume)
    o	Qual foi a ocorrência?
    “The method setVolume(float) from the type CorpoHumano is never used locally”
    o	Qual a conclusão sobre o que aconteceu?
    O método set tem o objetivo de permitir a alteração do valor de uma variável em outra classe, mas tornando o acesso privado, apenas a própria classe tem acesso ao método, tornando-o inútil.


## DESAFIO 🚀

- Implementar o Atributo e os Metodos de acesso para Altura;
- Criar um método para calcular o Indíce de Massa Corporal (IMC), sendo: IMC = (Peso/Altura)*2
- Exibir/Imprimir o IMC na classe main


## No Microsoft Teams  👥

- Não há necessidade fazer o upload do projeto 
- Enviar o Link do repositório

## Regras 📄

- Utilize as boas práticas de programação que são sempre mencionadas em aula e nos materiais; 
- Observe sempre os modificadores de acesso em atributos e métodos;
- Observe os nomes de classes e atributos;
- Utilze comentários para elucidar o cenário elaborado;

## Feedback 📨
-  Sua atividade receberá uma pontuação de 0 a 10, que compõe a Nota de Atividades da ATV1;
-  A nota será atribuída no Microsoft Teams
