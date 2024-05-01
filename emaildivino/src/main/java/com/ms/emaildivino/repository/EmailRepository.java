package com.ms.emaildivino.repository;

import com.ms.emaildivino.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
