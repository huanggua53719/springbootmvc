package com.example.mvc.neo4j.repository;


import com.example.mvc.neo4j.entity.Actor;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends Neo4jRepository<Actor, Long>
{
}
