package uz.nurlibay.flowguide.livedata

class Repository {

    private val users = mutableListOf<User>()

    suspend fun getUsers(): MutableList<User> {
        repeat(10){
            users.add(User(id = (it + 1), "User ${it + 1}"))
        }
        return users
    }
}

data class User(
    val id: Int,
    val name: String
)