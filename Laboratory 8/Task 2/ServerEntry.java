import java.io.IOException;

public class ServerEntry {
//  Точка входа сервера
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.run();
    }
}
