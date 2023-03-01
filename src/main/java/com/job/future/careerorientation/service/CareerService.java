package com.job.future.careerorientation.service;

import com.job.future.careerorientation.dto.CareerDto;
import com.job.future.careerorientation.exception.ServiceException;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Modifying;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public interface CareerService {

  final String BAD_REQUEST  = "BAD_REQUEST";

  Optional<CareerDto> findById(Long id) throws ServiceException;

  List<CareerDto> findAllByName(String name);

  @Modifying
  void save(CareerDto careerDto);

  void deleteById(Long id);

  void deleteByName(String name);


}
