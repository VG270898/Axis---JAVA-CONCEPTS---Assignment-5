public class MyClass {
    boolean ComapreTwoString(String myString1, String myString2){
        if(myString1.length()!=myString2.length())
            return false;
        else {
            for (int i = 0; i < myString1.length(); i++) {
                if (myString1.toCharArray()[i] != myString2.toCharArray()[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        System.out.println(obj.ComapreTwoString("Vishal Gupta","Vishal Gupta"));
        System.out.println(obj.ComapreTwoString("Vishal Gupta","Vishal"));
        System.out.println(obj.ComapreTwoString("Vishal Gupta","Vishal Kumar"));
    }
}
