package com.example.capgemini.licenseuniversity.repository;

import com.example.capgemini.licenseuniversity.entity.LicensedTheme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicensedThemeRepository extends JpaRepository<LicensedTheme,Integer> {
}
