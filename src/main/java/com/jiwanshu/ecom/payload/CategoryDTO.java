package com.jiwanshu.ecom.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {

    @Schema(description = "Category Id")
    private Long categoryId;

    @Schema(description = "Name of Category")
    private String categoryName;
}
