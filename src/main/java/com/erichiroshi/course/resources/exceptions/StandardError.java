package com.erichiroshi.course.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT")
	private Instant timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
}
