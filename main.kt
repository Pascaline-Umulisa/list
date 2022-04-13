fun main(){
    var fruits= mutableListOf<String>()
    fruits.add("Banana")
    fruits.add("Apple")
    fruits.add("Mango")
    fruits.add("Avocado")
    println(fruits)
    fruits.add(1,"Grapes")
    println(fruits)
    var longNames=fruits.filter { fruit->fruit.length>5 }
    println(longNames)



    /*var ford=Car("ford", "Fiesta")
    var audi=Car("Audi", "A6")
    var toyota=Car("toyota","Corolla")
    var opel=Car("auti", "opel")
    var myCars= listOf(ford,toyota,opel,audi)
    println(findCarModel(myCars))*/

    var x=Person("Ruth",34)
    var y=Person("Paccy",17)
    var z=Person("Chiri",24)
    var t=Person("Liz",12)
    var people=listOf(x,y,z,t)
    var adults=people.filter { person->person.age>=18 }
    println(adults)
}
data class Person(var name:String, var age:Int)


data class Car(var make:String, var model:String)
fun findCarModel(cars:List<Car>):List<String>{
    var createLists= mutableListOf<String>()
    var vowels= listOf('a','i','o','u','e')
    cars.forEach { car ->
        if(vowels.contains(car.model.lowercase().first())){
            createLists.add(car.model)
        }
    }
    return createLists
}
  /* findSquares(listOf(1,2,5,6,8,3,7,9,10,11))
    var nums=listOf(12,56,34,21,54,67,23,6,79,8,2,3,4,5,9)
    var numSorted=nums.sorted()
    println(numSorted)
    var ford=Car("ford", "Fiesta")
    var audi=Car("Audi", "A6")
    var toyota=Car("toyota","Corolla")
    var myCars=listOf(ford,toyota,audi)
    myCars.forEach { car->
        println(car.model)
    }
    println(myCars.sortedBy { car->car.make })
}
data class Car(var make:String, var model:String)

fun findSquares(numbers:List<Int>){
   numbers.forEachIndexed { n, i ->
        if(n%2!=0){
            println(i*i)
        }
    }
    for (n in numbers){
        if (numbers.indexOf(n)%2!=0){
            println(n*n)
        }
    }
}*/
