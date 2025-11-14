package nlu.fit.cinemabookingbackend.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
 * Thư mục này chứa custom exception và GlobalExceptionHandler.
 * Dùng để quản lý lỗi tập trung.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    // AppException → xử lý lỗi có kiểm soát
    @ExceptionHandler(AppException.class)
    public ResponseEntity<?> handleAppException(AppException e) {
        return ResponseEntity.status(e.getStatus()).body(e.getMessage());
    }

    // Exception → fallback cho các lỗi khác
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleSystemError(Exception ex) {
        return ResponseEntity.status(500).body("Lỗi hệ thống");
    }
}
