package org.nexus.librarymanagementsystem.loan.repository;

import org.nexus.librarymanagementsystem.loan.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
