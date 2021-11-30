package com.jabre.spring5guru.repository;

import com.jabre.spring5guru.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Jabre
 * @created : 11/30/2021, Tuesday
 **/
@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
