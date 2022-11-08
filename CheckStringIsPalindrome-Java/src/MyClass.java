public class MyClass {

    boolean isStringPalindrome(String myString){
        String tempString="";
        for(int i=myString.length()-1;i>=0;i--){
            tempString+=myString.toCharArray()[i];
        }

        if(tempString.equals(myString)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("\"Vishal\" is palindrome : " + obj.isStringPalindrome("Vishal"));
        System.out.println("\"radar\" is palindrome : " + obj.isStringPalindrome("radar"));
        System.out.println("\"Radar\" is palindrome : " + obj.isStringPalindrome("Radar"));
        System.out.println("\"madam\" is palindrome : " + obj.isStringPalindrome("madam"));
    }
}
