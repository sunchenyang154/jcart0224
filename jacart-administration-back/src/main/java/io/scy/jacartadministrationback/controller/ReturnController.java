package io.scy.jacartadministrationback.controller;

import io.scy.jacartadministrationback.dto.in.ReturnSearchInDTO;
import io.scy.jacartadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.scy.jacartadministrationback.dto.out.PageOutDTO;
import io.scy.jacartadministrationback.dto.out.ReturnListOutDTO;
import io.scy.jacartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
