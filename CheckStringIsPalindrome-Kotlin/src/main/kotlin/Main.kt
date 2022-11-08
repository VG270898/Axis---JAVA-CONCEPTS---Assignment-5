fun isStringPalindrome(myString:String):Boolean{
    var j=myString.length-1
    for(i in 0..myString.length/2){
        if(myString[i]!=myString[j]){
            return false
        }
        j-=1
    }
    return true
}
fun main(){
    println("\"Vishal Gupta\" is Palindrome : ${isStringPalindrome("Vishal Gupta")}")
    println("\"radar\" is Palindrome : ${isStringPalindrome("radar")}")
    println("\"Radar\" is Palindrome : ${isStringPalindrome("Radar")}")
    println("\"madam\" is Palindrome : ${isStringPalindrome("madam")}")
}