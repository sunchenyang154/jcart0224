package io.scy.jacartadministrationback.controller;
import io.scy.jacartadministrationback.dto.in.*;
import io.scy.jacartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import io.scy.jacartadministrationback.dto.out.AdministratorListOutDTO;
import io.scy.jacartadministrationback.dto.out.AdministratorShowOutDTO;
import io.scy.jacartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {
    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){
        return  null;
    }

    @GetMapping("getProfile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer administratorId){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @GetMapping("/getpwdResetCode")
    public String getpwdResetCode(@RequestParam String email){
        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO adminstratorCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer administratorId){

    }

    @PostMapping("/batchdelete")
    public void batchdelete(@RequestBody List<Integer> administratorIds){

    }
}
