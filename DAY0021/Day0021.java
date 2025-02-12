package DAY0021;

class Day0021 {
    public static void main(String[] args){
        int i;
        if (args.length != 1) {
            System.out.println("Usage: Showfile filename");
            return ;
        }
        try(FileInputStream fis = new FileInputStream(args[0])){
            do {
                i = fis.read();
                if (i != -1) System.out.println((char)i);
            } while (i != -1    )
        }
        catch(IOException e){
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}