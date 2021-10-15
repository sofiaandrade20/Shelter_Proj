package com.example.backendshelter.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

@Table(name="Feed")

public class Feed {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private LocalDateTime lunchTime;

    @OneToOne
    private Food food;

    @OneToOne
    private Pet pet;

}
