data class Google(override val id: Int, override val mail: String, override val password: String)
    : User(id, mail, password){}
