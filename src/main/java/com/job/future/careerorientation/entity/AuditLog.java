package com.job.future.careerorientation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * AuditLog class to change in system.
 *
 * @author ThuanDao1010
 * @version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class AuditLog implements Serializable {

  private static final Long Serial = 1000L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @CreatedBy
  @Column(name = "created_by")
  private String createUser;

  @CreatedDate
  @Column(name = "creation_date")
  private LocalDateTime createDateTime;

  @LastModifiedBy
  @Column(name = "last_updated_by")
  private String updateUser;

  @LastModifiedDate
  @Column(name = "last_update_date")
  private LocalDateTime updateDateTime;


}
