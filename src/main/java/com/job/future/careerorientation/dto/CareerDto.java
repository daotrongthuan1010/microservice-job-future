package com.job.future.careerorientation.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CareerDto {


  private String name;

  private String description;

  private Double salaryAvg;

  private Double rating;

}
