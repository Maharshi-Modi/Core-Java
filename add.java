public class add {
    public static void main(String args[]) {
        int inp = 3664;
        int hour = inp / 3600;
        int min = (inp % 3600) / 60;
        int sec = (inp % 3600) % 60;
        System.out.println(hour + " hours " + min + " min " + sec + " sec ");
    }
}