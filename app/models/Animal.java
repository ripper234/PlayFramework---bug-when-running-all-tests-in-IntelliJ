package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Animal extends Model {
    public int legs;
}
