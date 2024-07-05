package behavioral_patterns.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, String> users = new HashMap<>();

    Database() {
        generateUsers();
    }

    private void generateUsers() {
        users.put("joao@email.com", "joao123");
        users.put("maria@email.com", "maria321");
    }

    boolean checkUser(String email) {
        String user = users.get(email);

        if (user instanceof String) {
            return true;
        }

        return false;
    }

    String getUserPass(String email) {
        String password = users.get(email);
        return password;
    }
}
