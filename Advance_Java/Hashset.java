package Advance_Java;

import java.util.HashSet;

public class Hashset {
    static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("Hellow");
        hash.add("World");
        System.out.println(hash);
        hash.stream().forEach(x-> System.out.println(x));

    }
}
