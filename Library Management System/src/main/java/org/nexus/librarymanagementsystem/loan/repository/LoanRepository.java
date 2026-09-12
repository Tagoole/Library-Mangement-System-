package org.nexus.librarymanagementsystem.loan.repository;

import org.nexus.librarymanagementsystem.loan.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
  long countByBookIdAndReturnedAtIsNull(Long bookId);

    @Query("SELECT ln FROM Loan ln JOIN FETCH ln.book JOIN FETCH ln.member")
    List<Loan> findAllWithBookAndMember();
}
