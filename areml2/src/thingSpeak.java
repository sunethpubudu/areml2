import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by suneth on 1/27/2018.
 */
public class thingSpeak {

  //  public static void main(String[] args) throws IOException, JSONException, ParserConfigurationException, SAXException, XPathExpressionException, TransformerException {
    public thingSpeak() throws IOException, JSONException, ParserConfigurationException, SAXException, XPathExpressionException, TransformerException {
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
                String url11 = "https://api.thingspeak.com/channels/413155/fields/1/last.json";
                actionListener(url11,11);
                String url12 = "https://api.thingspeak.com/channels/413253/fields/1/last.json";
                actionListener(url12,12);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void actionListener(String url, int no) throws IOException, JSONException, ParserConfigurationException, SAXException, XPathExpressionException, TransformerException {
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

            int line = 0;

            BufferedReader br = new BufferedReader(new FileReader("./actionFiles/" + no + ".txt"));
            line = (int) Double.parseDouble(br.readLine());

            if (!(value == line)) { //success
                FileWriter fw = new FileWriter("./actionFiles/" + no + ".txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(String.valueOf(value));
                bw.close();

                if(no==1) {
                    if (value == 1.0) {
                        action = "Open_main_door";
                    } else {
                        action = "Close_main_door";
                    }
                } else if(no==2) {
                    if (value == 1.0) {
                        action = "Main_light_on";
                    } else {
                        action = "Main_light_off";
                    }
                } else if(no==3) {
                        if (value == 1.0) {
                            action = "Herd_on";
                        } else {
                            action = "Herd_off";
                        }
                } else if(no==4) {
                        if (value == 1.0) {
                            action = "Open_refrigerator";
                        } else {
                            action = "Close_refrigerator";
                        }
                } else if(no==5) {
                        if (value == 1.0) {
                            action = "Microwave_on";
                        } else {
                            action = "Microwave_off";
                        }
                } else if(no==6) {
                        if (value == 1.0) {
                            action = "Open_tap";
                        } else {
                            action = "Close_tap";
                        }
                } else if(no==7) {
                        if (value == 1.0) {
                            action = "Sit_on_sofa";
                        } else {
                            action = "Get_off_sofa";
                        }
                } else if(no==8) {
                        if (value == 1.0) {
                            action = "TV_on";
                        } else {
                            action = "TV_off";
                        }
                } else if(no==9) {
                        if (value == 1.0) {
                            action = "Table_light_on";
                        } else {
                            action = "Table_light_off";
                        }
                } else if(no==10) {
                        if (value == 1.0) {
                            action = "Sit_on_chair";
                        } else {
                            action = "Get_off_chair";
                        }
                } else if(no==11) {
                       action = "Indoor_temperature";
                } else if(no==12) {
                       action = "Outdoor_temperature";
                }
                new thingSpeakModel(action, dateT);
              //  System.out.println(action);
            }
        }
        con.disconnect();
    }

}
