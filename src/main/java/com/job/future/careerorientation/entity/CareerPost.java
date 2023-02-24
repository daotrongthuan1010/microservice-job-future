package com.job.future.careerorientation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CareerPost extends AuditLog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "title_post")
  private String title;

  @Column(name ="content_post")
  private String content;

  @Column(name = "views")
  private Long views;

  @Column(name = "rating")
  private Integer rating;

  @Column(name = "user_id")
  private Long userId;

  @Column(name = "career_path_id")
  private Long careerPathId;

}
