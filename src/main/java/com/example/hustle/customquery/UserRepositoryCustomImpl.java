package com.example.hustle.customquery;

import com.example.hustle.customquery.UserRepositoryCustom;
import com.example.hustle.document.User;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

//Impl postfix of the name on it compared to the core repository interface
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

//    @Autowired
//    MongoTemplate mongoTemplate;

    @Override
    public int updateDomain(String domain, boolean displayAds) {

//        Query query = new Query(Criteria.where("domain").is(domain));
//        Update update = new Update();
//        update.set("displayAds", displayAds);
//
//        UpdateResult result = mongoTemplate.updateFirst(query, update, User.class);

        return 0;

    }
}