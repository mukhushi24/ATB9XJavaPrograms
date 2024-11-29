package Task.Task__25112024Palindrome_of_String;

public class Lab_58 {
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for(int i = 0; i < str.length() / 2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String input = "khushi";
        if(isPalindrome(input)){
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
