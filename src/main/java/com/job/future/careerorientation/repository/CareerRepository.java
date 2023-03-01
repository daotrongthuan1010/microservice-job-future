package com.job.future.careerorientation.repository;

import com.job.future.careerorientation.entity.Career;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
@Repository
public interface CareerRepository extends JpaRepository<Career, Long> {




}