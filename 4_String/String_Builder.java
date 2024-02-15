public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char ch ='A'; ch <= 'Z'; ch++) {
            sb.append(ch);
        }
        System.out.println("Stringbuilder Object:" + sb + " " + sb.getClass());
        System.out.println("String Object: " + sb.toString() + " " + sb.toString().getClass());
        System.out.println("Length of StringBuilder Object: " + sb.length());
        // String Builder also supports charAt()
    }
}