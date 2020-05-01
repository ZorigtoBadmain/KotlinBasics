package com.badmain.homeworkkotlinbasics

fun main() {
    val s = readLine()?.toIntOrNull() ?:return
    val num = getList(s)
    val sum = num.sum()
    println("Кол-во четных чисел ${num.filter { it%2 == 0 }}")
    println("Кол-во уникальных чисел ${num.toSet()}")
    println("Сумма всех введеных чисел ${sum}")

    val map = mutableMapOf<Int, Int>()
    num.forEach{map[it] = gcd(it,sum)}
    map.forEach{(key,value) ->
        println("Число $key сумма $sum НОД $value")}
}
fun  getList(n:Int):List<Int>{
    val mutableList = mutableListOf<Int>()
    var i = 0
    while (i < n){
        println("Введите число: ")
        val s = readLine()?.toIntOrNull() ?:continue
        println("Вы ввели число $s")
        mutableList.add(s)
        i++
    }
    return mutableList
}