public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for (char ch ='A'; ch <= 'Z'; ch++) {
            sb.append(ch);
        }
        System.out.println("Stringbuilder Object:" + sb + " " + sb.getClass());
        System.out.println("String Object: " + sb.toString() + " " + sb.toString().getClass());
        System.out.println("Length of StringBuilder Object: " + sb.length());
        // String Buffer also supports charAt()


        /*
         * String Buffer is thread safe and dosn't need external thread synchronization
         * hence, buffer is slower compared to builder
         */
    }
}