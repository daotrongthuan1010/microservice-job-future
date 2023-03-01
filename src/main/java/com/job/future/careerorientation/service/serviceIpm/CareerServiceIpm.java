package com.job.future.careerorientation.service.serviceIpm;

import com.job.future.careerorientation.dto.CareerDto;
import com.job.future.careerorientation.entity.Career;
import com.job.future.careerorientation.exception.ServiceException;
import com.job.future.careerorientation.repository.CareerRepository;
import com.job.future.careerorientation.service.CareerService;
import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
@Service
@RequiredArgsConstructor
public class CareerServiceIpm implements CareerService {

  @Autowired
  private CareerRepository  careerRepository;


  @Override
  public Optional<CareerDto> findById(Long id) throws ServiceException {
    Optional<Career> optionalCareer = careerRepository.findById(id);
    if (!optionalCareer.isPresent()) {
      return Optional.empty();
    }
    Career career = optionalCareer.get();
    CareerDto careerDto = CareerDto.builder()
        .name(career.getName())
        .salaryAvg(career.getSalaryAvg())
        .rating(career.getRating())
        .description(career.getDescription())
        .build();
    return Optional.of(careerDto);
  }

  @Override
  public List<CareerDto> findAllByName(String name) {
    return null;
  }
  @Transactional
  @Override
  public void save(CareerDto careerDto) {

    careerRepository.save(Career.builder()
            .name(careerDto.getName())
            .rating(careerDto.getRating())
            .salaryAvg(careerDto.getSalaryAvg())
            .description(careerDto.getDescription())
            .build());
  }

  @Override
  public void deleteById(Long id) {

  }

  @Override
  public void deleteByName(String name) {

  }
}
