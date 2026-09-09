package org.nexus.librarymanagementsystem.member.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.nexus.librarymanagementsystem.loan.model.Loan;

@Entity
@Table(name = "members")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;

  @Column(nullable = false, name = "username")
  private String userName;

  @Email(message = "Must be a valid email address")
  @Column(nullable = false, unique = true)
  private String email;

  @OneToMany(mappedBy = "member")
  private List<Loan> loanList = new ArrayList<>();

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @PrePersist
  protected void onCreate() {
    this.createdAt = LocalDateTime.now();
  }
}
