package ru.startandroid.realm;

/**
 * Created by zhangali on 27.12.16.
 */

public class Users {
    String name;
    String surname;

    public Users(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
