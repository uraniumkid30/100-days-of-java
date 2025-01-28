package DAY0005;

class Processor <T> {
    T file;
    Processor(T file){
        this.file = file;
    }
}

public class Day0005 {
    public static void main(String[] args){
        Processor<String> pdf_processor = new Processor<String>("java.pdf");
        System.out.println(pdf_processor.file);
    }
}
