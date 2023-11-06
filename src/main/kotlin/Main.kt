import java.util.*

fun main(args: Array<String>) {


    //      final var post = new Post("Content","author", 0);
    //       System.out.print(post);
    val `in` = Scanner(System.`in`)
    var temp: String
    var tempDouble = 0.0
    var tempInt = 0


    val service = WallService()

    println("Введите имя автора статьи")
    temp = `in`.nextLine()
    service.post.author=temp

    println("Введите ID автора статьи")
    temp = `in`.nextLine()
    tempInt = temp.toInt()
    service.post.authorId=tempInt

    println("Введите работу(Job) автора статьи")
    temp = `in`.nextLine()
    service.post.authorJob=temp

    println("Введите ссылку на аватар автора статьи")
    temp = `in`.nextLine()
    service.post.authorAvatar=temp

    println("Введите саму статью")
    temp = `in`.nextLine()
    service.post.content=temp

    println("Добавить вложение? 0 - да, 1 - нет")
    temp = `in`.nextLine()
    if (temp == "0") {
        println("Какой тип вложения добавить? IMAGE - 0, VIDEO - 1, AUDIO - 2")
        temp = `in`.nextLine()
        if (temp == "0") {
            temp = "IMAGE"
            service.post.attach.type=temp
        }
        if (temp == "1") {
            temp = "VIDEO"
            service.post.attach.type=temp
        }
        if (temp == "2") {
            temp = "AUDIO"
            service.post.attach.type=temp
        }
        println("Введите ссылку на $temp")
        temp = `in`.nextLine()
        service.post.attach.url=temp
    }

    //service.setLink("https://" + service.getId()+ ".com");
    // service.setPublished(String.valueOf(service.getDate()));

    //service.setLink("https://" + service.getId()+ ".com");
    // service.setPublished(String.valueOf(service.getDate()));
    println("Введите свои координаты по широте (lat)")
    temp = `in`.nextLine()
    tempDouble = temp.toDouble()
    service.post.coords.lat=tempDouble

    println("Введите свои координаты по долготе (long)")
    temp = `in`.nextLine()
    tempDouble = temp.toDouble()
    service.post.coords.long=tempDouble


    println("Оценить свою статью? 0 - да, 1 - нет")
    temp = `in`.nextLine()

    if (temp == "0") {
        service.like()
        service.post.likesByMe =true
    }



    System.out.println("Информация о статье \n" + service.post


    )



}