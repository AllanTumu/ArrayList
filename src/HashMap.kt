fun main (args:Array<String>){
    var map = HashMap<Int, String>()
    map.put(1, "Allan")
    map.put(2, "Jullian")
    map.put(3, "Joan")

    println(map.get(2)) //prints the map with index 2

    map.put(3,"Nimusiima")
    println(map.get(3))
}