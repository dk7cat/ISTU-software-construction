import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Task122 {

    public static void main(String[] args) throws ParserConfigurationException, IOException, TransformerException {
        Expert expert = new Expert();
        expert.convertTxtToXml("Laboratory 12\\Task 2\\article.txt", "Laboratory 12\\Task 2\\article.xml");
    }


}
