package Chap06.api02.sector00;

import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        // System.getProperty로 속성 값을 가져와 저장
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println("운영체제 이름:" + osName);
        System.out.println("사용자 이름:" + userName);
        System.out.println("사용자 홈디렉토리:" + userHome);

        System.out.println("--------------------------------");
        System.out.println("[key] value");
        System.out.println("--------------------------------");
        Properties props = System.getProperties();
        Set keys = props.keySet();
        for (Object objKey : keys){ // 모든 속성의 키와 값을 출력
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.println("["+key+"] " + value);
        }
    }
}
