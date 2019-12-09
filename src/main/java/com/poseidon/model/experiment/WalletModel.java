package com.poseidon.model.experiment;

import com.poseidon.framework.annotation.Column;
import com.poseidon.framework.annotation.Comment;
import com.poseidon.framework.annotation.Model;
import com.poseidon.framework.annotation.PrimaryKey;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * Create by 2BKeyboard on 2019/12/9 10:35
 */
@Data
@Model("wallet")
public class WalletModel {

    @PrimaryKey
    @Column("int(11) not null")
    private Long id;

    @Column("decimal(10,3) not null")
    @Comment("金额")
    private BigDecimal amount;

}
