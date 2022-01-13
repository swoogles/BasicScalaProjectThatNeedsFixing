import java.time.Instant
object Main extends App {
    val currentTime = Instant.now()
    println(currentTime)
}

// "-Wunused"
// sbt "scalafixEnable; scalafix RemoveUnused"
object LitteredWithJunk extends App {
    def parseInput(input: String) = {
        var validatedName = null.asInstanceOf[String]
        if (input.forall(_.isLetter))
            validatedName = input
        else 
            throw new Exception("Bad input!")
        println("Hello " + validatedName)
    }

    "eh"
    val dumbVariable = "SelfEsteemIssues"
    println("Bop")
    def foo(): Unit = ???
}