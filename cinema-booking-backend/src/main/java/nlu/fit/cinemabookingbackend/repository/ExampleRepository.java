package nlu.fit.cinemabookingbackend.repository;

import nlu.fit.cinemabookingbackend.model.Example;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Thư mục này chứa các interface kế thừa từ JpaRepository.
 * Dùng để thao tác với database.
 */
public interface ExampleRepository extends JpaRepository<Example,Integer> {
}
