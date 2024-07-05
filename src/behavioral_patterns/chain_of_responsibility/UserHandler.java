package behavioral_patterns.chain_of_responsibility;

public class UserHandler extends Handler {
    private Database database;

    UserHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean check(String email, String password) {
        if (!database.checkUser(email)) {
            System.out.println("Email Incorreto");
            return false;
        }

        return checkNext(email, password);
    }

}
