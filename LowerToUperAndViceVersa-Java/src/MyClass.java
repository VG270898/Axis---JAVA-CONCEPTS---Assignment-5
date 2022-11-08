public class MyClass {
    String LowerToUpperViceVersa(String myString){
        char[] myCharArray = myString.toCharArray();

        for(int i=0; i< myCharArray.length;i++){
            if(myCharArray[i]>=65 && myCharArray[i]<=90){
                myCharArray[i] = (char)((int)myCharArray[i]+32);
            }
            else if (myCharArray[i]>=97 && myCharArray[i]<=122) {
                myCharArray[i] = (char)((int)myCharArray[i]-32);
            }
        }
        myString="";
        for(int i=0;i<myCharArray.length;i++){
            myString+=myCharArray[i];
        }

        return myString;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Conversion of String \"Vishal Gupta\" : " + obj.LowerToUpperViceVersa("Vishal Gupta"));
        System.out.println("Conversion of String \"abCDeFgHiJKlmz\" : " + obj.LowerToUpperViceVersa("abCDeFgHiJKlmz"));
    }
}
