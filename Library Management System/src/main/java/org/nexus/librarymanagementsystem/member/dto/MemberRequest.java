package org.nexus.librarymanagementsystem.member.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record MemberRequest(
    @NotBlank(message = "Username cannot be blank") String username,
    @NotBlank(message = "Email cannot be blank") @Email(message = "Must be a valid email address")
        String email) {}
