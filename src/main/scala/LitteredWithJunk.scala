
object LitteredWithJunk extends App {
    def hackyParsingAndGreeting(input: Any): Unit =
        if (input.isInstanceOf[String]) {
            val stringInput = input.asInstanceOf[String]
            var dumbFormattedName: String = null
            if (stringInput.trim.forall(_.isLetter))
                dumbFormattedName = stringInput.trim().toLowerCase().capitalize
            else 
                throw new Exception("Bad input!")

            if (dumbFormattedName == null)
                return

            println("Hello " + dumbFormattedName)
        } else {
            throw new Exception("Input is not a String")
        }

    hackyParsingAndGreeting("  morgan ")
}