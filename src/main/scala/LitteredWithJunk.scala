object LitteredWithJunk extends App {
    def hackyParsingAndGreeting(input: String): Unit = {
        var dumbVariable = null.asInstanceOf[String]
        if (input.forall(_.isLetter))
            dumbVariable = input
        else 
            throw new Exception("Bad input!")

        if (dumbVariable == null)
            return

        println("Hello " + dumbVariable)
    }
}