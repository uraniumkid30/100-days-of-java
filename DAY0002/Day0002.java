class Day0002{
    /* convert galloon to litres */
    public static void main(String[] args) {
        // this doesnt get executed
        double litres;
        var gallon = 10.0; // type inference
        final double RATIO = 3.7854;
        litres = gallon * RATIO;

        System.out.println(gallon + " gallons is equivalent to "+ litres + " litres");
    }
}