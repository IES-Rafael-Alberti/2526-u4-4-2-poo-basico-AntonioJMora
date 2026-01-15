class CuentaBancaria(private val titular: String, private var saldo: Double = 0.0) {
    fun ingresar(cantidad: Double) {
        if (cantidad > 0){
            saldo += cantidad
            println("El saldo actual es de: $saldo")
        }else{
            throw IllegalArgumentException("No es posible ingresar esa cantidad")
        }

    }

    fun retirar(cantidad: Double) {
        if (cantidad <= 0) {
            throw IllegalArgumentException("No es posible retirar esa cantidad")
        } else if (cantidad > saldo) {
            throw IllegalStateException("Error al retirar $cantidad, saldo insuficiente")
        }
        saldo -= cantidad
        println("El saldo actual es de: $saldo")
    }
}
