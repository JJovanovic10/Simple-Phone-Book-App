package Kotlin_08_PhoneBookApp

data class Contact(val id: Int, var name: String, var phone: String) {
    // data class generates toString, equals, hashCode by itself
}