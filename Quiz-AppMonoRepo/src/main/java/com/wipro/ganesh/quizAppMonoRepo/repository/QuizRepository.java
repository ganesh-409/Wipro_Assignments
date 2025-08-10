package com.wipro.ganesh.quizAppMonoRepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ganesh.quizAppMonoRepo.entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
