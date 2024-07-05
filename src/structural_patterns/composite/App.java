/*
 * Objetivo
 * ------------
 * Esse Design Pattern deve ser usado quando você quer criar um sistema de hierarquia de árvore, porém, os nós dessa árvore
 * podem ser um objeto ou um conjunto desse objeto, assim como um sistema de pastas, em que:
 * - Arquivo = Objeto
 * - Pasta = Conjunto de Objetos
 * 
 * Tutorial
 * ------------
 * 1. Criar uma interface apenas com os métodos que serão usados pelo objeto e pelo conjunto simultaneamente. (SongInterface)
 * 2. Criar o objeto individual que implemente essa interface. (Song)
 * 3. Criar o conjunto de objetos que implemente a mesma interface. (SongGroups)
 * 4. Criar métodos no conjunto que adicionem (addSongs) e removam (removeSongs) a interface, para poder adicionar
 * tanto o objeto, quanto o conjunto. (SongGroups)
 * 5. Criar um método em comum obrigatório na interface que o objeto e o conjunto possa utilizar para mostrar suas informações
 */

package structural_patterns.composite;

public class App {
    public static void main(String[] args) {
        Song musica1 = new Song("Kobra", "Wind", 120);
        Song musica2 = new Song("Radiohead", "Creep", 140);

        SongGroup primeirasMusicas = new SongGroup("Primeiras Musicas");

        primeirasMusicas.addSongs(musica1, musica2);

        // -----------------------------------------
        Song musica3 = new Song("Random", "Plays", 110);
        Song musica4 = new Song("Venom", "Extreme", 130);

        SongGroup youtubeMusicas = new SongGroup("Youtube Musicas");

        youtubeMusicas.addSongs(musica3, musica4);

        // -----------------------------------------

        SongGroup todasAsMusicas = new SongGroup("Todas");

        todasAsMusicas.addSongs(primeirasMusicas, youtubeMusicas);

        todasAsMusicas.display();
    }
}
