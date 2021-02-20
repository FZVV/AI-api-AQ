package service;

import com.google.gson.Gson;
import module.Response;
import util.HttpUtils;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

public class QkyRobotServicelmpl implements RobotService {

    public static final String apiTpl = "http://api.qingyunke.com/api.php?key=free&appid=0&msg=%s";

    private static final Gson gson = new Gson();


    @Override
    public Response ai(String msg) {
        String api = null;

        try {
            api = String.format(apiTpl, URLEncoder.encode(msg, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String result = HttpUtils.request(api);
        //没做逻辑判断，比如null 或者 出错
        Response response = gson.fromJson(result, Response.class);

        return response;

    }


}

