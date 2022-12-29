sealed class User (open val id: Int, open val mail: String, open val password: String){
    fun name() : String{
        return "Id: ${id}, mail: ${mail}, password: ${password}"
    }
}
