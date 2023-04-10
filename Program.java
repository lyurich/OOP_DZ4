package DZ4;


public class Program {
    public static void main(String[] args) {
        Father father = new Father("Отец", "Александр", 50, 180);
        father.print();
        Father.main1();

        Son son = new Son("Сын", "Вася", 15, 156);
        son.print();
        Son.main2();
        DifferenceAgeDemo.differenceAgeDemo();

        DifferenceHeight<Integer, Integer> ob2 = new DifferenceHeight<>(180, 156);
        System.out.println("\nОтец выше сына на " + ob2.getDifferenceHeight() + " см");

    }

    static class DifferenceAgeDemo{
        public static void differenceAgeDemo() {
            DifferenceAge ob = new DifferenceAge(50);
            System.out.printf("Разница в возрасте между отцом и сыном = " + ob.getDifferenceAge() + " лет");
        }
    }
}

