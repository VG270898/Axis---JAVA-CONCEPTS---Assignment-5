fun isSubStringPresent(subString:String, myString:String):Boolean{
    return myString.contains(subString)
}

fun main(){
    val  myString = "My Name is Vishal Gupta"
    var subString = "Vishal"
    var subString2 = "Aman"

    println(isSubStringPresent(subString,myString))
    println(isSubStringPresent(subString2,myString))
}