fun concatinateStrings(myString1:String, myString2: String):String{
    var tempString = ""

    tempString = myString1 + myString2

    return tempString
}

fun main(){
    print("Enter First Number : ")
    val myString1 = readln()

    print("Enter Second Number : ")
    val myString2 = readln()

    val concatedString = concatinateStrings(myString1,myString2)
    println(concatedString)



}