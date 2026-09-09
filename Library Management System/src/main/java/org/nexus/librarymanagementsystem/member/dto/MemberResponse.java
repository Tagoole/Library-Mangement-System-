package org.nexus.librarymanagementsystem.member.dto;

import jakarta.validation.constraints.Email;
import org.nexus.librarymanagementsystem.loan.model.Loan;

import java.time.LocalDateTime;
import java.util.List;

public record MemberResponse(
        Long id,
        String username,
        String email,
        LocalDateTime createdAt

) {
}
