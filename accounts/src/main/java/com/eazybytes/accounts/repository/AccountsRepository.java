package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomerId(Long customerId);


    /**
     * Deletes all accounts associated with the given customerId.
     *
     * @param customerId The ID of the customer whose accounts are to be deleted.
     */
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
