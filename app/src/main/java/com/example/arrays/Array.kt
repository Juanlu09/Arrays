package com.example.arrays

fun main() {

    //val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    //val numbers = intArrayOf(1, 2, 3, 4, 5, 6)

    val numbers = arrayOf(1, 2, 3, 4, 5, 6)

    //para mostrar los valores del array usamos  .contentToString()
    println("Los valores del array son: ${numbers.contentToString()}")

    //Con el for sacaremos todos los elementos del array
    for (element in numbers) {
        println(element)
    }

    //Por ejemplo, podemos hacer una cuenta directamente en el array con el bucle for
    for (element in numbers) {
        print("${element * 2} ")
    }

    //Las posiciones en en un array empiezan desde el 0, para mostrar un valor específico usamos:
    print("\n" + numbers[0])

    //Podemos modificar los valores del array de la siguiente forma:
    print("\nLos valores iniciales era: ${numbers.contentToString()}")
    numbers[0] = 43
    numbers[1] = 56
    numbers[2] = 12
    numbers[3] = 11
    numbers[4] = 30
    numbers[5] = 76
    print("\nLos valores actuales son: ${numbers.contentToString()}")

    //Haremos lo mismo pero con los días de la semana
    val days = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    print("\n" + days.contentToString())

    //Podemos usarlo añadiéndole más valores a cada elemento del array cogiéndolos de una data class:
    val fruits = arrayOf(Fruit("Plátano", 2.50), Fruit("Manzana", 1.20), Fruit("Fresas", 4.33))
    print("\n" + fruits.contentToString())

    for (frutas in fruits) {
        print("\n" + frutas)
    }

    //Si queremos poner solo los nombres o los precios:
    for (fruitName in fruits) {
        print("\n" + fruitName.name)
    }
    for (fruitPrice in fruits) {
        print("\n" + fruitPrice.price)
    }

    //Si queremos sacar el índice de cada elemento se hace de la siguiente forma:
    for (index in fruits.indices) {
        print("\n${fruits[index].name} está en el índice $index")
    }

    //También podemos mezclar diferentes tipos de datos en un mismo array
    val mix = arrayOf("Lunes", "Martes", "Miércoles", 1, 2, 3, Fruit("Naranja", 1.15))
    print("\n" + mix.contentToString())

    for (mixed in mix){
        print("\n" + mixed)
    }
}

data class Fruit(val name: String, val price: Double)