package Interview;

public class ILoveIndia {
    public static void main(String[] args) {

        String str = "I Love India";

        String ans = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
           System.out.println(ch);

            if (ch != ' '){
                sb.append(ch);
                // System.out.println(sb);

            } else {
                sb.reverse();
                ans = ans + sb.toString();
                ans = ans + " ";


                sb = new StringBuilder();
            }

        }
        sb.reverse();
        ans = ans + sb.toString();

        System.out.println(ans);
    }
}
