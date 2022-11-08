public class MyClass {
    int[] countVariablesCosonant(String myString){
        int vowelCount=0;
        int consonantCount=0;

        for(char ch:myString.toLowerCase().toCharArray()){
            if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
                vowelCount +=1;
            } else if (ch>='a' && ch<='z') {
                consonantCount += 1;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        int[] vc1 = obj.countVariablesCosonant("Vishal Gupta");
        int[] vc2 = obj.countVariablesCosonant("My Company name is Axis Bank");
        System.out.println("String \"Vishal Gupta\" contains " + vc1[0]+ " and " + vc1[1] +" consonants");
        System.out.println("String \"My Company name is Axis Bank\" contains " + vc2[0]+ " and " + vc2[1] +" consonants");
    }
}
