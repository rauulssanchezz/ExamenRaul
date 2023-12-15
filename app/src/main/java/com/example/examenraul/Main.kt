package com.example.examenraul

fun main() {
    //Videojuego
    val juego1 = Videojuego("Juego1", "Xbox", "2000")
    val juego2 = Videojuego("Juego2", "PC", "500")
    val juego3 = Videojuego("Juego3", "Play", "500")
    val juego4 = Videojuego("Juego4", "Play", "500")

    //Ejercicio2
    println()
    var lista = arrayOf(juego1, juego2, juego3,juego4)
    var newlista = filtrarJuegos(lista, "500")
    println(newlista.size)
    newlista.forEach {
        println(it.nombre)
    }

    //Ejercicio3
    println()
    var mapa = mapaJuegos(newlista)
    println(mapa.entries)



    //Ejercicio4
    println()
    var platadorma= plataformas(lista)
    platadorma.forEach {
        println(it)
    }

    var pos1= mutableListOf<Int>(1,1)
    var pos2=mutableListOf<Int>(2,1)
    //Circunferencia
    println()
    var circunferencia=Circunferencia(pos1,pos2,2.5)
    println(circunferencia.longitud())
    println(circunferencia.toString())

    //Circulo
    println()
    var circulo=Circulo(2.3,"Azul")
    println(circulo.area())
    println(circulo.toString())

    //Ejercicio10
    println()
    var madrid=EquipoFutbol("Real de Madrid","España")
    var barsa=madrid.copy("Barsa")
    var psg=EquipoFutbol("Paris saint GERMAN","Francia")
    var granada=madrid.copy("Granada","Francia")
    var malaga=madrid.copy("Malaga","Francia")
    var villareal=madrid.copy("Villareal","Francia")
    var bilbao=madrid.copy("Bilbao","Alemania")
    var alicante=madrid.copy("Alicante","Alemania")
    var sevilla=madrid.copy("Sevilla","Alemania")
    var almeria=madrid.copy("Almeria","Alemania")
    var cojones=madrid.copy("64")
    var que=madrid.copy("KLK")
    var largo=madrid.copy("Manin","Italia")
    var es=madrid.copy("Esonoes","Italia")
    var esta=madrid.copy("This","Italia")
    var mierda=madrid.copy("FockinBarpis","Italia")

    var fubito= arrayListOf<EquipoFutbol>(madrid,barsa,psg,granada,malaga,villareal,
                                        bilbao,alicante,sevilla,almeria,cojones,que,
                                        largo,es,esta,mierda)

    //Ejercicio11
    println()
    championsLeague(fubito)

}

//Ejercicio2
fun filtrarJuegos(lista:Array<Videojuego>, año:String):MutableList<Videojuego>{
    var juegos= mutableListOf<Videojuego>()
    for (i in lista){
        if(i.salida.equals(año)){
            juegos.add(i)
        }
    }
    return juegos
}

//Ejercicio3
fun mapaJuegos(lista:MutableList<Videojuego>): Map<String, MutableList<Videojuego>> {
    var lista1= mutableListOf<String>()
    var lista2= mutableListOf<Videojuego>()
    var mapa= mutableMapOf<String,MutableList<Videojuego>>()

    lista.forEach {
        if (!lista1.contains(it.plataforma)){
            lista1.add(it.plataforma)
        }
    }

    lista1.forEach {
        lista2= mutableListOf()
        lista.forEach { it2 ->
            if (it2.plataforma.equals(it)){
                lista2.add(it2)
            }
        }
        mapa.put(it,lista2)
    }

    return mapa
}

//Ejercicio4
fun plataformas(lista:Array<Videojuego>): MutableList<String> {
    var juegos= mutableListOf<String>()
    lista.forEach {
        if (!juegos.contains(it.plataforma)){
            juegos.add(it.plataforma)
        }
    }
    return juegos
}

//Ejercicio11
fun championsLeague(lista:MutableList<EquipoFutbol>){
    var lista1=lista
    var local:EquipoFutbol
    var visitante:EquipoFutbol

    lista1.shuffle()

    while (lista1.size>0){
        local=lista1[0]
        println(local.nombre)
        lista1.remove(local)
        println("vs")
        while (lista1.size>0){
            visitante=lista1[0]
            if (!visitante.equals(local)){
                println(visitante.nombre)
                lista1.remove(visitante)
                println()
                break
            }
        }
    }

}