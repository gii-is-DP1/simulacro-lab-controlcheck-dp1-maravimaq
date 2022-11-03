package org.springframework.samples.petclinic.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProductType {
    Integer id;
    String name;
}
