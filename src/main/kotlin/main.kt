fun main() {

    val test1 = Email(54, "giuseiacono10@gmail.com", "bfgat")
    val test2 = Facebook(21, "ciao@gmail.com", "gdbcj")
    val test3 = Google(43, "paolo@gmail.com", "cvegd")

    log(test1)
    log(test2)
    log(test3)
}
    fun log(start : User) = when(start) {
        is Email -> println("$start")
        is Facebook -> println("$start")
        is Google -> println("$start")

    }
