fun main() {
var word= "Akirachix"
    println(word[0].toString()+word[2].toString()+word[3])
var z = intro("Tanyasis" ,21)
    println(z)
    var x = txtLength()
    println(x)
    myRealName("Tanyasis")
}
fun intro(x:String ,y:Int):String{
  var intro = "Hi, my name is $x and I am $y years old"
    return intro
}
fun txtLength(): Int {
    var txt = "welcomingHost"
    return(txt.length)
}
fun myRealName(name:String){
    if(name=="Tanyasis")
        println("That's me ")
    else
        println("I don't know who that is")
}