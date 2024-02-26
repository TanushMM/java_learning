public class MoveAllXToTheEnd {
    public static void function(String s, int index, int count, StringBuilder newString){
        if (index >= s.length()) {
            for(int i =0; i < count; i++ ) {
                newString.append('X');
            }
            System.out.println(newString.toString());
            return;
        }
        if (s.charAt(index) == 'X') {
            count++;
            function(s, index+1, count, newString);
        } else {
            newString.append(s.charAt(index));
            function(s, index+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String s = "AXBCXXD";
        function(s, 0, 0, new StringBuilder(""));
    }    
}
