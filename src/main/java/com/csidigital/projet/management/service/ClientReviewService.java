package com.csidigital.projet.management.service;

import com.csidigital.projet.dao.entity.ClientReview;
import com.csidigital.projet.shared.dto.Request.ClientReviewDtoRequest;
import com.csidigital.projet.shared.dto.Response.ClientReviewDtoResponse;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClientReviewService {


    // Get All clientReview
    List<ClientReviewDtoResponse> getAllClientReview();

    // Get clientReview by id
    ClientReviewDtoResponse getClientReviewById(Long id);

    // Add new ClientReview
    ClientReviewDtoResponse CreateClientReview(ClientReviewDtoRequest clientReviewDtoRequest);

   //Update ClientReview
    ClientReviewDtoResponse updateClientReview(ClientReviewDtoRequest clientReviewDtoRequest , Long id);

    //delete clientReview by id
    void deleteClientReviewById(Long id);
}
