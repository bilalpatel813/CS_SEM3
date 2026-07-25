import java.net.URL;

public class NetEx {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://google.com");
       
        System.out.println("Host: " + url.getHost());
        System.out.println("Protocol: " + url.getProtocol());

    }       
}
