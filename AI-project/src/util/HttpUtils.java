package util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author fzv
 */
public class HttpUtils {
    public static String request(String api) {

        HttpURLConnection Connection = null;
        int responseCode = 0;
        try {
            URL url = new URL(api);
            //获取对应的链接对象
            Connection = (HttpURLConnection) url.openConnection();
            responseCode = Connection.getResponseCode();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (200 <= responseCode && responseCode <= 299) {
            try (InputStream inputStream = Connection.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
                )
            {
                StringBuilder response = new StringBuilder();
                String currentLine;
                while ((currentLine = in.readLine())!=null){
                    response.append(currentLine);
                }
                String result = response.toString();
                return result;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
            return null;
    }
}
