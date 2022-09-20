package com.perfomatix.training.todo.entity.audit;

import lombok.Data;

import java.time.ZonedDateTime;

/**
 * @author Thariq
 * @created 19-09-2022
 **/

@Data
public  abstract class AbstractBaseEntity {
    private ZonedDateTime createdDate;
    private ZonedDateTime modifiedDate;
    private Boolean isActive;
}
