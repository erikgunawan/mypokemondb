package id.faazlab.mypokemondb

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform