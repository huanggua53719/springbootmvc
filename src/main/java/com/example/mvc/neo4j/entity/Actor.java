package com.example.mvc.neo4j.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Actor
{
    @Id
    @GeneratedValue
    Long id;
    String name;
    int born;

    public Actor()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBorn()
    {
        return born;
    }

    public void setBorn(int born)
    {
        this.born = born;
    }
}
