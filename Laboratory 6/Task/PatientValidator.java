import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class PatientValidator {

    public static void validate (final String xmlFile, final String xsdFile) {
        if (xmlFile == null || xmlFile.isEmpty()) {
            System.out.println("ERROR: Path/name of XML to be validated cannot be null.");
            return;
        }
        if (xsdFile == null ) {
            System.out.println("ERROR: At least one XSD must be provided to validate XML against.");
            return;
        }
        final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        try
        {
            final Schema schema = schemaFactory.newSchema(new File(xsdFile));
            final Validator validator = schema.newValidator();
            System.out.println("Validating " + xmlFile + " against XSD "
                    + xsdFile + "...");
            validator.validate(new StreamSource(new File(xmlFile)));
        }
        catch (IOException | SAXException exception)
        {
            System.out.println("ERROR: Unable to validate " + xmlFile
                            + " against XSDs " + xsdFile + " - " + exception);
            return;
        }
        System.out.println("Validation process completed.");
    }
}
