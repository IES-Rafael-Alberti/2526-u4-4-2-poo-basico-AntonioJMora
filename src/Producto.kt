class Producto(
    private val nombre: String,
    private val precio: Double,
    private var stock: Int
) {
    init {
        require(precio >= 0.0){"El precio debe ser mayor o igual a 0"}
        require(stock >= 0){"El stock debe ser mayor o igual a 0"}
    }
    fun vender(cantidad: Int){
        if (cantidad > stock){
            println("No hay suficiente stock para vender esa cantidad")
        }else{
            stock -= cantidad
        }
    }
    fun reabastecer(cantidad: Int){
        if (cantidad > 0){
            stock += cantidad
        }
    }
    override fun toString(): String {
        return "Producto: $nombre, Precio: $precio, Stock: $stock"
    }
}