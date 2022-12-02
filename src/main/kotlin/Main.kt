fun main() {
    val hare = Herbivores ("Травоядные",  "Заяц", "Лес",  "Кора",  "прыг-прыг"
    )
hare.loveFood()
    val elephant = Herbivores ( "Травоядные",  "Слон",  "Саванна", "Листва",  "умммм"
        )
elephant.loveFood()
    val cat = Predators ("Хищники", "Кошка", "Жилище", "мышь",  "Мяу!"
    )
cat.behaviour()
    val wolf = Predators ("Хищники",  "Волк", "Лес", "мясо", "УУУУУ!"
    )
wolf.behaviour()



}






