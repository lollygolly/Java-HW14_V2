package ru.netology.domain;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(int id) {
        super("Товар с ID равным " + id + " уже добавлен в репозиторий");
    }
}
