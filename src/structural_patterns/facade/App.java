/*
 * Objetivo
 * ------------
 * Criar uma interface que realize toda a parte complexa de uma aplicação e a torne fácil
 * 
 * Explicação
 * ------------
 * Esse pattern não precisa de tutorial já que é muito simples. Basicamente, imagine que você tem muitas bibliotecas que precise
 * utilizar e elas atuam de forma complexa, só que você sempre faz a mesma coisa com essas bibliotecas, então decide colocar
 * esse algoritimo que realiza várias vezes dentro de um método de uma classe, o Facade é isso. Ou seja, você faz algo complexo
 * em um método e o torna fácil de usar, assim como as funções normalmente são utilizadas.
 */

package structural_patterns.facade;

public class App {
    public static void main(String[] args) {
        VideoFacade videoFacade = new VideoFacade();
        videoFacade.receiveVideo("mp4", 4000);
    }
}
