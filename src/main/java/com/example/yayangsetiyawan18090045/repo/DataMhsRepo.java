package com.example.yayangsetiyawan18090045.repo;

import com.example.yayangsetiyawan18090045.entity.DataMhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}