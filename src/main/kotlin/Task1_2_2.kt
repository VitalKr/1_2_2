fun main(args: Array<String>) {
    println("Введите количество лайков:")
    val l = readln()
    var likes = 0
    try {
        likes = l.toInt()
        println("Количество лайков: $likes ")
        println("")
    } catch (e: Exception) {
        println("Вы ввели не число")
        print("Это не ")
    }
    if (likes % 10 == 1) {
        println("Нравится $likes человеку")
    } else {
        println("Нравится $likes людям")
    }
}