package string;
// Strings
// strings are immutable
// Syntax: String <Name> = "<string>"; (primitive type)
// new String("<string>") (non primitive type)
//string functions:
//
//<string name 1>.compareTo(<string name 2>) 
//stringname1 > stringname then it returns +ve 
//stringname1 = stringname then it returns 0
//stringname1 < stringname then it returns -ve
//
//<stringname>.charAt(<index value>)
//returns the character at that index
//
//<stringname>.substring(<beginning index>,<ending index>)
//returns the string between the given index




public class strings {
    public static void main(String args[]){
        String tanush = "tony";
        String tanush1 = "tony";
        String full = tanush+tanush1;
        System.out.println(full);
        String sub = full.substring(5, 7/*full.length()*/);
        System.out.println(sub);

        System.out.print(new String("Tanush"));
        
    }
}
  



        

        

        
        
        

