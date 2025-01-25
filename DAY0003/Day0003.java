package DAY0003;

class Person{
    byte age;
    String first_name;
    String last_name;
    char gender;
    static char seperator;

    static {
        seperator = '-';
    }

    Person(byte age, String first_name, String last_name, char gender){
        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
    }

    String getFullName(){
        return first_name + seperator + last_name;
    }
}


class Employee extends Person {
    Employee (byte age, String first_name, String last_name, char gender){
        super(age,first_name,last_name,gender);
    }
}


class Day0003{
    /* classes */
    public static void main(String[] args) {
        Employee jonathan;
        jonathan = new Employee((byte) 18, "Jonathan", "Doe", 'M'); 
        System.out.println(jonathan.getFullName());
    }
}