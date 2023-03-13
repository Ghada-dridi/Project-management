package com.csidigital.projet.management.controller;


import com.csidigital.projet.management.service.ClientReviewService;
import com.csidigital.projet.shared.dto.Request.ClientReviewDtoRequest;
import com.csidigital.projet.shared.dto.Response.ClientReviewDtoResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clientReview")
public class ClientReviewController {

    private final ClientReviewService clientReviewService;


    @GetMapping("/getAllC")
    public ResponseEntity<List<ClientReviewDtoResponse>> getAllClientReview() {
        return new ResponseEntity<>(clientReviewService.getAllClientReview(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<ClientReviewDtoResponse> getClientReviewById(@PathVariable Long id) {
        return new ResponseEntity<>(clientReviewService.getClientReviewById(id), HttpStatus.OK);
    }

    @PostMapping("/addClientReview")
    public ResponseEntity<ClientReviewDtoResponse> createClientReview(@Valid @RequestBody ClientReviewDtoRequest clientReviewDtoRequest) {
        return new ResponseEntity<>(clientReviewService.CreateClientReview(clientReviewDtoRequest), HttpStatus.OK);
    }

    @PutMapping("/updateClientReview/{id}")
    public ResponseEntity<ClientReviewDtoResponse> updateClientReview(@Valid @RequestBody ClientReviewDtoRequest clientReviewDtoRequest, @PathVariable Long id) {
        return new ResponseEntity<>(clientReviewService.updateClientReview(clientReviewDtoRequest, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClientReview(@PathVariable Long id) {
        clientReviewService.deleteClientReviewById(id);
    }


}
