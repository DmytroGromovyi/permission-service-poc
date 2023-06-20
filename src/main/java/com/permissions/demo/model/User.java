package com.permissions.demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "USER")
public class User extends AbstractEntity {
    private String name;
    @ManyToMany
    private List<Role> roles;
}
