package br.com.rita.projects.services.exceptions;

public class DuplicatedDataException extends RuntimeException{

    public DuplicatedDataException(String message) {
        super(message);
    }
}
