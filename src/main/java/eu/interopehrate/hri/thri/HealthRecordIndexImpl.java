package eu.interopehrate.hri.thri;

import eu.interopehrate.hri.thri.api.HealthRecordIndexI;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HealthRecordIndexImpl implements HealthRecordIndexI {
    private HttpURLConnection connection;
    private int status;
    private String line;
    StringBuffer responseContent = new StringBuffer();

    private StringBuffer connectToHRI(String base_url, String endpoint, String citizenId, String auth, String requestMethod) {
        try {
            URL url = new URL(base_url + endpoint);
            System.out.println(url.toString());
            connection = (HttpURLConnection) url.openConnection();

            //Request setup
            connection.setRequestProperty("citizenId", citizenId);
            connection.setRequestProperty("Authorization", auth);
            connection.setRequestMethod(requestMethod);
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            status = connection.getResponseCode();

            if (status == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = errorReader.readLine()) != null){
                    responseContent.append(line);
                }
                errorReader.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
        return responseContent;
    }

    public JSONObject getCloud(String auth, String citizenId) {
//        String base_url = "http://213.249.46.244:8080/hcp";
        String base_url = "http://localhost:8080/hcp";
        String endpoint = "/getCloud";

        connectToHRI(base_url, endpoint, citizenId, auth, "GET");
        JSONObject jsonResponse = new JSONObject(responseContent.toString());
        return jsonResponse;
    }
}
