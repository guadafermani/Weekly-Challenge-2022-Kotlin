package com.mouredev.weeklychallenge2022

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL

/*
 * Reto #5
 * ASPECT RATIO DE UNA IMAGEN
 * Fecha publicación enunciado: 01/02/22
 * Fecha publicación resolución: 07/02/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea un programa que se encargue de calcular y el aspect ratio de una imagen a partir de una url.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

class Challenge5 {

    fun calculateAspectRatio(src: String) {
        Thread {
            val image = getImageFromURL(src)
            val width = image.width
            val height = image.height
            val gcd = Challenge5().gcd(width, height)
            println("El aspect ratio de la imagen es: ${width / gcd} : ${height / gcd}")
        }.start()
    }

    fun getImageFromURL(src: String): Bitmap {
        val url = URL(src)
        return BitmapFactory.decodeStream(url.openStream())
    }

    private fun gcd(number1: Int, number2: Int): Int {
        var n1 = number1
        var n2 = number2
        while (n1 != n2) {
            if (n1 > n2)
                n1 -= n2
            else
                n2 -= n1
        }
        return n1
    }
}