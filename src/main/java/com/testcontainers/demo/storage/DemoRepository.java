package com.testcontainers.demo.storage;

import com.testcontainers.demo.model.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DemoRepository extends JpaRepository<DemoEntity, UUID> {
}
