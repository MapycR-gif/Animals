open class Animal (val type: String, val name:  String, val living: String, val food: String, val voice: String) {
init {
    println("Вид - $type")
    println("Имя - $name")
    println("Среда обитания - $living")
    println("Еда - $food")
    println("Издаёт звук - $voice")

}
}