package org.nexus.librarymanagementsystem.book.dto;


import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import org.nexus.librarymanagementsystem.loan.model.Loan;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public record BookRequest(
        String title,
        String author,
        String isbn,
        int totalCopies
) {
}
