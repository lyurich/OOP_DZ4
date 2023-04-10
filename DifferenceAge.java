package DZ4;

public class DifferenceAge {
    int differenceAge;

    <T extends Number> DifferenceAge(T arg) {
        this.differenceAge = 15;

            differenceAge = arg.intValue() - differenceAge;

    }

    int getDifferenceAge() {
        return differenceAge;
    }
}
