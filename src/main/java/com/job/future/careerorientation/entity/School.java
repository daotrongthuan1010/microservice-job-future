package com.job.future.careerorientation.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class School {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String location;

  private String description;

  private Long jobCategoryId;

  private String linkSchool;

}
