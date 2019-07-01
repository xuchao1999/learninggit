package niuke;

public class Two {
    public static String replaceSpace(StringBuffer str) {
        while(str.indexOf(" ") != -1){
            str.replace(str.indexOf(" "), str.indexOf(" ") + 1, "%20");
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("sdfsda safasdf");
        System.out.println(replaceSpace(str));
    }
}
