package com.dbg.uca.jparest.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Character {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  @Column(unique = true)
  public String name;
}
