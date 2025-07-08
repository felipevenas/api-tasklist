package io.github.felipevenas.api_tasklist.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "task_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private Boolean checkbox;


}
