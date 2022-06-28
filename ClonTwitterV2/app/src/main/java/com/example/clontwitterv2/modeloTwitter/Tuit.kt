package com.example.clontwitterv2.modeloTwitter

/**
 * POJO que contendra cada Tuit
 */
data class Tuit(
    val nombre:String,
    val usuario:String,
    val fecha:String,
    val texto:String,
    val numComentarios:Int,
    val numLikes:Int,
    val numRt:Int,
    val avatar:Int,
    val esGif:Boolean,
    val imagen:List<Int>
)
