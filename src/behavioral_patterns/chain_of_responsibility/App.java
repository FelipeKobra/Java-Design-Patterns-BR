/*
 * Objetivo
 * ------------
 * Esse design é muito utilizado quando você precisa criar uma cadeia de etapas.
 * Então, por exemplo, se você quiser criar um autenticador, primeiro ele precisa:
 * 1. Verificar se o usuário existe
 * 2. Verificar se a senha está correta
 * 
 * 
 * Tutorial
 * ------------
 * 1. Criar a classe abstrata Handler
 * 2. Nessa classe você tem que definir um método para conectar as implementações do Handler (Handler.link()), sendo que
 * cada implementação será uma parte do processo
 * 3. Você também terá que criar um método abstrato que será a função principal da sua cadeia (Handler.check()) e um método
 * para que o Handler atual consiga chamar essa função no próximo Handler da cadeia (Handler.nextCheck())
 * 4. Criar as implementações do Handler (UserHandler e PasswordHandler) e extender de Handler
 * 5. Adicionar a implementação do método principal e chamar o próximo da cadeia caso ele passe pela verificação, ou seja
 * necessário
 * 6. Criar uma instância do Handler que seja o link dos Handlers utilizando o Handler.link(). Lembrando que você pode
 * adicionar manualmente Handler por Handler utilizando um método para isso, como um"createNext()", mas é trabalho
 * desnecessário e muito verboso
 * 7. Utilizar o método principal do Handler criado, que chamará a sequência caso tudo ocorra corretamente.
 * 
 */

package behavioral_patterns.chain_of_responsibility;

public class App {
    public static void main(String[] args) {
        Database database = new Database();

        Handler userAuthenticator = Handler.link(new UserHandler(database), new PasswordHandler(database));

        userAuthenticator.check("joao@email.com", "joao123");

        String randomUser = RandomString.generate();
        String randomPass = RandomString.generate();
        userAuthenticator.check(randomUser, randomPass);

        userAuthenticator.check("maria@email.com", "maria321");

        userAuthenticator.check("maria@email.com", "maria123");
    }
}
