
import java.time.LocalDateTime
class Post {
    val currentDateTime = LocalDateTime.now()
    val dateAsString: String = currentDateTime.toString()

    var likes = 0
    var id = 1 + (Math.random() * (10000 - 1 + 1)).toInt()
    var authorId = 0
    var author: String? = null
    var authorJob: String? = null
    var authorAvatar: String? = null
    var content: String? = null
    var published: String? = dateAsString
    var link: String? = "https://" + id + ".com"
    var mentionedMe = false

    var likesByMe = false

    var coords = Coordinates()
    var attach = Attachment()

    fun Post(
        id: Int,
        authorId: Int,
        mentionedMe: Boolean,
        likesByMe: Boolean,
        authorJob: String?,
        authorAvatar: String?,
        published: String?,
        link: String?,
        content: String?,
        author: String?,
        likes: Int,
        lat: Double,
        Long: Double,
        type: String,
        url: String
    ) {
        this.id = id
        this.authorId = authorId
        this.mentionedMe = mentionedMe
        this.likesByMe = likesByMe
        this.authorJob = authorJob
        this.authorAvatar = authorAvatar
        this.content = content
        this.author = author
        this.likes = likes
        this.coords.lat = lat
        this.coords.long = Long
        this.attach.type = type
        this.attach.url = url
        this.link = link
        this.published = published
    }
    override fun toString(): String {
        return "${author} - Автор \n " +
                "${authorAvatar} - Ссылка на аватар \n " +
                "${authorId} - id автора \n " +
                "${authorId} - Работа автора \n " +
                "${link} - Ссылка на статью \n " +
                "${content} - Статья \n " +
                "${attach.type} - Тип вложения \n " +
                "${attach.url} - Ссылка на вложение \n " +
                "${likes} - Кол-во лайков \n " +
                "${likesByMe} - Мой лайк \n " +
                "${mentionedMe} - мой пост \n " +
                "${id} - id \n " +
                "${published} - время публикации \n " +
                "${coords.lat} - Координаты(широта) \n " +
                "${coords.long} - Координаты(долгота) \n "
    }



}

