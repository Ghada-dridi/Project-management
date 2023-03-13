package com.csidigital.projet.shared.dto.Request;

import com.csidigital.projet.shared.enumeration.ReviewType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientReviewDtoRequest {
    private Date dateReview;
    private String subject;
    private String comment;
    private Integer satisfaction;
    private ReviewType reviewtype;
}
