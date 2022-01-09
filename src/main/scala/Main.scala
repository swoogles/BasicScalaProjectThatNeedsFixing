import java.time.Instant
object Main extends App {
    val currentTime = Instant.now()
    println(currentTime)
}

// "-Wunused"
// sbt "scalafixEnable; scalafix RemoveUnused"
object LitteredWithJunk extends App {
    val x = "Useless!"
    "eh"
    println("Bop")
}