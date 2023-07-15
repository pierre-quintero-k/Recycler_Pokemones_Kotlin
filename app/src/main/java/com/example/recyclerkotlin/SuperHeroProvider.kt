package com.example.recyclerkotlin

class SuperHeroProvider {
    companion object{
        val superheroList = listOf<SuperHero>(
            SuperHero("Charmander", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png" ),
            SuperHero( "Bulbasaur", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png"),
            SuperHero("Caterpie", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/010.png"),
            SuperHero("Blastoise", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png" ),
            SuperHero("Pigeot", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/018.png"),
            SuperHero("NidoQueen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/031.png"),
            SuperHero("Arcanine", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/059.png"),
        )
    }
}