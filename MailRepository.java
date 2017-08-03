package com.vedams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedams.model.MailEntity;

@Repository
public interface MailRepository extends JpaRepository<MailEntity, String> {

}
