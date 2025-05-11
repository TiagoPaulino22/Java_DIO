package com.dio.dto;

import com.dio.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long Id,
		String name,
	    BoardColumnKindEnum kind,
	    int cardsAmount) {}
 
   


