public class Main {
    public static void main(String[] args){

        Post post = new Post();
        post.surname = "Ivanov";
        post.name = "Ivan";
        post.patronymic = "Ivanovich";
        post.passport = "1313 № 131313";
        post.phone = "+7 (131)-131-13-13";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 3;
        post.birthday.year = 1993;
    }
}
