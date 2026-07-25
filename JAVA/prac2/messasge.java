import java.security.MessageDigest;

public class messasge {
    public static void main(String[] args) throws Exception {
        String password = "add@123";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(password.getBytes());

        StringBuilder hex = new StringBuilder();
        for (byte b: hash) {
            hex.append(String.format("%02x",b));

        }
        System.out.println("SHA-256 Hash: " + hex.toString());
    }
}
