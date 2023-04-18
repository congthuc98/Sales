package com.manager.sales.database.repository;

import com.manager.sales.database.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Xu ly thong tin doi voi table information
 *
 * @author thucnc
 * @date 2023/04/18
 */
@Repository
public interface InformationRepository extends JpaRepository<Information, long> {
}
