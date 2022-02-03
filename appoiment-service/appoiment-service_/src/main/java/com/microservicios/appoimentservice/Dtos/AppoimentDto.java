package com.microservicios.appoimentservice.Dtos;

import com.microservicios.appoimentservice.entities.Base;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;



@Getter
@Setter
public class AppoimentDto extends Base implements Serializable {
    @Column(name = "appoimentreason")
    private String appoimentreason;

    @Column(name = "appoimentroom")
    private int appoimentroom;
/*
    @Column(name = "clientid")
    private int clientid;
*/
    @Column(name = "date")
    private int date;
    /*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_client")
    private Client client;
*/
    public AppoimentDto(String appoimentreason, int appoimentroom, int date) {
        this.appoimentreason = appoimentreason;
        this.appoimentroom = appoimentroom;
        this.date = date;

    }

    public AppoimentDto() {
    }
}
