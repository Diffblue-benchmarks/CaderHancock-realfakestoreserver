package gq.cader.realfakestoreserver.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
class Email {

    @Id
    private String email;
}
