package com.example.studentmanagement.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="name")
    private String Name;
    @Column(name="institution")
    private String Institution ;
@Column(name="email")
    private String Email;
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public String getName() {
    return Name;
}
public void setName(String name) {
    Name = name;
}
public String getInstitution() {
    return Institution;
}
public void setInstitution(String institution) {
    Institution = institution;
}
public String getEmail() {
    return Email;
}
public void setEmail(String email) {
    Email = email;
}

    
}
