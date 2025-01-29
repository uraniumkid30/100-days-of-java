package DAY0007;

public class Day0007 {
    public static char prompt(String str) throws java.io.IOException {
        System.out.println(str + ":");
        return (char) System.in.read();
    }
    public static void main(String[] args) {
        char ch;
        try{
            ch = prompt("Enter a letter");
        }
        catch(java.io.IOException err){
            System.out.println("Io error occured");
            ch = 'X';
        }
        System.out.println("You pressed " + ch);
    }
}
