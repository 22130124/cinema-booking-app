package nlu.fit.cinemabookingbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/*
 * Thư mục này chứa toàn bộ các entity (bảng trong DB), nghĩa là map các table thành các entity:
 * - User
 * - Movie
 * - Showtime
 * - Booking
 * - Ticket
 */
@Setter
@Getter
@Entity
public class Example {
    // Các hàm getters và setters
    // Đây là thuộc tính id tương ứng trong database
    @Id
    private Integer id;

    // Đây là thuộc tính user_name trong database được map thành biến userName
    @Column(name = "user_name")
    private String userName;
}
