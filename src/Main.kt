fun main() {
    //Cuenta Bancaria
    println("Ejercicio de la cuenta bancaria")

    val cuenta = CuentaBancaria("Juan")
    try {
        cuenta.ingresar(100.0)
        cuenta.retirar(50.0)
        cuenta.retirar(100.0)
    }catch (e: IllegalArgumentException){
        println(e.message)
    }catch (e: IllegalStateException){
        println(e.message)
    }

    println()
    println("*******************************")
    println()

    // Vehículo
    println("Ejercicio del Vehículo")
    val vehiculo = Vehiculo("Kia", "Sportage")
    try {
        vehiculo.registrarViaje(100.0)
        println(vehiculo.detalles())
    }catch (e: IllegalArgumentException){
        println(e.message)
    }

    println()
    println("*******************************")
    println()

    //Libro
    try {
        val libro1 = Libro("Invisible", "Eloy Moreno", leido =  true)
        val libro2 = Libro("Redes", "Eloy Moreno")
        println(libro1)
        println(libro2)
        val libro3 = Libro("", "Eloy Moreno")
        println(libro3)
    }catch (e: IllegalArgumentException){
        println(e.message)
    }

    println()
    println("*******************************")
    println()

    //Estudiante
    val datosEstudiantes = listOf(
        "Alberto" to 10.0,
        "Juan" to 12.0,
        "Ana" to 22.1,
        "Julio" to 6.9
    )
    for ((nombre, nota) in datosEstudiantes) {
        try {
            val estudiante = Estudiante(nombre, nota)
            println(estudiante)
        }catch (e: IllegalArgumentException){
            println(e.message)
        }
    }

    println()
    println("*******************************")
    println()

    //Producto
    val manzana = Producto("Manzana", 1.2,22)
    val pera = Producto("Pera", 1.2, 30)
    val sandia = Producto("Sandia", 3.5, 40)
    try {
        println(manzana.toString())
        println(pera.toString())
        println(sandia.toString())
        manzana.vender(15)
        pera.reabastecer(5)
        sandia.vender(41)
        println(manzana.toString())
        println(pera.toString())
        println(sandia.toString())
    }catch (e: IllegalArgumentException){
        println(e.message)
    }

}