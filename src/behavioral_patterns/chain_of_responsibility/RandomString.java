package behavioral_patterns.chain_of_responsibility;

import java.util.UUID;

public class RandomString {

    public static String generate() {
        String randomString = UUID.randomUUID().toString().replace("-", "");
        return randomString;
    }
}
