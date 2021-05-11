package com.tom

fun main() {
//    println("Hello kotlin");
//    Human().hello();
    val h = Human();
    h.hello();
    var age : Int = 19;
    val age2 = 20;//自動推斷型態
    age = 21;
    var weight = 66.5f;
    var name : String
    name ="Hank";


}
class  Human{
    fun hello(){
        println("Hello Kotlin");
    }
}