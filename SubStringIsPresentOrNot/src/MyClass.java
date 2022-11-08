public class MyClass {
    boolean isSubStringPresent(String subString, String myString){

        return myString.contains(subString);
    }

    public static void main(String[] args) {

        MyClass obj = new MyClass();

        String myString = "My name is Vishal Gupta";
        String subString = "Vishal";
        String subString2 = "Aman";

        System.out.println(obj.isSubStringPresent(subString,myString));
        System.out.println(obj.isSubStringPresent(subString2,myString));
    }
}
