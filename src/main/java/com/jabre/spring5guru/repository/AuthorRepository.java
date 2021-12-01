package com.jabre.spring5guru.repository;

import com.jabre.spring5guru.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Jabre
 * @created : 11/25/2021, Thursday
 **/
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
