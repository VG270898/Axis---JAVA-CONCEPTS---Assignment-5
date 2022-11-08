fun eval(expr:String):Double{
    var k = expr.toString().toMutableList()
    if(!k[k.lastIndex].isDigit()){
        k.removeAt(-1)
    }
    var l = mutableListOf<String>()
    var j=0
    var digit: String=""
    for(i in k){
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

    print(l)

    while (l.size>1){
        if("/" in l) {
            var i = l.indexOf("/")
            var div = l[i - 1].toDouble() / l[i + 1].toDouble()
            l.removeAt(i-1)
            l.removeAt(i-1)
            l.removeAt(i-1)
            l.add(i - 1, div.toString())
        }
        else if("*" in l) {
            var i = l.indexOf("*")
            var div = l[i - 1].toDouble() * l[i + 1].toDouble()
            l.removeAt(i-1)
            l.removeAt(i-1)
            l.removeAt(i-1)
            l.add(i - 1, div.toString())
        }
        else if("+" in l) {
            var i = l.indexOf("+")
            var div = l[i - 1].toDouble() + l[i + 1].toDouble()
            l.removeAt(i-1)
            l.removeAt(i-1)
            l.removeAt(i-1)
            l.add(i - 1, div.toString())
        }
        else if("-" in l) {
            var i = l.indexOf("-")
            var div = l[i - 1].toDouble() - l[i + 1].toDouble()
            l.removeAt(i-1)
            l.removeAt(i-1)
            l.removeAt(i-1)
            l.add(i - 1, div.toString())
        }

    }
    return l[0].toDouble()
}

fun main(){
    print(eval("2+41.5+5*34-12/2+4*2/4"))
}