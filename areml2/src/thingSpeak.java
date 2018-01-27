import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by suneth on 1/27/2018.
 */
public class thingSpeak {

    public static void main(String[] args) throws IOException, JSONException {

        while (true) {
                String url1 = "https://api.thingspeak.com/channels/241847/fields/1/last.json";
                actionListener(url1,1);
                String url2 = "https://api.thingspeak.com/channels/412676/fields/1/last.json";
                actionListener(url2,2);
                String url3 = "https://api.thingspeak.com/channels/412757/fields/1/last.json";
                actionListener(url3,3);
                String url4 = "https://api.thingspeak.com/channels/412766/fields/1/last.json";
                actionListener(url4,4);
                String url5 = "https://api.thingspeak.com/channels/412767/fields/1/last.json";
                actionListener(url5,5);
                String url6 = "https://api.thingspeak.com/channels/412768/fields/1/last.json";
                actionListener(url6,6);
                String url7 = "https://api.thingspeak.com/channels/412769/fields/1/last.json";
                actionListener(url7,7);
                String url8 = "https://api.thingspeak.com/channels/412770/fields/1/last.json";
                actionListener(url8,8);
                String url9 = "https://api.thingspeak.com/channels/412771/fields/1/last.json";
                actionListener(url9,9);
                String url10 = "https://api.thingspeak.com/channels/412773/fields/1/last.json";
                actionListener(url10,10);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void actionListener(String url, int no) throws IOException, JSONException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode;
        try {
            responseCode = con.getResponseCode();
        } catch (Exception ex) {
            con.disconnect();
            return;
        }

        String action = "";
        if (responseCode == HttpURLConnection.HTTP_OK) { // success

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            in.toString();

            //write the data into local file - in seperate action files
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject json = new JSONObject(response.toString());
            int value = json.getInt("field1");

            String dateT = json.getString("created_at");
            System.out.println(value+" "+no+" -- "+dateT);

        }

    }

}
