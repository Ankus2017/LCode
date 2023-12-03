package ToLowerCase709;

public class ToLowerCase {

    //Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
    public static void main(String[] args) {

        String s = "Maksiu";

        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
        int stringLength = s.length();
        if(stringLength >100 || stringLength <0){
            return "String length must be between 1 and 100";
        }

        StringBuilder sb = new StringBuilder("");

        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append((char)(c+32));
            }else{
                sb.append(c);
            }

        }

        return sb.toString();
    }

        public static String toLowerCaseA(String s){

        int stringLength = s.length();
        if(stringLength >100 || stringLength <0){
            return "String length must be between 1 and 100";
        }

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < stringLength; i++) {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                ch =  Character.toLowerCase(ch);
            }
            sb.append(ch);

        }

        return sb.toString();
    }
}
