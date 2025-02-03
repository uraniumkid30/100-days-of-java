package DAY0012;

interface InnerDay0012 {

    double getValue();
}

public class Day0012 {
    public static void main(String[] args) {
        InnerDay0012 my_value;
        my_value = () -> 98.23 ;
        System.out.println(my_value.getValue());
    }
    
}
