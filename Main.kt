package Kotlin_08_PhoneBookApp

fun main(){

    val contacts = mutableListOf<Contact>()

    var lock = true

    while(lock){

        println("Insert action you want to do: (add, view, modify, remove, exit)")
        val action = readln().lowercase()

        when(action){

            "add" -> {
                println("Insert name of contact: ")
                val name = readln()
                println("Insert phone number: ")
                val number = readln()
                val id = contacts.size
                val newContact = Contact(id, name, number)
                contacts.add(newContact)
                println("Contact '$name' successfully added with id $id")
            }

            "view" -> {
                println("List of contacts: ")
                contacts.forEach{println("${it.id}: ${it.name} ${it.phone}")}
            }

            "modify" -> {
                try {
                    println("Insert id of contact you want to modify: ")
                    val id = readln().toInt()
                    val contact = contacts.first { it.id == id } // The first function returns the first element from the list that satisfies the given condition. Which is in { }
                    println("Insert new name for contact: ")
                    contact.name = readLine()!!
                    println("Insert new phone number: ")
                    contact.phone = readLine()!!
                    println("Contact successfully updated!")
                } catch (e: NoSuchElementException){
                    println("Error: Contact with this id does not exist")
                }
            }

            "remove" -> {
                try{
                    println("Insert id of contact you want to remove: ")
                    val id = readln().toInt()
                    contacts.removeIf {it.id == id}
                    println("Contact successfully removed")
                } catch (e: Exception){
                    println("Error: Contact with this id does not exist")
                }
            }

            "exit" -> lock = false
            else -> println("Uknown action")
        }
    }
}