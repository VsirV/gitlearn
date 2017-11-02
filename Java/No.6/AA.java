

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by limingfang on 2017/10/31.
 */
public class AA {
    public static void main(String[] args) throws IOException {

        long result = 0;
        byte[] num=new byte[1024];
        int length = 0;
        InputStreamReader isr = new InputStreamReader(System.in,"utf-8");
//        while((length= System.in.read(num))!=-1){
//            System.out.println(length);
//            result+=length;
//            System.out.println("dddddddddddddddddddddddddd"+result);
//        }

        int sum = 0;
        char[] chars=new char[33];
        while(isr.read(chars)!=-1){
            int i;
            for(i=0;i<chars.length;i++){
                if(chars[i]<'0'||chars[i]>'9'){
                    break;
                }
            }
            char[] chars2= new char[i];
            for(int j=0;j<i;j++){
                chars2[j]=chars[j];
            }
            String value = String.valueOf(chars2);

            System.out.println(value);
            sum+=Integer.parseInt(value);
            System.out.println(sum);
        }
    }
    public static int bytesToInt(byte[] ary, int offset) {
        int value;
        value = (int) ((ary[offset]&0xFF)
                | ((ary[offset+1]<<8) & 0xFF00)
                | ((ary[offset+2]<<16)& 0xFF0000)
                | ((ary[offset+3]<<24) & 0xFF000000));
        return value;
    }

}
