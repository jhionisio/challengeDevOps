package dev.ops.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.ops.api.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
