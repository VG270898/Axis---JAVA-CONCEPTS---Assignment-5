fun allLowerCase(myString:String):String{
    var myString =myString
    for(i in 0..myString.length-1){
        if(myString[i].code>=65 && myString[i].code<=90){
             myString=myString.replace(myString[i],(myString[i].code+32).toChar())
        }
    }
    return myString
}

fun main(){
    println("Lower Casing all alphabet in String \"VisHal GupTa\" ${allLowerCase("VisHal GupTa")}")
    println("Lower Casing all alphabet in String \"aBC viShal GuPTa\" ${allLowerCase("aBC viShal GuPTa")}")
    println("Lower Casing all alphabet in String \"UPPer CAse\" ${allLowerCase("UPPer CAse")}")
}