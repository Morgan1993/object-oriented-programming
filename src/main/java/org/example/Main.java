package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 7;
        post.birthday.year = 1999;
        post.name = "Иван";
        post.passport = "4444 №444444";
        post.patronymic = "Иванов";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}