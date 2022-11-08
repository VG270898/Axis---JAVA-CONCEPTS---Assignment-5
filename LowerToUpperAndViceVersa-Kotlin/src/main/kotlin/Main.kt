fun lowerToUpperAndViceVersa(myString:String):String {
    var myString = myString
    var tempStr:String =""
    for (i in myString.indices) {
        if (myString[i].code >= 65 && myString[i].code <= 90) {
            tempStr = tempStr.plus((myString[i].code + 32).toChar())
        } else if (myString[i].code >= 97 && myString[i].code <= 122) {
            tempStr = tempStr.plus((myString[i].code - 32).toChar())
        }
        else{
            tempStr = tempStr.plus(myString[i])
        }

    }
    return tempStr
}

fun main(){
    println("LowerToUpper and Vice Versa of String \"ViSHal GuPTa\" : ${lowerToUpperAndViceVersa("ViSHal GuPTa")}")
    println("LowerToUpper and Vice Versa of String \"ViSHal GuPTa\" : ${lowerToUpperAndViceVersa("HEllo WorlD")}")
}