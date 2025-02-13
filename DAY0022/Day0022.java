package DAY0022;

class Day0022{
    public static void main(String[] args){
        int i;
        if (args.length != 2) {
            System.out.println("Usage: Copy file from to");
            return ;
        }
        try(FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1])){
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1)
        }
        catch(IOException e){
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}