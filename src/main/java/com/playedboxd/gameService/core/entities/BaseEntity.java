package com.playedboxd.gameService.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@MappedSuperclass
public class BaseEntity<T> {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="id")
    private T id;
}
