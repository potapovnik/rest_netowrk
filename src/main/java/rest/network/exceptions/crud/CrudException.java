package rest.network.exceptions.crud;

import lombok.Data;
import lombok.NoArgsConstructor;
import rest.network.exceptions.LogicException;

public abstract class CrudException extends LogicException {

    public CrudException() {
        super();
    }

    public CrudException(String message) {
        super(message);
    }
}
