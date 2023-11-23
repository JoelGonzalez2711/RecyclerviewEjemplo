package com.example.recyclerviewejemplo

data class Superhero (
    var superhero:String,
    var publisher:String,
    var realName:String,
    var photo:String
)

val batman:Superhero = Superhero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg")
val batmanRealName = batman.realName //Recuperamos "Bruce Wayne"
batman.realName = "Soy Batman" //Cambiamos "Brece Wayne" por "Soy Batman"
batman.toString() //Devolverá todos los atributos con su valor