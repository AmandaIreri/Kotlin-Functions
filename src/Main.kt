fun main(){
    greeting("Ada")
    greeting("Amanda")

remainder(19,6)

    sum(4,3,2,1)

    interestingFact()
}
fun greeting(name:String){
    println("Hello"+ ' ' + name)
}
fun remainder(num1:Int ,num2:Int){
    var result= num1 % num2
    println (result)
}
fun sum(x:Int, y:Int,z:Int, k:Int ){
    var result=x + y + z + k
    println(result)
}
fun interestingFact(){
    var fact ="I love basketball"
    println(fact)

}