public class isPalindrome {


    public  static boolean palindromeChecker(String str){
        str = str.toUpperCase();
        if(str == "" || str.isEmpty()){
            return true;
        }
        for(int i =0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }

        }

        return true;
    }
}
