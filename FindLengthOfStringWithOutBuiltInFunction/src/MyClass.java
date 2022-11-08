public class MyClass {
    Integer findLengthOfString(String myString){

        int count=0;
        for(Character ch:myString.toCharArray()){
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("length of string \"Hello World\" is : " + obj.findLengthOfString("Hello World"));
        System.out.println("length of string \"Hello\" is : " + obj.findLengthOfString("Hello"));
        System.out.println("length of string \"\" is : " + obj.findLengthOfString(""));
        System.out.println("length of string \" \" is : " + obj.findLengthOfString(" "));
    }
}
