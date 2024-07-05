package behavioral_patterns.chain_of_responsibility;

public class PasswordHandler extends Handler {

    private Database database;

    PasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean check(String email, String password) {
        String userPass = database.getUserPass(email);

        if(!userPass.equals(password)){
            System.out.println("Senha Incorreta");
            return false;
        }

        System.out.println("Obrigado por voltar!");
        return checkNext(email, password);
    }

}
