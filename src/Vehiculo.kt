class Vehiculo(private val marca: String, private val modelo: String, private var kilometraje: Double = 0.0) {
    fun registrarViaje(kilometros: Double){
        if (kilometros <= 0){
            throw IllegalArgumentException("Los kilometros deben ser mayores a 0")
        }
        kilometraje += kilometros
    }
    fun detalles(): String{
        val mensaje = """
            La marca del vehículo es $marca
            El modelo es $modelo
            El kilometraje es de $kilometraje km
        """.trimIndent()
        return mensaje
    }
}