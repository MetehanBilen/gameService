package com.playedboxd.gameService.entities.concretes;

import com.playedboxd.gameService.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "genres")
public class Genre extends BaseEntity<Integer> {

    @Column(name = "genre_name")
    private String genreName;

    @OneToMany(mappedBy =  "genre", fetch = FetchType.LAZY)
    private List<Game> games;
}
