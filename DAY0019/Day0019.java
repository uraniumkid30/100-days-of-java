package DAY0019;
class ErrorMsg{
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs [] = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index Out-of-bounds",
    };
    String getErrorMsg(int i){
        if (i >= 0 & i < msgs.length){
            return msgs[i];
        }
        else{
            return "Invalid Error Code";
        }
    }
}

class Day0019{
    public static void main(String[] args) {
        ErrorMsg msg = new ErrorMsg();
        System.out.println(msg.getErrorMsg(msg.OUTERR));
    }
}