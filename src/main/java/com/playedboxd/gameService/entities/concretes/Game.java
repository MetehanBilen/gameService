package com.playedboxd.gameService.entities.concretes;

import com.playedboxd.gameService.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "games")
public class Game extends BaseEntity<Integer> {
    @Column(name ="title")
    private String title;

    @ManyToOne
    @JoinColumn(name="genre_id")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name= "developer_id")
    private Developer developer;

    @ManyToOne
    @JoinColumn(name="publisher_id")
    private Publisher publisher;

    @ManyToOne
    @JoinColumn(name="franchise_id")
    private Franchise franchise;


}
