package com.challenge.forumhub.api.repository;

import com.challenge.forumhub.api.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
