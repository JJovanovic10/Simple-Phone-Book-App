package Kotlin_08_PhoneBookApp

class Contact_manual(val id: Int, var name: String, var phone: String){

    override fun toString(): String {
        return "Contact(id=$id, name=$name, phone=$phone)"
    }

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is Contact_manual) return false
        return id == other.id && name == other.name && phone == other.phone
    }

    override fun hashCode(): Int {
        return id.hashCode() * 31 + name.hashCode() * 31 + phone.hashCode()
    }



}