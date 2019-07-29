package com.stackroute.muzixapp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Document(collection ="track")
public class Track {

    @Id
    int id;
    String name;
    String comment;

}
