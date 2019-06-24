fun main (args:Array<String>){
    var sentence:String?
    sentence = "Welcome on board"

    println(sentence)
    println("small letters: " +sentence.toLowerCase())
    println("Upper case letters: " +sentence.toUpperCase())
    println("Array pick: " +sentence[5])
    println("Split: " +sentence.split(" "))
}