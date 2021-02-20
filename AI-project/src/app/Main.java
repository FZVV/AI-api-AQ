package app;

import module.Response;
import service.QkyRobotServicelmpl;
import service.RobotService;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * @author fzv
 */
public class Main {
    private static final RobotService robotService = new QkyRobotServicelmpl();

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("宝贝，麻烦给我取个名字吧~");
        String name = scanner.nextLine();
        System.out.println("嗨 ，我是你的小助手"+ name +"，可以和我说话啦！");
        while (true){
            String input = scanner.nextLine();
            if("886".equalsIgnoreCase(input)){
                System.out.println("主人我爬啦");
                break;
            }else {
                Response response = robotService.ai(input);

                if(response != null && response.getCode()==0){
                    System.out.println(name+":"+new String(response.getContent().getBytes(),"utf-8"));
                }else {
                    System.out.println(name+":"+"暂时没明白您的意思，请换个表达方式吧");
                }
            }

        }
        scanner.close();
    }
}
