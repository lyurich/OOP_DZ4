package DZ4;

public class DifferenceHeight<T extends Number, V extends Number> {
    T differenceHeight;
    V differenceHeight1;

    public DifferenceHeight(T differenceHeight, V differenceHeight1) {
        this.differenceHeight = differenceHeight;
        this.differenceHeight1 = differenceHeight1;
    }

    Integer getDifferenceHeight(){
        return differenceHeight.intValue() - differenceHeight1.intValue();
    }
}
