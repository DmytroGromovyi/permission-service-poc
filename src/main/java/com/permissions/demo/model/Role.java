package com.permissions.demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Role extends AbstractEntity {
    private String name;
    @ManyToMany
    private List<Permission> permissions;
}
