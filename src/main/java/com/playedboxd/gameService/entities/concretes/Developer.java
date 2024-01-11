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
@Table(name = "developers")
public class Developer extends BaseEntity<Integer> {

    @Column(name = "developer_name")
    private String developerName;

    @OneToMany(mappedBy =  "", fetch = FetchType.LAZY)
    private List<Game> games;
}
