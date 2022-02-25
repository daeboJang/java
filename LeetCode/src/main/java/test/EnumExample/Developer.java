package test.EnumExample;

import java.util.Arrays;

// enum 클래스 연습. class 임을 주의하자!!!
enum DevType {
    MOBILE("안드로이드"),
    WEB("스프링"),
    SERVER("리눅스");

    private final String name;
    public String getName() { return this.name; }
    DevType(String name) {
        this.name = name;
    }
}

public class Developer {
    public String name;
    public int career;
    public DevType devType;

    public static void main(String[] args) {
        Developer dev1 = new Developer();
        dev1.name = "홍길동";
        dev1.career = 9;
        dev1.devType = DevType.MOBILE;

        System.out.println("개발타입: " + dev1.devType);
        System.out.println("개발타입: " + Arrays.toString(DevType.values()));

        // 배민테크에서 보고 활용
        // 이런식의 스트링 비교가 가독성이 좋아서~~~~
        if ( "안드로이드".equals(dev1.devType.getName()) ) {
            System.out.println("지화자!!");
        }

        if ( DevType.MOBILE.equals(dev1.devType)) {
            System.out.println("지화자!!");
        }
    }
}
