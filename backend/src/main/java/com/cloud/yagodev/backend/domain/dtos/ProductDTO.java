package com.cloud.yagodev.backend.domain.dtos;

import com.cloud.yagodev.backend.domain.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {
    private Long id;

    @Size(min = 3, max = 80, message = "De 3 a 80 caracteres")
    @NotBlank(message = "Campo obrigatório")
    private String name;

    @Size(min = 10, message = "No minimo 10 caracteres")
    @NotBlank(message = "Campo obrigatório")
    private String description;

    @Positive(message = "Valores não ser negativo e nem 0")
    private Double price;
    private String imgUrl;

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product product) {
        id = product.getId();;
        name = product.getName();
        description = product.getDescription();
        price = product.getPrice();
        imgUrl = product.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
