package com.tom

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    var s : String? = null
//    println(s!!.length)
    println(s?.get(3))
    println(s?.substring(3))
    println(s?.substring(1,4))

    val h = Human(66.5f,1.7f)
    h.hello()
    println(h.bmi())

    val score =88
    println(score >60)
    val  c :Char ='A'
    println(c.toInt() >60)

   /* var age : Int = 19
    val age2 = 20//自動推斷型態
    age = 21
    var weight = 66.5f
    var name : String
    name ="Hank"*/


}
class  Human(var weight : Float,var height : Float,var name: String =""){
    init {
        println("test $weight")
    }
//    constructor(name: String,weight: Float,height: Float):this(weight,height)

    fun bmi() :Float{
        val bmi = weight/(height*height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin")
    }
}