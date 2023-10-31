package com.example.familytree.models.dto;

import com.example.familytree.entities.UserAccountEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class TokenResponse {
    private String accessToken;
    private String refreshToken;
}