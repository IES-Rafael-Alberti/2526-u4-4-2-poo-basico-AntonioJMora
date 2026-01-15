class Libro(private val titulo: String,
            private val autor: String,
            private val numPaginas : Int = 100,
            private var leido : Boolean = false) {
    init {
        require(titulo.isNotBlank()) {"El título no puede estar vacío"}
        require(autor.isNotBlank()){"El autor no puede estar vacío"}
        require(numPaginas > 0 && numPaginas <= 5000) {"El numero de paginas debe ser entre 1 y 5000"}
    }
    override fun toString(): String {
        val estaLeido = if (leido) "Si" else "No"
        return "Libro: $titulo por $autor, Páginas: $numPaginas, Leído: $estaLeido"
    }
}