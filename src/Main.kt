fun main() {
    var num =1
   var  count=0
    while (num<50){
        num++


    if (!iseven(num)){
        continue
    }
    count++
    println(num)}
    println("total even numbers are $count")
}

fun iseven(num: Int): Boolean{
    if ((num % 2)==0)
        return true
    else
        return false
}