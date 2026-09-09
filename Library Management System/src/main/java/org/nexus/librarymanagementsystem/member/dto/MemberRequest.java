package org.nexus.librarymanagementsystem.member.dto;

import jakarta.validation.constraints.Email;

public record MemberRequest(
        String username,
        Email email
) {
}
