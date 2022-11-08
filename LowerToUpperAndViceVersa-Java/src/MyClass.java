public class MyClass {
    String lowerToUpperAndViceVersa(String myString){
        String tempStr = "";

        for (Character ch:myString.toCharArray()) {
            if(ch>='A' && ch<='Z'){
                tempStr = tempStr + (char)((int)ch + 32);
            } else if(ch>='a' && ch<='z'){
                tempStr = tempStr + (char)((int)ch - 32);
            }
            else{
                tempStr = tempStr+ch;
            }
        }

        return tempStr;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("LowerToUpper and Vice Versa of String \"ViSHal GuPTa\" : " + obj.lowerToUpperAndViceVersa("ViSHal GuPTa"));
        System.out.println("LowerToUpper and Vice Versa of String \"HEllo WorlD\" : " + obj.lowerToUpperAndViceVersa("HEllo WorlD"));
    }
}
