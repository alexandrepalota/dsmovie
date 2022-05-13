package com.devsuperior.dsmovie.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ScoreDTO {

    private Long movieId;
    private String email;
    private Double score;

}
