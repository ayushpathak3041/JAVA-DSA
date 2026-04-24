class Q {
    public static void main(String[] args){
           String address="1.1.1.1.11.1";
           System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) { 
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<address.length();i++){
            char c = address.charAt(i);
            if(c == '.'){
                sb.append("[.]");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}