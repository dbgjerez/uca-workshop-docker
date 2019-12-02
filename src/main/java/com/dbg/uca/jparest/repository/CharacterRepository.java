package com.dbg.uca.jparest.repository;

import com.dbg.uca.jparest.domain.Character;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CharacterRepository extends PagingAndSortingRepository<Character, Integer> {}
