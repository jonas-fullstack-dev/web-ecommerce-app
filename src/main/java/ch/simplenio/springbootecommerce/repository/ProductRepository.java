package ch.simplenio.springbootecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.simplenio.springbootecommerce.entity.Product;

/**
 * @author jfurrer
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
