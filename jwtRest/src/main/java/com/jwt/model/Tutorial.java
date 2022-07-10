package com.jwt.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tutorial")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
    @Column(name ="title")
    private String title;
    @Column(name ="description")
    private String description;
    @Column(name ="published")
    private boolean published;





}
