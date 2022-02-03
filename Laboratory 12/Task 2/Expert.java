import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;

public class Expert {

    TxtWorker txt;
    XmlWorker xml;

    public Expert() throws ParserConfigurationException {
        txt = new TxtWorker();
        xml = new XmlWorker();
    }

    public void convertTxtToXml(String txtPath, String xmlPath) throws IOException, TransformerException {
        ArrayList<String> article = txt.articleToList(txtPath);
        xml.readArticle(article);
        xml.writeToXml();
        xml.saveXml(xmlPath);
    }
}
