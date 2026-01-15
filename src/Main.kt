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
    try {
        val estudiante1 = Estudiante("Juan", 12.0)
        val estudiante2 = Estudiante("Luisa", 22.1)
        val estudiante3 = Estudiante("Ana", 12.4)
    }



}