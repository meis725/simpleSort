/**
 * Created by Song on 4/6/16.
 */
public class StringChange {

    public static void main(String[] args) {
        String str = "original";
        StringBuilder sb = new StringBuilder("original");
        StringBuilder sbReplace = new StringBuilder("original");

        change(str,sb,sbReplace);

        System.out.println(str);
        System.out.println(sb.toString());
        System.out.println(sbReplace.toString());

    }

    static void change(String str,StringBuilder sb, StringBuilder sbReplace){
        str = "new";
        sb = new StringBuilder("new");
        sbReplace.replace(0, sbReplace.toString().length(), "new");
    }
}

