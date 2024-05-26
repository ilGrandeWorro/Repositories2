package com.worro.repositories2.programmingLanguages;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingLanguages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String languageName;

    private int firstAppereance;

    @Column(nullable = false)
    private String inventor;
}
