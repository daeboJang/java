package me.jumpto.java;

public class Item {
    String name;
    String value;
    public int length;

    public Item() {

    }

    public Item(String name, int length, String value) {
        this.name = name;
        this.length = length;
        this.value = value;
    }

    public String raw() {
        StringBuffer padded = new StringBuffer(this.value);
        while (padded.toString().getBytes().length < this.length) {
            padded.append(' ');
        }
        return padded.toString();
    }
}

enum Bool {
    False(0),
    True(1);
    public static final int FALSE = 0;
    public static final int TRUE = 1;
    private int value;
    private Bool(int value) { this.value = value; }
    public int getValue() { return value; }
}