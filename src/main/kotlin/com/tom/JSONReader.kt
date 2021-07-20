package com.tom

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url = URL("https://data.taipei/api/getDatasetInfo/downloadResource?id=3e524f15-9ea7-461a-ae9f-9130b6e12840&rid=cc8ac0bd-af2d-4af3-ae10-018e3b400e0b")
    println(url.readText())

    /*with(url.openConnection() as HttpURLConnection){
        val br = inputStream.bufferedReader().lines().forEach(){
            println(it)
        }
    }*/

    /*val  connection = url.openConnection() as HttpURLConnection
    val br = BufferedReader(InputStreamReader(connection.inputStream))
    var line = br.readLine()
    val json = StringBuffer()
    while (line != null){
//        println(line)
        json.append(line)
        line = br.readLine()
    }
    println(json.toString())*/
}