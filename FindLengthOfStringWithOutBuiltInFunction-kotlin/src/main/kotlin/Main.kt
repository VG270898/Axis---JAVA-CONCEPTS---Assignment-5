fun findLengthOfString(myString:String):Int{
    var count=0
    for(ch in myString){
        count+=1
    }
    return count
}


fun main(){
    println("Length of String \"Hello World\" is : ${findLengthOfString("Hello World")}")
    println("Length of String \"Hello\" is : ${findLengthOfString("Hello")}")
    println("Length of String \"\" is : ${findLengthOfString("")}")
    println("Length of String \" \" is : ${findLengthOfString(" ")}")
}