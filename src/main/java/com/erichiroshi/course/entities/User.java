package com.erichiroshi.course.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@Getter @Setter Long id;
	@Getter @Setter private String name;
	@Getter @Setter private String email;
	@Getter @Setter private String phone;
	@Getter @Setter private String password;
	
	
}
