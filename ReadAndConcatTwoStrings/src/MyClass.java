import java.util.Scanner;
public class MyClass {
    String concatinateStrings(String myString1, String myString2){
        String tempString = "";

//        tempString=tempString.concat(myString1);
//        tempString=tempString.concat(myString2);

                        //or
        tempString = myString1 + myString2;
        return tempString;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String myString1 = scanner.nextLine();
        System.out.print("Enter Second String : ");
        String myString2 = scanner.nextLine();

        MyClass obj = new MyClass();
        String concatedString = obj.concatinateStrings(myString1,myString2);
        System.out.println(concatedString);

    }
}
