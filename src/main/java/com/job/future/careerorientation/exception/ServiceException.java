package com.job.future.careerorientation.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
@Getter
@Builder
@AllArgsConstructor
public class ServiceException extends Exception {

  private final String causeId;
}
