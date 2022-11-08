public class MyClass {
    void reverseEveryWordOfString(String myString){

        String tempString = "";
        for(String st:myString.split(" ")){
            System.out.println(st);
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.reverseEveryWordOfString("My name is Vishal Gupta");
    }

}

