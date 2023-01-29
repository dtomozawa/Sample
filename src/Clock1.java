

public class Clock1 {   
    public static int getSeconds(int hour, int minute, int second) {
        return hour * 3600 + minute * 60 + second;
    }

    public static void main(String[] args) {
        int h = 18;
        int m = 32;
        int s= 47;
        int seconds = getSeconds(h, m, s);
        System.out.println(h + "時" + m + "分" + s + "秒は" + seconds + "秒です。");
    }
}
