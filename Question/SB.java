public class SB {
    public static void main(String[] args) {
        String name="Ayush";
        System.out.println(SB(name));
    }
    public static String SB(String name){
        StringBuilder sb =  new StringBuilder();
        for(int i=0; i<name.length();i++){
            char ch = name.charAt(i);
            sb.append(ch);
        }
        sb.reverse();
        return sb.toString();
    }
}
