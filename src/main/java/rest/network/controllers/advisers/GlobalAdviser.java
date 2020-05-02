package rest.network.controllers.advisers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import rest.network.exceptions.LogicException;
import rest.network.utils.HttpUtils;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestControllerAdvice
public class GlobalAdviser {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(HttpServletRequest request, Exception e) {
        log.warn("an error occurred while handle exception on path {}", request.getRequestURI(), e);
        return HttpUtils.internalServerError("Произошла непредвиденная ошибка");
    }

    @ExceptionHandler(LogicException.class)
    public ResponseEntity<String> handleLogicException(HttpServletRequest request, LogicException e) {
        log.warn("an error occurred while handle exception on path {}", request.getRequestURI(), e);
        return HttpUtils.internalServerError(e.getMessage());
    }
}
