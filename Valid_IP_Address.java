package IP_Checker;

import java.util.regex.Pattern;
import java.util.Scanner;

class Valid_IP_Address{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyPattern().pattern));
        }
        in.close();
    }
}
class MyPattern{
    public static String vip,pattern;
    MyPattern(){
        vip ="(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
        pattern = vip+"[.]"+vip+"[.]"+vip+"[.]"+vip;
        Pattern.compile(pattern);

    }
}


