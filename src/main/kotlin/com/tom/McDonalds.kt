package com.tom.kotlin

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    val mc = McDonalds()
    mc.printMenu()
//    println(mc.menu.get("201"))
    println(mc.menu["201"])
}

class McDonalds(){
    val br  = File("mcdonalds.txt").bufferedReader().lines()
    var menu = HashMap<String,Item>()
    fun printMenu(){
        br.forEach(){
            val token = it.split(",")
            val item = Item(
                token[0],
                token[1],
                token[2].toInt(),
                token[3].toInt())
            //menu.put(item.id,item)
            menu[item.id] = item
            println(it)
        }
    }
}

data class Item(val id:String, val name:String, val calorie: Int, val price: Int)