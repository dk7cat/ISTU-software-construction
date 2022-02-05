import java.io.IOException;

public class ClientEntry {
//  Точка входа клиента
    public static void main(String[] args) throws IOException {
        Client client = new Client();

        client.run();
    }
}
