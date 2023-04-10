package DZ4;


import DZ4.FamilyTree;

import java.util.function.Function;
class Father implements FamilyTree {
    String type;
    String name;
    Integer age;
    Integer height;

    Father(String type, String name, Integer age, Integer height) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public void print() {
        System.out.printf("%s %s %s %s \n",type, name, age, height);
    }
    public static void main1() {
        Function<Integer, String> interface3 = (x) -> ("Отцу " + String.valueOf(x) + " лет");
        System.out.println(interface3.apply(50));
    }
}
