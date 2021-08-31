package com.dio.live.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {
        private long idBancoHoras;
        private long idMovimento;
        private long idUsuario;
    }
    @Id
    @EmbeddedId
    private BancoHorasId bancoHorasId;
    private LocalDateTime dataTrabalhada;
    private BigDecimal horasTrabalhadas;
    private BigDecimal saldoHoras;


}
