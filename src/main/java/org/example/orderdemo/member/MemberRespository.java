package org.example.orderdemo.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface MemberRespository extends JpaRepository<Member, UUID> {
}