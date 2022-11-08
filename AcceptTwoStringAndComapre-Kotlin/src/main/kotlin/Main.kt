fun compareTwoString(myString1:String,myString2:String):Boolean{
    if(myString1.length!=myString2.length)
        return false
    else{
        for(i in 0..myString1.length-1){
            if(myString1[i]!=myString2[i]){
                return false
            }
        }
        return true
    }
}

fun main(){
    println(compareTwoString("Vishal Gupta","Vishal Gupta"))
    println(compareTwoString("Vishal Gupta","Vishal"))
    println(compareTwoString("Vishal Gupta","Vishal Kumar"))
    println(compareTwoString(" "," "))
}