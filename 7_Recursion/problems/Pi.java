public class Pi {
    public static void pi(String s, int index,char previous,StringBuilder sb) {
        if (index > s.length()-1) {
            System.out.println(sb.toString());
            return;
        }

        if (previous == 'P' && s.charAt(index) == 'I') {
            sb.append("3.14");
            pi(s,index+2,s.charAt(index),sb);
        } else {
            sb.append(s.charAt(index));
            pi(s,index+1,s.charAt(index),sb);
        }
    }
    public static void main(String[] args) {
        String s = "PIXPIXPPIETPWPI";
        StringBuilder sb = new StringBuilder();
        pi(s,1,'P',sb);
    }
}
