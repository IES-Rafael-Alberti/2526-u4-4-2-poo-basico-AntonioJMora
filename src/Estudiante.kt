class Estudiante(private val nombre: String, private var nota : Double) {
    constructor(nombre: String): this(nombre, 0.0)
    init {
        require (nota in 0.0..10.0) {"La nota debe estar dentro del rango 0-10"}
    }

    fun setNota(nota: Double){
        if (nota < 0.0|| nota > 10.0){
            throw IllegalArgumentException("La nota debe estar dentro del rango 0-10")
        }
        this.nota = nota
    }

    override fun toString(): String {
        return "Estudiante: $nombre, nota: $nota"
    }

}