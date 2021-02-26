package com.example.hustle.repository;

import com.example.hustle.customquery.UserRepositoryCustom;
import com.example.hustle.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

// No need implementation, just one interface, and you have CRUD, thanks Spring Data
public interface UserRepository extends MongoRepository<User, Long>, UserRepositoryCustom {

    User findFirstByDomain(String domain);

    User findByDomainAndDisplayAds(String domain, boolean displayAds);

    //Supports native JSON query string
    @Query("{domain:'?0'}")
    User findCustomByDomain(String domain);

    @Query("{domain: { $regex: ?0 } })")
    List<User> findCustomByRegExDomain(String domain);

}