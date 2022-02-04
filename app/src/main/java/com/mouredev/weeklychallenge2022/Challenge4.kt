package com.mouredev.weeklychallenge2022

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    area(Triangle(3.0, 4.0))
    area(Rectangle(4.0, 5.0))
    area(Square(6.0))
}

interface Polygon{
    fun area()
}

data class Triangle(val base: Double, val height: Double): Polygon{
    override fun area() {
        val area = base * height / 2
        println("El área del triángulo de base $base y altura $height es $area")
    }
}

data class Rectangle(val length: Double, val width: Double): Polygon{
    override fun area() {
        val area = length * width
        println("El área del rectángulo de largo $length y ancho $width es $area")
    }
}
data class Square(val side: Double): Polygon{
    override fun area() {
        val area = side * side
        println("El área del cuadrado de lado $side es $area")
    }
}

private fun area(polygon: Polygon){
    polygon.area()
}