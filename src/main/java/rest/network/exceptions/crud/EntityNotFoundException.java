package rest.network.exceptions.crud;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class EntityNotFoundException extends CrudException {
    protected Long id;

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(Long id, String message) {
        super(message);
        this.id = id;
    }

    public EntityNotFoundException(Long id) {
        super();
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "Произошла ошибка при получении сущности с id = " + id;
    }
}
