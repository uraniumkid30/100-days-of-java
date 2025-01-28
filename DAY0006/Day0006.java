package DAY0006;

public class Day0006 {
    public static void main(String[] args) {
        Integer year = Integer.valueOf(2025); // manual boxing
        short year_int = year.shortValue(); // manual unboxing
        Integer month = 12; // auto boxing
        int month_int = month; // auto unboxing
        System.out.println(year);
        System.out.println(year_int);
    }
    
}
