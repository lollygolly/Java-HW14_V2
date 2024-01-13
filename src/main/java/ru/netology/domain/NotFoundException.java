package ru.netology.domain;
public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Товар с ID равным " + id + " не найден");
    }
}
