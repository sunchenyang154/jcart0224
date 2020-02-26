package io.scy.jacartadministrationback.controller;

import io.scy.jacartadministrationback.dto.in.ProductCreateInDTO;
import io.scy.jacartadministrationback.dto.in.ProductSearchInDTO;
import io.scy.jacartadministrationback.dto.in.ProductUpdateInDTO;
import io.scy.jacartadministrationback.dto.out.PageOutDTO;
import io.scy.jacartadministrationback.dto.out.ProductListOutDTO;
import io.scy.jacartadministrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }
}
