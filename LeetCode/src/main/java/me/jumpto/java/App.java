package me.jumpto.java;

public class App {
    public static void main(String[] args) {

        Item item1 = new Item("이름", 20, "홍길동");
        Item item2 = new Item("전화번호", 11, "01023207777");

        Packet packet = new Packet();
        packet.addItem(item1);
        packet.addItem(item2);

        System.out.println('[' + packet.raw() + ']');

    }
}
