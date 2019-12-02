package com.dbg.uca.jparest.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "characters")
public class Character {

  @Id public Integer id;
  @Column public String name;
}
