package com.space.repository;

import com.space.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vlad100 {@literal <fuuler10@mail.ru>}
 */

public interface ShipRepository extends JpaRepository<Ship, Long> {
}
