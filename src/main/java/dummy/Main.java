package dummy;

import eu.interopehrate.hri.thri.HealthRecordIndexFactory;
import eu.interopehrate.hri.thri.api.HealthRecordIndexI;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) throws java.text.ParseException, ParseException {
        HealthRecordIndexI thri = HealthRecordIndexFactory.create();
        String auth = "eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE2NTAzNTIxODMsInRva2VuTmFtZSI6ImhyaUV" +
                "tZXJnZW5jeVRva2VuIiwiY2l0aXplblVzZXJuYW1lIjoiRmluYWxmaW5haWxmaW5hbDIiLCJjbG91ZFV" +
                "yaSI6IkZpbmFsZmluYWlsZmluYWwyIn0.1vsxjynSxgbttB56CAwyvcqZvRAFGxN9TcFy_VgaVSU9cmL20e9H9ocTJX1ldfrEP" +
                "Tux-O98zga2OZgApLtUNw";
        System.out.println(thri.getCloud(auth, "626916dc48a42407d4eb2674"));
    }
}
