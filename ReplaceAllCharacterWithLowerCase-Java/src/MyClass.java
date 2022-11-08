public class MyClass {
    String allLowerCase(String myString){
        char[] myCharArray = myString.toCharArray();
        for(int i=0;i<myCharArray.length;i++){
            if(myCharArray[i]>='A' && myCharArray[i]<=90){
                myCharArray[i] = (char)((int)myCharArray[i]+32);
            }
        }
        myString="";
        for(int i=0;i< myCharArray.length;i++){
            myString += myCharArray[i];
        }


        return myString;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        System.out.println("Lowering alphabets of String \"VisHal GUpta\" : " + obj.allLowerCase("VishHal GUpta"));
        System.out.println("Lowering alphabets of String \"HELlo wORLd\" : " + obj.allLowerCase("HELlo wORLd"));
        System.out.println("Lowering alphabets of String \"UpER CAse\" : " + obj.allLowerCase("UpER CAse"));
    }
}
