fun main() {
    val song = Song("test","test",1999,1000)
}

class Song(val title: String, val artist: String, val releasedYear: Int, val numberOfViews: Int) {
    val isPopular = numberOfViews >= 1000
    
    fun printExplanation(){
        println("$title, performed by $artist, was released in $releasedYear.")
    }
}