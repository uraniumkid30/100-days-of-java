package DAY0015;

interface DefaultPerson{
    int getUserId();
    default int getAdminID(){
        return 1;
    }
}

class Person{
    int getUserId(){
        return 100;
    }
}

class Day0015 {
    public static void main(String[] args){
        Person james = new Person();
    }
}