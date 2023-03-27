package com.assessment.employee.Repositories;

import com.assessment.employee.Entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;



@EnableJpaRepositories
@Repository
public interface SkillRepo extends JpaRepository<Skill, Long> {

}
