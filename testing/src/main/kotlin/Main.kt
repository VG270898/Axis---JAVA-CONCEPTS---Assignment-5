fun main(){
var k = "2+33.5*5".toMutableList()
if(!k[k.lastIndex].isDigit()){
    k.removeAt(-1)
}
var l = mutableListOf<String>()
var j=0
var digit: String=""
for(i in k){
    print(i)
    if(i.isDigit() || i=='.'){
        digit += i
    }
    else{
        l.add(digit)
        l.add(i.toString())
        digit=""
    }
}
if(digit.isNotBlank()){
    l.add(digit)
}
 println(l)

}