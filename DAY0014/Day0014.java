package DAY0014;


interface Ainterface {
    void methA();
    void methB();
}

interface Binterface extends Ainterface {
    void methC();
}

class Myclass implements Binterface {
    public void methA() {
        System.out.println(" calling methA");
    }
    public void methB() {
        System.out.println(" calling methB");
    }
    public void methC() {
        System.out.println(" calling methC");
    }
}

class Day0014 {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.methA();
        obj.methB();
        obj.methC();
    }
}