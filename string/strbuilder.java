package string;
//StringBuilder
//syntax: StringBuilder <name> = new StringBuilder("<string item>");
//
//Functions:
//(i) setcharAt()
//syntax: <stringname>.setcharAt(<index for insertion>,"<string>");
//
//(ii) insert()
//syntax: <stringname>.insert(<index for insertion>,"<string>")
//
//(iii) delete()
//syntax: <stringname>.delete(<beginning index>,<ending index>)
//
//(iv) append()
//syntax: <stringname>.append("<string value not the name>")


public class strbuilder {
    public static void main(String args[]){
        StringBuilder tanush = new StringBuilder("tony");
        System.out.println(tanush);
    }
}


