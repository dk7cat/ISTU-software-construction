import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class XmlWorker {

    HashMap<String, String> article = new HashMap<>();
    DocumentBuilderFactory dbf;
    DocumentBuilder db;
    Document dom;
    Element root;

    public XmlWorker() throws ParserConfigurationException {
        dbf = DocumentBuilderFactory.newInstance();
        db = dbf.newDocumentBuilder();
        dom = db.newDocument();

        root = dom.createElement("article");
    }

    public void readArticle(ArrayList<String> articleList) {
        readArticleTitle(articleList);
        readArticleAuthors(articleList);
        readArticleContent(articleList);
        readArticleHash(articleList);
    }

    public void readArticleTitle(ArrayList<String> articleList) {
        article.put("title", articleList.get(0));
    }

    public void readArticleAuthors(ArrayList<String> articleList) {
        article.put("authors", articleList.get(1));
    }

    public void readArticleContent(ArrayList<String> articleList) {
        article.put("content", articleList.get(2));
    }

    public void readArticleHash(ArrayList<String> articleList) {
        if (Utility.checkHash(articleList.get(3))) {
            article.put("hash", articleList.get(3));
        }
        else System.out.println("Hash is incorrect!");

    }

    public void writeToXml() {
        for (String element: article.keySet()) {
            Element el = dom.createElement(element);
            el.appendChild(dom.createTextNode(article.get(element)));
            root.appendChild(el);
        }
    }

    public void saveXml(String xmlPath) throws TransformerException, FileNotFoundException {
        dom.appendChild(root);

        Transformer tr = TransformerFactory.newInstance().newTransformer();
        tr.setOutputProperty(OutputKeys.INDENT, "yes");
        tr.setOutputProperty(OutputKeys.METHOD, "xml");
        tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        tr.transform(new DOMSource(dom),
                new StreamResult(new FileOutputStream(xmlPath)));
    }
}
