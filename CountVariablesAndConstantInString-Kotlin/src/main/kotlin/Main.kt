import java.util.*

fun countVariablesAndConsonant(myString:String): Array<Int> {
    var vowelCount:Int=0
    var consonantCount:Int=0
    for(ch in myString.lowercase()){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowelCount += 1
        } else if (ch in 'a'..'z') {
            consonantCount += 1
        }

    }

    return arrayOf(vowelCount,consonantCount)
}

fun main(){
    val vc1 = countVariablesAndConsonant("Vishal Gupta")
    val vc2 = countVariablesAndConsonant("My Company name is Axis Bank")
    println("String \"Vishal Gupta\" contains " + vc1[0] + " and " + vc1[1] + " consonants")
    println("String \"My Company name is Axis Bank\" contains " + vc2[0] + " and " + vc2[1] + " consonants")
}
