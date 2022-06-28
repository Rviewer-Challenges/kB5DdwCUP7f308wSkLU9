package com.example.clontwitterv2.modeloTwitter

import com.example.clontwitterv2.R

/**
 * Clase que contiene la lista de tuit "recividos"
 */
class TuitProvider {
    companion object {
        val listaTuit = listOf<Tuit>(
            Tuit(
                "José Ramón Blanco \uD83D\uDCA2",
                "@jr_blanco_",
                "25 Jun",
                "Mis ultimas vistorias magistrales en #Fotnite",
            1,
            11,
            69,
            R.drawable.jr,
                false,
                listOf(R.drawable.fornite2, R.drawable.fortine1, R.drawable.fornite3)
            ),
            Tuit(
                "Brais Moure",
                "@mouredev",
                "23 Jun",
                "Junto con @Rviewer_ hemos creado un reto de programación para replicar partes de la App y así mejorar nuestro portfolio.\n" +
                        "Tienes toda la información para participar aquí:\n\n" +
                        "\uD83D\uDD17 https://go.rviewer.io/dev-twitter-mirroring-es/?utm_source=mouredev&utm_medium=github_repo&utm_campaign=twitter_mirroring_mouredev\n" +
                        "\n" +
                        "\uD83C\uDFC6 Y puedes ganar 100€ en material formativo",
                23,
                55,
                30,
            R.drawable.brais,
                false,
            listOf(R.drawable.brais200)
            ),
            Tuit(
                "José Ramón Blanco \uD83D\uDCA2",
                "@jr_blanco_",
                "23 Jun",
                "Buahhhh menudo lio esto del clon de #twitter, pero va quedando bien"+
                        "\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D",
                1,
                11,
                2,
                R.drawable.jr,
                false,
                listOf()
            ),
            Tuit(
                "AristiDevs",
                "@AristiDev",
                "15 Jun",
                "¡Olvídate de duplicar código!\n" +
                        "\n" +
                        "Hoy te voy a enseñar a crear tus propias librerías en #AndroidStudio \uD83D\uDCD3\uD83D\uDCD4\uD83D\uDCD2\n" +
                        "\n" +
                        "Nombre aquí abajo a tu compi que lo necesita\uD83D\uDC47\uD83D\uDC47" +
                        "https://www.youtube.com/watch?v=f_bYdEATkzg&t=2s",
                3,
                25,
                10,
            R.drawable.aris,
                false,
            listOf(R.drawable.curso4,R.drawable.curso2,R.drawable.curso3,R.drawable.curso1)
            ),
            Tuit(
                "José Ramón Blanco \uD83D\uDCA2",
                "@jr_blanco_",
                "25 Jun",
                "Se ven el #GIF, de aquella manera jejeje",
                1,
                11,
                2,
                R.drawable.jr,
                true,
                listOf(R.drawable.homer)
            ),
        )
    }
}